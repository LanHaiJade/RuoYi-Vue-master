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
import com.ruoyi.system.domain.BaseInternalMessageUser;
import com.ruoyi.system.service.IBaseInternalMessageUserService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 站内信用户映射Controller
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@RestController
@RequestMapping("/system/imuser")
public class BaseInternalMessageUserController extends BaseController
{
    @Autowired
    private IBaseInternalMessageUserService baseInternalMessageUserService;

    /**
     * 查询站内信用户映射列表
     */
    @PreAuthorize("@ss.hasPermi('system:user:list')")
    @GetMapping("/list")
    public TableDataInfo list(BaseInternalMessageUser baseInternalMessageUser)
    {
        startPage();
        List<BaseInternalMessageUser> list = baseInternalMessageUserService.selectBaseInternalMessageUserList(baseInternalMessageUser);
        return getDataTable(list);
    }

    /**
     * 导出站内信用户映射列表
     */
    @PreAuthorize("@ss.hasPermi('system:user:export')")
    @Log(title = "站内信用户映射", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BaseInternalMessageUser baseInternalMessageUser)
    {
        List<BaseInternalMessageUser> list = baseInternalMessageUserService.selectBaseInternalMessageUserList(baseInternalMessageUser);
        ExcelUtil<BaseInternalMessageUser> util = new ExcelUtil<BaseInternalMessageUser>(BaseInternalMessageUser.class);
        util.exportExcel(response, list, "站内信用户映射数据");
    }

    /**
     * 获取站内信用户映射详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:user:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(baseInternalMessageUserService.selectBaseInternalMessageUserById(id));
    }

    /**
     * 新增站内信用户映射
     */
    @PreAuthorize("@ss.hasPermi('system:user:add')")
    @Log(title = "站内信用户映射", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BaseInternalMessageUser baseInternalMessageUser)
    {
        return toAjax(baseInternalMessageUserService.insertBaseInternalMessageUser(baseInternalMessageUser));
    }

    /**
     * 修改站内信用户映射
     */
    @PreAuthorize("@ss.hasPermi('system:user:edit')")
    @Log(title = "站内信用户映射", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BaseInternalMessageUser baseInternalMessageUser)
    {
        return toAjax(baseInternalMessageUserService.updateBaseInternalMessageUser(baseInternalMessageUser));
    }

    /**
     * 删除站内信用户映射
     */
    @PreAuthorize("@ss.hasPermi('system:user:remove')")
    @Log(title = "站内信用户映射", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(baseInternalMessageUserService.deleteBaseInternalMessageUserByIds(ids));
    }
}
