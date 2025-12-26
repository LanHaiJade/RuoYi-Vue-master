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
import com.ruoyi.system.domain.BaseMachineParams;
import com.ruoyi.system.service.IBaseMachineParamsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 设备参数Controller
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@RestController
@RequestMapping("/system/mparams")
public class BaseMachineParamsController extends BaseController
{
    @Autowired
    private IBaseMachineParamsService baseMachineParamsService;

    /**
     * 查询设备参数列表
     */
    @PreAuthorize("@ss.hasPermi('system:params:list')")
    @GetMapping("/list")
    public TableDataInfo list(BaseMachineParams baseMachineParams)
    {
        startPage();
        List<BaseMachineParams> list = baseMachineParamsService.selectBaseMachineParamsList(baseMachineParams);
        return getDataTable(list);
    }

    /**
     * 导出设备参数列表
     */
    @PreAuthorize("@ss.hasPermi('system:params:export')")
    @Log(title = "设备参数", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BaseMachineParams baseMachineParams)
    {
        List<BaseMachineParams> list = baseMachineParamsService.selectBaseMachineParamsList(baseMachineParams);
        ExcelUtil<BaseMachineParams> util = new ExcelUtil<BaseMachineParams>(BaseMachineParams.class);
        util.exportExcel(response, list, "设备参数数据");
    }

    /**
     * 获取设备参数详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:params:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(baseMachineParamsService.selectBaseMachineParamsById(id));
    }

    /**
     * 新增设备参数
     */
    @PreAuthorize("@ss.hasPermi('system:params:add')")
    @Log(title = "设备参数", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BaseMachineParams baseMachineParams)
    {
        return toAjax(baseMachineParamsService.insertBaseMachineParams(baseMachineParams));
    }

    /**
     * 修改设备参数
     */
    @PreAuthorize("@ss.hasPermi('system:params:edit')")
    @Log(title = "设备参数", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BaseMachineParams baseMachineParams)
    {
        return toAjax(baseMachineParamsService.updateBaseMachineParams(baseMachineParams));
    }

    /**
     * 删除设备参数
     */
    @PreAuthorize("@ss.hasPermi('system:params:remove')")
    @Log(title = "设备参数", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(baseMachineParamsService.deleteBaseMachineParamsByIds(ids));
    }
}
