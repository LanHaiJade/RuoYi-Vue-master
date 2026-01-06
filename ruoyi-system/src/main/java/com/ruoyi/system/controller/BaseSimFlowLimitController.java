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
import com.ruoyi.common.domain.BaseSimFlowLimit;
import com.ruoyi.system.service.IBaseSimFlowLimitService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@RestController
@RequestMapping("/system/simlimit")
public class BaseSimFlowLimitController extends BaseController
{
    @Autowired
    private IBaseSimFlowLimitService baseSimFlowLimitService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:limit:list')")
    @GetMapping("/list")
    public TableDataInfo list(BaseSimFlowLimit baseSimFlowLimit)
    {
        startPage();
        List<BaseSimFlowLimit> list = baseSimFlowLimitService.selectBaseSimFlowLimitList(baseSimFlowLimit);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:limit:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BaseSimFlowLimit baseSimFlowLimit)
    {
        List<BaseSimFlowLimit> list = baseSimFlowLimitService.selectBaseSimFlowLimitList(baseSimFlowLimit);
        ExcelUtil<BaseSimFlowLimit> util = new ExcelUtil<BaseSimFlowLimit>(BaseSimFlowLimit.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:limit:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(baseSimFlowLimitService.selectBaseSimFlowLimitById(id));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:limit:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BaseSimFlowLimit baseSimFlowLimit)
    {
        return toAjax(baseSimFlowLimitService.insertBaseSimFlowLimit(baseSimFlowLimit));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:limit:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BaseSimFlowLimit baseSimFlowLimit)
    {
        return toAjax(baseSimFlowLimitService.updateBaseSimFlowLimit(baseSimFlowLimit));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:limit:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(baseSimFlowLimitService.deleteBaseSimFlowLimitByIds(ids));
    }
}
