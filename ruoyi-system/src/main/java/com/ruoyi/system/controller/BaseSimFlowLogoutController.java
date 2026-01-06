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
import com.ruoyi.common.domain.BaseSimFlowLogout;
import com.ruoyi.system.service.IBaseSimFlowLogoutService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@RestController
@RequestMapping("/system/simlogout")
public class BaseSimFlowLogoutController extends BaseController
{
    @Autowired
    private IBaseSimFlowLogoutService baseSimFlowLogoutService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:logout:list')")
    @GetMapping("/list")
    public TableDataInfo list(BaseSimFlowLogout baseSimFlowLogout)
    {
        startPage();
        List<BaseSimFlowLogout> list = baseSimFlowLogoutService.selectBaseSimFlowLogoutList(baseSimFlowLogout);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:logout:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BaseSimFlowLogout baseSimFlowLogout)
    {
        List<BaseSimFlowLogout> list = baseSimFlowLogoutService.selectBaseSimFlowLogoutList(baseSimFlowLogout);
        ExcelUtil<BaseSimFlowLogout> util = new ExcelUtil<BaseSimFlowLogout>(BaseSimFlowLogout.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:logout:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(baseSimFlowLogoutService.selectBaseSimFlowLogoutById(id));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:logout:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BaseSimFlowLogout baseSimFlowLogout)
    {
        return toAjax(baseSimFlowLogoutService.insertBaseSimFlowLogout(baseSimFlowLogout));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:logout:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BaseSimFlowLogout baseSimFlowLogout)
    {
        return toAjax(baseSimFlowLogoutService.updateBaseSimFlowLogout(baseSimFlowLogout));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:logout:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(baseSimFlowLogoutService.deleteBaseSimFlowLogoutByIds(ids));
    }
}
