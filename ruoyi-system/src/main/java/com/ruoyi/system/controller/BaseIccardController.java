package com.ruoyi.system.controller;


import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.ruoyi.common.domain.dto.RechargeIcDto;
import com.ruoyi.common.domain.vo.BaseIccardVo;
import com.ruoyi.common.utils.sm.ExcelExportUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpRequest;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.domain.BaseIccard;
import com.ruoyi.system.service.IBaseIccardService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2025-12-24
 */
@RestController
@RequestMapping("/system/iccard")
@Api("会员卡管理")
public class BaseIccardController extends BaseController {
    @Autowired
    private IBaseIccardService baseIccardService;

    /**
     * 查询【会员卡】列表
     */
    @ApiOperation("获取会员卡列表")
    @PreAuthorize("@ss.hasPermi('system:iccard:list')")
    @GetMapping("/list")
    public TableDataInfo list(BaseIccard baseIccard) {
        startPage();
        List<BaseIccard> list = baseIccardService.selectBaseIccardList(baseIccard);
        return getDataTable(list);
    }

    /**
     * 导出【会员卡】列表
     */
    @PreAuthorize("@ss.hasPermi('system:iccard:export')")
    @Log(title = "【导出会员卡】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response,BaseIccardVo baseIccardVo) throws UnsupportedEncodingException {
        List<BaseIccard> list = baseIccardService.selectBaseIccardListNoPage(baseIccardVo);
        ExcelUtil<BaseIccard> util = new ExcelUtil<>(BaseIccard.class);
        // 手动设置响应头，确保文件名正确
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-Disposition", "attachment;filename=" +
                URLEncoder.encode("会员卡列表", "UTF-8") + ".xls");
        util.exportExcel(response, list, "【导出会员卡列表】数据");
    }

    /**
     * 获取【会员卡】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:iccard:makeupIc')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return success(baseIccardService.selectBaseIccardById(id));
    }

    /**
     * 补卡
     */
    @PreAuthorize("@ss.hasPermi('system:iccard:makeupIc')")
    @PostMapping(value = "/makeupIc")
    public AjaxResult makeupIc(@RequestBody BaseIccard baseIccard) {
        String makeupIc = baseIccardService.makeupIc(baseIccard);
        if (makeupIc.equals("补卡成功")) {
            return success(makeupIc);
        }
        return error(makeupIc);
    }

    /**
     * 【开卡】
     */
    @PreAuthorize("@ss.hasPermi('system:iccard:add')")
    @Log(title = "【开卡】", businessType = BusinessType.INSERT)
    @PostMapping("/openIc")
    public AjaxResult add(@RequestBody BaseIccard baseIccard) {
        String inserted = baseIccardService.insertBaseIccard(baseIccard);
        if (inserted.equals("开卡成功")) {
            return success(inserted);
        }
        return error(inserted);
    }

    /**
     * 修改【会员卡】
     */
    @PreAuthorize("@ss.hasPermi('system:iccard:edit')")
    @Log(title = "【修改会员卡】", businessType = BusinessType.UPDATE)
    @PutMapping("/editIc")
    public AjaxResult edit(@RequestBody BaseIccard baseIccard) {
        String updateBaseIccard = baseIccardService.updateBaseIccard(baseIccard);
        if (updateBaseIccard.equals("修改成功")) {
            return success(updateBaseIccard);
        }
        return error(updateBaseIccard);
    }

    /**
     * 修改【会员卡状态】
     */
    @PreAuthorize("@ss.hasPermi('system:iccard:editStatus')")
    @Log(title = "【修改会员卡状态】", businessType = BusinessType.UPDATE)
    @PutMapping("/editStatus")
    public AjaxResult editStatus(@RequestBody RechargeIcDto rechargeIcDto) {
        String updateBaseIccard = baseIccardService.editStatus(rechargeIcDto);
        if (updateBaseIccard.equals("修改成功")) {
            return success(updateBaseIccard);
        }
        return error(updateBaseIccard);
    }

    /**
     * 删除【会员卡】
     */
    @PreAuthorize("@ss.hasPermi('system:iccard:remove')")
    @Log(title = "【删除会员卡】", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(baseIccardService.deleteBaseIccardByIds(ids));
    }


    /**
     * 会员卡充值
     */
    @PreAuthorize("@ss.hasPermi('system:iccard:rechargeIc')")
    @Log(title = "【会员卡充值】", businessType = BusinessType.INSERT)
    @PostMapping("/rechargeIc")
    public AjaxResult rechargeIc(@RequestBody RechargeIcDto rechargeIcDto) {
        String rechargeIc = baseIccardService.rechargeIc(rechargeIcDto);
        if ("充值成功".equals(rechargeIc)) {
            return success(rechargeIc);
        }
        return error(rechargeIc);
    }

    /**
     * 导入Excel
     */
    @PreAuthorize("@ss.hasPermi('system:iccard:importExcel')")
    @Log(title = "【导入会员卡】", businessType = BusinessType.INSERT)
    @PostMapping("/import")
    public AjaxResult importExcel(@RequestParam("file") MultipartFile file,
                                  @RequestParam("userId") Long userId) {
        // 检查文件
        if (file.isEmpty()) {
            return AjaxResult.error("请选择要导入的文件");
        }
        // 检查文件类型
        String fileName = file.getOriginalFilename();
        if (fileName != null && !fileName.toLowerCase().endsWith(".xlsx") &&
                !fileName.toLowerCase().endsWith(".xls")) {
            return AjaxResult.error("只支持Excel文件(.xlsx, .xls)");
        }
        // 执行导入
        return AjaxResult.success(baseIccardService.importCardsFromExcel(file, userId));
    }


    /**
     * 下载IC卡导入模板
     */
    @PostMapping("/downloadTemplate")
    @PreAuthorize("@ss.hasPermi('system:iccard:downloadExcel')") // 如果需要权限控制
    public void downloadTemplate(HttpServletResponse response) {
        try {
            // 生成Excel文件
            byte[] excelData = ExcelExportUtil.generateIccardImportTemplate();

            // 设置响应头
            response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
            response.setHeader("Content-Disposition", "attachment; filename=ImportCard.xlsx");

            // 写入响应流
            OutputStream outputStream = response.getOutputStream();
            outputStream.write(excelData);
            outputStream.flush();
            outputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("下载模板失败");
        }
    }






}
