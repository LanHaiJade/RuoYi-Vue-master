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
import com.ruoyi.system.domain.Goodscategory;
import com.ruoyi.system.service.IGoodscategoryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 商品分类Controller
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@RestController
@RequestMapping("/system/goodscategory")
public class GoodscategoryController extends BaseController
{
    @Autowired
    private IGoodscategoryService goodscategoryService;

    /**
     * 查询商品分类列表
     */
    @PreAuthorize("@ss.hasPermi('system:goodscategory:list')")
    @GetMapping("/list")
    public TableDataInfo list(Goodscategory goodscategory)
    {
        startPage();
        List<Goodscategory> list = goodscategoryService.selectGoodscategoryList(goodscategory);
        return getDataTable(list);
    }

    /**
     * 导出商品分类列表
     */
    @PreAuthorize("@ss.hasPermi('system:goodscategory:export')")
    @Log(title = "商品分类", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Goodscategory goodscategory)
    {
        List<Goodscategory> list = goodscategoryService.selectGoodscategoryList(goodscategory);
        ExcelUtil<Goodscategory> util = new ExcelUtil<Goodscategory>(Goodscategory.class);
        util.exportExcel(response, list, "商品分类数据");
    }

    /**
     * 获取商品分类详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:goodscategory:query')")
    @GetMapping(value = "/{categoryid}")
    public AjaxResult getInfo(@PathVariable("categoryid") String categoryid)
    {
        return success(goodscategoryService.selectGoodscategoryByCategoryid(categoryid));
    }

    /**
     * 新增商品分类
     */
    @PreAuthorize("@ss.hasPermi('system:goodscategory:add')")
    @Log(title = "商品分类", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Goodscategory goodscategory)
    {
        return toAjax(goodscategoryService.insertGoodscategory(goodscategory));
    }

    /**
     * 修改商品分类
     */
    @PreAuthorize("@ss.hasPermi('system:goodscategory:edit')")
    @Log(title = "商品分类", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Goodscategory goodscategory)
    {
        return toAjax(goodscategoryService.updateGoodscategory(goodscategory));
    }

    /**
     * 删除商品分类
     */
    @PreAuthorize("@ss.hasPermi('system:goodscategory:remove')")
    @Log(title = "商品分类", businessType = BusinessType.DELETE)
	@DeleteMapping("/{categoryids}")
    public AjaxResult remove(@PathVariable String[] categoryids)
    {
        return toAjax(goodscategoryService.deleteGoodscategoryByCategoryids(categoryids));
    }
}
