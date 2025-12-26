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
import com.ruoyi.system.domain.BaseMachineMonitorRecharge;
import com.ruoyi.system.service.IBaseMachineMonitorRechargeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 监控续费充值记录Controller
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@RestController
@RequestMapping("/system/mmrecharge")
public class BaseMachineMonitorRechargeController extends BaseController
{
    @Autowired
    private IBaseMachineMonitorRechargeService baseMachineMonitorRechargeService;

    /**
     * 查询监控续费充值记录列表
     */
    @PreAuthorize("@ss.hasPermi('system:recharge:list')")
    @GetMapping("/list")
    public TableDataInfo list(BaseMachineMonitorRecharge baseMachineMonitorRecharge)
    {
        startPage();
        List<BaseMachineMonitorRecharge> list = baseMachineMonitorRechargeService.selectBaseMachineMonitorRechargeList(baseMachineMonitorRecharge);
        return getDataTable(list);
    }

    /**
     * 导出监控续费充值记录列表
     */
    @PreAuthorize("@ss.hasPermi('system:recharge:export')")
    @Log(title = "监控续费充值记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BaseMachineMonitorRecharge baseMachineMonitorRecharge)
    {
        List<BaseMachineMonitorRecharge> list = baseMachineMonitorRechargeService.selectBaseMachineMonitorRechargeList(baseMachineMonitorRecharge);
        ExcelUtil<BaseMachineMonitorRecharge> util = new ExcelUtil<BaseMachineMonitorRecharge>(BaseMachineMonitorRecharge.class);
        util.exportExcel(response, list, "监控续费充值记录数据");
    }

    /**
     * 获取监控续费充值记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:recharge:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(baseMachineMonitorRechargeService.selectBaseMachineMonitorRechargeById(id));
    }

    /**
     * 新增监控续费充值记录
     */
    @PreAuthorize("@ss.hasPermi('system:recharge:add')")
    @Log(title = "监控续费充值记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BaseMachineMonitorRecharge baseMachineMonitorRecharge)
    {
        return toAjax(baseMachineMonitorRechargeService.insertBaseMachineMonitorRecharge(baseMachineMonitorRecharge));
    }

    /**
     * 修改监控续费充值记录
     */
    @PreAuthorize("@ss.hasPermi('system:recharge:edit')")
    @Log(title = "监控续费充值记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BaseMachineMonitorRecharge baseMachineMonitorRecharge)
    {
        return toAjax(baseMachineMonitorRechargeService.updateBaseMachineMonitorRecharge(baseMachineMonitorRecharge));
    }

    /**
     * 删除监控续费充值记录
     */
    @PreAuthorize("@ss.hasPermi('system:recharge:remove')")
    @Log(title = "监控续费充值记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(baseMachineMonitorRechargeService.deleteBaseMachineMonitorRechargeByIds(ids));
    }
}
