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
import com.ruoyi.common.domain.BaseMemberWeixinRisk;
import com.ruoyi.system.service.IBaseMemberWeixinRiskService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@RestController
@RequestMapping("/system/mwrisk")
public class BaseMemberWeixinRiskController extends BaseController
{
    @Autowired
    private IBaseMemberWeixinRiskService baseMemberWeixinRiskService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:risk:list')")
    @GetMapping("/list")
    public TableDataInfo list(BaseMemberWeixinRisk baseMemberWeixinRisk)
    {
        startPage();
        List<BaseMemberWeixinRisk> list = baseMemberWeixinRiskService.selectBaseMemberWeixinRiskList(baseMemberWeixinRisk);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:risk:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BaseMemberWeixinRisk baseMemberWeixinRisk)
    {
        List<BaseMemberWeixinRisk> list = baseMemberWeixinRiskService.selectBaseMemberWeixinRiskList(baseMemberWeixinRisk);
        ExcelUtil<BaseMemberWeixinRisk> util = new ExcelUtil<BaseMemberWeixinRisk>(BaseMemberWeixinRisk.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:risk:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return success(baseMemberWeixinRiskService.selectBaseMemberWeixinRiskById(id));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:risk:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BaseMemberWeixinRisk baseMemberWeixinRisk)
    {
        return toAjax(baseMemberWeixinRiskService.insertBaseMemberWeixinRisk(baseMemberWeixinRisk));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:risk:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BaseMemberWeixinRisk baseMemberWeixinRisk)
    {
        return toAjax(baseMemberWeixinRiskService.updateBaseMemberWeixinRisk(baseMemberWeixinRisk));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:risk:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(baseMemberWeixinRiskService.deleteBaseMemberWeixinRiskByIds(ids));
    }
}
