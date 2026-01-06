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
import com.ruoyi.common.domain.BaseGoodsDiscount;
import com.ruoyi.system.service.IBaseGoodsDiscountService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 商品优惠Controller
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@RestController
@RequestMapping("/system/gdiscount")
public class BaseGoodsDiscountController extends BaseController
{
    @Autowired
    private IBaseGoodsDiscountService baseGoodsDiscountService;

    /**
     * 查询商品优惠列表
     */
    @PreAuthorize("@ss.hasPermi('system:discount:list')")
    @GetMapping("/list")
    public TableDataInfo list(BaseGoodsDiscount baseGoodsDiscount)
    {
        startPage();
        List<BaseGoodsDiscount> list = baseGoodsDiscountService.selectBaseGoodsDiscountList(baseGoodsDiscount);
        return getDataTable(list);
    }

    /**
     * 导出商品优惠列表
     */
    @PreAuthorize("@ss.hasPermi('system:discount:export')")
    @Log(title = "商品优惠", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BaseGoodsDiscount baseGoodsDiscount)
    {
        List<BaseGoodsDiscount> list = baseGoodsDiscountService.selectBaseGoodsDiscountList(baseGoodsDiscount);
        ExcelUtil<BaseGoodsDiscount> util = new ExcelUtil<BaseGoodsDiscount>(BaseGoodsDiscount.class);
        util.exportExcel(response, list, "商品优惠数据");
    }

    /**
     * 获取商品优惠详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:discount:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(baseGoodsDiscountService.selectBaseGoodsDiscountById(id));
    }

    /**
     * 新增商品优惠
     */
    @PreAuthorize("@ss.hasPermi('system:discount:add')")
    @Log(title = "商品优惠", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BaseGoodsDiscount baseGoodsDiscount)
    {
        return toAjax(baseGoodsDiscountService.insertBaseGoodsDiscount(baseGoodsDiscount));
    }

    /**
     * 修改商品优惠
     */
    @PreAuthorize("@ss.hasPermi('system:discount:edit')")
    @Log(title = "商品优惠", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BaseGoodsDiscount baseGoodsDiscount)
    {
        return toAjax(baseGoodsDiscountService.updateBaseGoodsDiscount(baseGoodsDiscount));
    }

    /**
     * 删除商品优惠
     */
    @PreAuthorize("@ss.hasPermi('system:discount:remove')")
    @Log(title = "商品优惠", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(baseGoodsDiscountService.deleteBaseGoodsDiscountByIds(ids));
    }
}
