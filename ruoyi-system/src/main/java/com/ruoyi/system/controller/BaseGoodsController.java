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
import com.ruoyi.common.domain.BaseGoods;
import com.ruoyi.system.service.IBaseGoodsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【我的商品】Controller
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@RestController
@RequestMapping("/system/goods")
public class BaseGoodsController extends BaseController
{
    @Autowired
    private IBaseGoodsService baseGoodsService;

    /**
     * 查询【我的商品】列表
     */
    @PreAuthorize("@ss.hasPermi('system:goods:list')")
    @GetMapping("/list")
    public TableDataInfo list(BaseGoods baseGoods)
    {
        startPage();
        List<BaseGoods> list = baseGoodsService.selectBaseGoodsList(baseGoods);
        return getDataTable(list);
    }

    /**
     * 导出【我的商品】列表
     */
    @PreAuthorize("@ss.hasPermi('system:goods:export')")
    @Log(title = "【我的商品】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BaseGoods baseGoods)
    {
        List<BaseGoods> list = baseGoodsService.selectBaseGoodsList(baseGoods);
        ExcelUtil<BaseGoods> util = new ExcelUtil<BaseGoods>(BaseGoods.class);
        util.exportExcel(response, list, "【我的商品】数据");
    }

    /**
     * 获取【我的商品】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:goods:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(baseGoodsService.selectBaseGoodsById(id));
    }

    /**
     * 新增【我的商品】
     */
    @PreAuthorize("@ss.hasPermi('system:goods:add')")
    @Log(title = "【我的商品】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BaseGoods baseGoods)
    {
        return toAjax(baseGoodsService.insertBaseGoods(baseGoods));
    }

    /**
     * 修改【我的商品】
     */
    @PreAuthorize("@ss.hasPermi('system:goods:edit')")
    @Log(title = "【我的商品】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BaseGoods baseGoods)
    {
        return toAjax(baseGoodsService.updateBaseGoods(baseGoods));
    }

    /**
     * 删除【我的商品】
     */
    @PreAuthorize("@ss.hasPermi('system:goods:remove')")
    @Log(title = "【我的商品】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(baseGoodsService.deleteBaseGoodsByIds(ids));
    }
}
