package com.ruoyi.system.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.domain.vo.BaseIccardrerecordVo;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.domain.BaseIccardrerecord;
import com.ruoyi.system.service.IBaseIccardrerecordService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【 会员卡操作记录】Controller
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@RestController
@RequestMapping("/system/iccardrerecord")
public class BaseIccardrerecordController extends BaseController
{
    @Autowired
    private IBaseIccardrerecordService baseIccardrerecordService;

    /**
     * 查询【 会员卡操作记录】列表
     */
    @PreAuthorize("@ss.hasPermi('system:iccardrerecord:list')")
    @GetMapping("/list")
    public TableDataInfo list(BaseIccardrerecordVo baseIccardrerecordVo)
    {
        startPage();
        List<BaseIccardrerecordVo> list = baseIccardrerecordService.selectBaseIccardrerecordVoList(baseIccardrerecordVo);
        return getDataTable(list);
    }

    /**
     * 导出【 会员卡操作记录】列表
     */
    @PreAuthorize("@ss.hasPermi('system:iccardrerecord:export')")
    @Log(title = "【 会员卡操作记录】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BaseIccardrerecord baseIccardrerecord) throws UnsupportedEncodingException {
        List<BaseIccardrerecord> list = baseIccardrerecordService.selectBaseIccardrerecordList(baseIccardrerecord);
        ExcelUtil<BaseIccardrerecord> util = new ExcelUtil<>(BaseIccardrerecord.class);
        // 手动设置响应头，确保文件名正确
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-Disposition", "attachment;filename=" +
                URLEncoder.encode("会员卡操作明细", "UTF-8") + ".xls");
        util.exportExcel(response, list, "【 会员卡操作记录】数据");
    }

    /**
     * 获取【 会员卡操作记录】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:iccardrerecord:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(baseIccardrerecordService.selectBaseIccardrerecordById(id));
    }

    /**
     * 新增【 会员卡操作记录】
     */
    @PreAuthorize("@ss.hasPermi('system:iccardrerecord:add')")
    @Log(title = "【 会员卡操作记录】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BaseIccardrerecord baseIccardrerecord)
    {
        return toAjax(baseIccardrerecordService.insertBaseIccardrerecord(baseIccardrerecord));
    }

    /**
     * 修改【 会员卡操作记录】
     */
    @PreAuthorize("@ss.hasPermi('system:iccardrerecord:edit')")
    @Log(title = "【 会员卡操作记录】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BaseIccardrerecord baseIccardrerecord)
    {
        return toAjax(baseIccardrerecordService.updateBaseIccardrerecord(baseIccardrerecord));
    }

    /**
     * 删除【 会员卡操作记录】
     */
    @PreAuthorize("@ss.hasPermi('system:iccardrerecord:remove')")
    @Log(title = "【 会员卡操作记录】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(baseIccardrerecordService.deleteBaseIccardrerecordByIds(ids));
    }
}
