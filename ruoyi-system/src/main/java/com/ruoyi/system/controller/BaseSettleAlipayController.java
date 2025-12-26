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
import com.ruoyi.system.domain.BaseSettleAlipay;
import com.ruoyi.system.service.IBaseSettleAlipayService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@RestController
@RequestMapping("/system/settalipay")
public class BaseSettleAlipayController extends BaseController
{
    @Autowired
    private IBaseSettleAlipayService baseSettleAlipayService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:alipay:list')")
    @GetMapping("/list")
    public TableDataInfo list(BaseSettleAlipay baseSettleAlipay)
    {
        startPage();
        List<BaseSettleAlipay> list = baseSettleAlipayService.selectBaseSettleAlipayList(baseSettleAlipay);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:alipay:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BaseSettleAlipay baseSettleAlipay)
    {
        List<BaseSettleAlipay> list = baseSettleAlipayService.selectBaseSettleAlipayList(baseSettleAlipay);
        ExcelUtil<BaseSettleAlipay> util = new ExcelUtil<BaseSettleAlipay>(BaseSettleAlipay.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:alipay:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(baseSettleAlipayService.selectBaseSettleAlipayById(id));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:alipay:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BaseSettleAlipay baseSettleAlipay)
    {
        return toAjax(baseSettleAlipayService.insertBaseSettleAlipay(baseSettleAlipay));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:alipay:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BaseSettleAlipay baseSettleAlipay)
    {
        return toAjax(baseSettleAlipayService.updateBaseSettleAlipay(baseSettleAlipay));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:alipay:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(baseSettleAlipayService.deleteBaseSettleAlipayByIds(ids));
    }
}
