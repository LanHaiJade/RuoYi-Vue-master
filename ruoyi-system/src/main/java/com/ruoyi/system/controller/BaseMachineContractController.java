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
import com.ruoyi.system.domain.BaseMachineContract;
import com.ruoyi.system.service.IBaseMachineContractService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 合约机信息Controller
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@RestController
@RequestMapping("/system/mcontract")
public class BaseMachineContractController extends BaseController
{
    @Autowired
    private IBaseMachineContractService baseMachineContractService;

    /**
     * 查询合约机信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:contract:list')")
    @GetMapping("/list")
    public TableDataInfo list(BaseMachineContract baseMachineContract)
    {
        startPage();
        List<BaseMachineContract> list = baseMachineContractService.selectBaseMachineContractList(baseMachineContract);
        return getDataTable(list);
    }

    /**
     * 导出合约机信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:contract:export')")
    @Log(title = "合约机信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BaseMachineContract baseMachineContract)
    {
        List<BaseMachineContract> list = baseMachineContractService.selectBaseMachineContractList(baseMachineContract);
        ExcelUtil<BaseMachineContract> util = new ExcelUtil<BaseMachineContract>(BaseMachineContract.class);
        util.exportExcel(response, list, "合约机信息数据");
    }

    /**
     * 获取合约机信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:contract:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(baseMachineContractService.selectBaseMachineContractById(id));
    }

    /**
     * 新增合约机信息
     */
    @PreAuthorize("@ss.hasPermi('system:contract:add')")
    @Log(title = "合约机信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BaseMachineContract baseMachineContract)
    {
        return toAjax(baseMachineContractService.insertBaseMachineContract(baseMachineContract));
    }

    /**
     * 修改合约机信息
     */
    @PreAuthorize("@ss.hasPermi('system:contract:edit')")
    @Log(title = "合约机信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BaseMachineContract baseMachineContract)
    {
        return toAjax(baseMachineContractService.updateBaseMachineContract(baseMachineContract));
    }

    /**
     * 删除合约机信息
     */
    @PreAuthorize("@ss.hasPermi('system:contract:remove')")
    @Log(title = "合约机信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(baseMachineContractService.deleteBaseMachineContractByIds(ids));
    }
}
