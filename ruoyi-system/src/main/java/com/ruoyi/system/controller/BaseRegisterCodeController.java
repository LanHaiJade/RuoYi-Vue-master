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
import com.ruoyi.common.domain.BaseRegisterCode;
import com.ruoyi.system.service.IBaseRegisterCodeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 运营商注册Controller
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@RestController
@RequestMapping("/system/regcode")
public class BaseRegisterCodeController extends BaseController
{
    @Autowired
    private IBaseRegisterCodeService baseRegisterCodeService;

    /**
     * 查询运营商注册列表
     */
    @PreAuthorize("@ss.hasPermi('system:code:list')")
    @GetMapping("/list")
    public TableDataInfo list(BaseRegisterCode baseRegisterCode)
    {
        startPage();
        List<BaseRegisterCode> list = baseRegisterCodeService.selectBaseRegisterCodeList(baseRegisterCode);
        return getDataTable(list);
    }

    /**
     * 导出运营商注册列表
     */
    @PreAuthorize("@ss.hasPermi('system:code:export')")
    @Log(title = "运营商注册", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BaseRegisterCode baseRegisterCode)
    {
        List<BaseRegisterCode> list = baseRegisterCodeService.selectBaseRegisterCodeList(baseRegisterCode);
        ExcelUtil<BaseRegisterCode> util = new ExcelUtil<BaseRegisterCode>(BaseRegisterCode.class);
        util.exportExcel(response, list, "运营商注册数据");
    }

    /**
     * 获取运营商注册详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:code:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(baseRegisterCodeService.selectBaseRegisterCodeById(id));
    }

    /**
     * 新增运营商注册
     */
    @PreAuthorize("@ss.hasPermi('system:code:add')")
    @Log(title = "运营商注册", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BaseRegisterCode baseRegisterCode)
    {
        return toAjax(baseRegisterCodeService.insertBaseRegisterCode(baseRegisterCode));
    }

    /**
     * 修改运营商注册
     */
    @PreAuthorize("@ss.hasPermi('system:code:edit')")
    @Log(title = "运营商注册", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BaseRegisterCode baseRegisterCode)
    {
        return toAjax(baseRegisterCodeService.updateBaseRegisterCode(baseRegisterCode));
    }

    /**
     * 删除运营商注册
     */
    @PreAuthorize("@ss.hasPermi('system:code:remove')")
    @Log(title = "运营商注册", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(baseRegisterCodeService.deleteBaseRegisterCodeByIds(ids));
    }
}
