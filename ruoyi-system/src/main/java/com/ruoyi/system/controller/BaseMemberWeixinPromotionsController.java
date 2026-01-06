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
import com.ruoyi.common.domain.BaseMemberWeixinPromotions;
import com.ruoyi.system.service.IBaseMemberWeixinPromotionsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@RestController
@RequestMapping("/system/mwpromotions")
public class BaseMemberWeixinPromotionsController extends BaseController
{
    @Autowired
    private IBaseMemberWeixinPromotionsService baseMemberWeixinPromotionsService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:promotions:list')")
    @GetMapping("/list")
    public TableDataInfo list(BaseMemberWeixinPromotions baseMemberWeixinPromotions)
    {
        startPage();
        List<BaseMemberWeixinPromotions> list = baseMemberWeixinPromotionsService.selectBaseMemberWeixinPromotionsList(baseMemberWeixinPromotions);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:promotions:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BaseMemberWeixinPromotions baseMemberWeixinPromotions)
    {
        List<BaseMemberWeixinPromotions> list = baseMemberWeixinPromotionsService.selectBaseMemberWeixinPromotionsList(baseMemberWeixinPromotions);
        ExcelUtil<BaseMemberWeixinPromotions> util = new ExcelUtil<BaseMemberWeixinPromotions>(BaseMemberWeixinPromotions.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:promotions:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return success(baseMemberWeixinPromotionsService.selectBaseMemberWeixinPromotionsById(id));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:promotions:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BaseMemberWeixinPromotions baseMemberWeixinPromotions)
    {
        return toAjax(baseMemberWeixinPromotionsService.insertBaseMemberWeixinPromotions(baseMemberWeixinPromotions));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:promotions:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BaseMemberWeixinPromotions baseMemberWeixinPromotions)
    {
        return toAjax(baseMemberWeixinPromotionsService.updateBaseMemberWeixinPromotions(baseMemberWeixinPromotions));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:promotions:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(baseMemberWeixinPromotionsService.deleteBaseMemberWeixinPromotionsByIds(ids));
    }
}
