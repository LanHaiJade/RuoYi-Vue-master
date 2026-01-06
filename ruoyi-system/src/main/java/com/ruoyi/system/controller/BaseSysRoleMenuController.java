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
import com.ruoyi.common.domain.BaseSysRoleMenu;
import com.ruoyi.system.service.IBaseSysRoleMenuService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@RestController
@RequestMapping("/system/smrolmenu")
public class BaseSysRoleMenuController extends BaseController
{
    @Autowired
    private IBaseSysRoleMenuService baseSysRoleMenuService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:menu:list')")
    @GetMapping("/list")
    public TableDataInfo list(BaseSysRoleMenu baseSysRoleMenu)
    {
        startPage();
        List<BaseSysRoleMenu> list = baseSysRoleMenuService.selectBaseSysRoleMenuList(baseSysRoleMenu);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:menu:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BaseSysRoleMenu baseSysRoleMenu)
    {
        List<BaseSysRoleMenu> list = baseSysRoleMenuService.selectBaseSysRoleMenuList(baseSysRoleMenu);
        ExcelUtil<BaseSysRoleMenu> util = new ExcelUtil<BaseSysRoleMenu>(BaseSysRoleMenu.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:menu:query')")
    @GetMapping(value = "/{roleId}")
    public AjaxResult getInfo(@PathVariable("roleId") Long roleId)
    {
        return success(baseSysRoleMenuService.selectBaseSysRoleMenuByRoleId(roleId));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:menu:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BaseSysRoleMenu baseSysRoleMenu)
    {
        return toAjax(baseSysRoleMenuService.insertBaseSysRoleMenu(baseSysRoleMenu));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:menu:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BaseSysRoleMenu baseSysRoleMenu)
    {
        return toAjax(baseSysRoleMenuService.updateBaseSysRoleMenu(baseSysRoleMenu));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:menu:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{roleIds}")
    public AjaxResult remove(@PathVariable Long[] roleIds)
    {
        return toAjax(baseSysRoleMenuService.deleteBaseSysRoleMenuByRoleIds(roleIds));
    }
}
