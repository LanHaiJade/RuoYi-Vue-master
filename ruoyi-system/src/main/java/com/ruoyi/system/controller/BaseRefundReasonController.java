package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
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
import com.ruoyi.system.domain.BaseRefundReason;
import com.ruoyi.system.service.IBaseRefundReasonService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 退款原因Controller
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@RestController
@RequestMapping("/system/refreason")
public class BaseRefundReasonController extends BaseController
{
    @Autowired
    private IBaseRefundReasonService baseRefundReasonService;

    /**
     * 查询退款原因列表
     */
    @PreAuthorize("@ss.hasPermi('system:reason:list')")
    @GetMapping("/list")
    public TableDataInfo list(BaseRefundReason baseRefundReason)
    {
        startPage();
        List<BaseRefundReason> list = baseRefundReasonService.selectBaseRefundReasonList(baseRefundReason);
        return getDataTable(list);
    }

    /**
     * 导出退款原因列表
     */
    @PreAuthorize("@ss.hasPermi('system:reason:export')")
    @Log(title = "退款原因", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BaseRefundReason baseRefundReason)
    {
        List<BaseRefundReason> list = baseRefundReasonService.selectBaseRefundReasonList(baseRefundReason);
        ExcelUtil<BaseRefundReason> util = new ExcelUtil<BaseRefundReason>(BaseRefundReason.class);
        util.exportExcel(response, list, "退款原因数据");
    }

    /**
     * 获取退款原因详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:reason:query')")
    @GetMapping(value = "/{baseRefundReasonId}")
    public AjaxResult getInfo(@PathVariable("baseRefundReasonId") String baseRefundReasonId)
    {
        return success(baseRefundReasonService.selectBaseRefundReasonByBaseRefundReasonId(baseRefundReasonId));
    }

    /**
     * 新增退款原因
     */
    @PreAuthorize("@ss.hasPermi('system:reason:add')")
    @Log(title = "退款原因", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BaseRefundReason baseRefundReason)
    {
        return toAjax(baseRefundReasonService.insertBaseRefundReason(baseRefundReason));
    }

    /**
     * 修改退款原因
     */
    @PreAuthorize("@ss.hasPermi('system:reason:edit')")
    @Log(title = "退款原因", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BaseRefundReason baseRefundReason)
    {
        return toAjax(baseRefundReasonService.updateBaseRefundReason(baseRefundReason));
    }

    /**
     * 删除退款原因
     */
    @PreAuthorize("@ss.hasPermi('system:reason:remove')")
    @Log(title = "退款原因", businessType = BusinessType.DELETE)
	@DeleteMapping("/{baseRefundReasonIds}")
    public AjaxResult remove(@PathVariable String[] baseRefundReasonIds)
    {
        return toAjax(baseRefundReasonService.deleteBaseRefundReasonByBaseRefundReasonIds(baseRefundReasonIds));
    }
}
