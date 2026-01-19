package com.ruoyi.system.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.domain.vo.BaseIccardRechargeVo;
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
import com.ruoyi.common.domain.BaseIccardRecharge;
import com.ruoyi.system.service.IBaseIccardRechargeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【 会员卡充值记录】Controller
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@RestController
@RequestMapping("/system/iccrecharge")
public class BaseIccardRechargeController extends BaseController
{
    @Autowired
    private IBaseIccardRechargeService baseIccardRechargeService;

    /**
     * 查询【会员卡充值记录】列表
     */
    @PreAuthorize("@ss.hasPermi('system:recharge:list')")
    @GetMapping("/list")
    public TableDataInfo list(BaseIccardRechargeVo baseIccardRecharge)
    {
        startPage();
        List<BaseIccardRechargeVo> list = baseIccardRechargeService.selectBaseIccardRechargeVoList(baseIccardRecharge);
        return getDataTable(list);
    }

    /**
     * 导出【 会员卡充值记录】列表
     */
    @PreAuthorize("@ss.hasPermi('system:recharge:export')")
    @Log(title = "【 会员卡充值记录】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response,BaseIccardRecharge baseIccardRecharge) throws UnsupportedEncodingException {
        List<BaseIccardRecharge> list = baseIccardRechargeService.selectBaseIccardRechargeList(baseIccardRecharge);
        ExcelUtil<BaseIccardRecharge> util = new ExcelUtil<>(BaseIccardRecharge.class);
        // 手动设置响应头，确保文件名正确
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-Disposition", "attachment;filename=" +
                URLEncoder.encode("会员卡充值明细", "UTF-8") + ".xls");
        util.exportExcel(response, list, "【会员卡充值记录】数据");
    }

    /**
     * 获取【 会员卡充值记录】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:recharge:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(baseIccardRechargeService.selectBaseIccardRechargeById(id));
    }

    /**
     * 新增【 会员卡充值记录】
     */
    @PreAuthorize("@ss.hasPermi('system:recharge:add')")
    @Log(title = "【 会员卡充值记录】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BaseIccardRecharge baseIccardRecharge)
    {
        return toAjax(baseIccardRechargeService.insertBaseIccardRecharge(baseIccardRecharge));
    }

    /**
     * 修改【 会员卡充值记录】
     */
    @PreAuthorize("@ss.hasPermi('system:recharge:edit')")
    @Log(title = "【 会员卡充值记录】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BaseIccardRecharge baseIccardRecharge)
    {
        return toAjax(baseIccardRechargeService.updateBaseIccardRecharge(baseIccardRecharge));
    }

    /**
     * 删除【 会员卡充值记录】
     */
    @PreAuthorize("@ss.hasPermi('system:recharge:remove')")
    @Log(title = "【 会员卡充值记录】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(baseIccardRechargeService.deleteBaseIccardRechargeByIds(ids));
    }
}
