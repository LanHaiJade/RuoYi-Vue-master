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
import com.ruoyi.system.domain.BaseInternalMessage;
import com.ruoyi.system.service.IBaseInternalMessageService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 站内信消息Controller
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@RestController
@RequestMapping("/system/intmessage")
public class BaseInternalMessageController extends BaseController
{
    @Autowired
    private IBaseInternalMessageService baseInternalMessageService;

    /**
     * 查询站内信消息列表
     */
    @PreAuthorize("@ss.hasPermi('system:message:list')")
    @GetMapping("/list")
    public TableDataInfo list(BaseInternalMessage baseInternalMessage)
    {
        startPage();
        List<BaseInternalMessage> list = baseInternalMessageService.selectBaseInternalMessageList(baseInternalMessage);
        return getDataTable(list);
    }

    /**
     * 导出站内信消息列表
     */
    @PreAuthorize("@ss.hasPermi('system:message:export')")
    @Log(title = "站内信消息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BaseInternalMessage baseInternalMessage)
    {
        List<BaseInternalMessage> list = baseInternalMessageService.selectBaseInternalMessageList(baseInternalMessage);
        ExcelUtil<BaseInternalMessage> util = new ExcelUtil<BaseInternalMessage>(BaseInternalMessage.class);
        util.exportExcel(response, list, "站内信消息数据");
    }

    /**
     * 获取站内信消息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:message:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(baseInternalMessageService.selectBaseInternalMessageById(id));
    }

    /**
     * 新增站内信消息
     */
    @PreAuthorize("@ss.hasPermi('system:message:add')")
    @Log(title = "站内信消息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BaseInternalMessage baseInternalMessage)
    {
        return toAjax(baseInternalMessageService.insertBaseInternalMessage(baseInternalMessage));
    }

    /**
     * 修改站内信消息
     */
    @PreAuthorize("@ss.hasPermi('system:message:edit')")
    @Log(title = "站内信消息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BaseInternalMessage baseInternalMessage)
    {
        return toAjax(baseInternalMessageService.updateBaseInternalMessage(baseInternalMessage));
    }

    /**
     * 删除站内信消息
     */
    @PreAuthorize("@ss.hasPermi('system:message:remove')")
    @Log(title = "站内信消息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(baseInternalMessageService.deleteBaseInternalMessageByIds(ids));
    }
}
