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
import com.ruoyi.common.domain.BaseMachineFaceNum;
import com.ruoyi.system.service.IBaseMachineFaceNumService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@RestController
@RequestMapping("/system/mfnum")
public class BaseMachineFaceNumController extends BaseController
{
    @Autowired
    private IBaseMachineFaceNumService baseMachineFaceNumService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:num:list')")
    @GetMapping("/list")
    public TableDataInfo list(BaseMachineFaceNum baseMachineFaceNum)
    {
        startPage();
        List<BaseMachineFaceNum> list = baseMachineFaceNumService.selectBaseMachineFaceNumList(baseMachineFaceNum);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:num:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BaseMachineFaceNum baseMachineFaceNum)
    {
        List<BaseMachineFaceNum> list = baseMachineFaceNumService.selectBaseMachineFaceNumList(baseMachineFaceNum);
        ExcelUtil<BaseMachineFaceNum> util = new ExcelUtil<BaseMachineFaceNum>(BaseMachineFaceNum.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:num:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return success(baseMachineFaceNumService.selectBaseMachineFaceNumById(id));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:num:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BaseMachineFaceNum baseMachineFaceNum)
    {
        return toAjax(baseMachineFaceNumService.insertBaseMachineFaceNum(baseMachineFaceNum));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:num:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BaseMachineFaceNum baseMachineFaceNum)
    {
        return toAjax(baseMachineFaceNumService.updateBaseMachineFaceNum(baseMachineFaceNum));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:num:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(baseMachineFaceNumService.deleteBaseMachineFaceNumByIds(ids));
    }
}
