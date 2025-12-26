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
import com.ruoyi.system.domain.BasePaymentBlacklist;
import com.ruoyi.system.service.IBasePaymentBlacklistService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 消费者黑名单Controller
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@RestController
@RequestMapping("/system/payblacklist")
public class BasePaymentBlacklistController extends BaseController
{
    @Autowired
    private IBasePaymentBlacklistService basePaymentBlacklistService;

    /**
     * 查询消费者黑名单列表
     */
    @PreAuthorize("@ss.hasPermi('system:blacklist:list')")
    @GetMapping("/list")
    public TableDataInfo list(BasePaymentBlacklist basePaymentBlacklist)
    {
        startPage();
        List<BasePaymentBlacklist> list = basePaymentBlacklistService.selectBasePaymentBlacklistList(basePaymentBlacklist);
        return getDataTable(list);
    }

    /**
     * 导出消费者黑名单列表
     */
    @PreAuthorize("@ss.hasPermi('system:blacklist:export')")
    @Log(title = "消费者黑名单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BasePaymentBlacklist basePaymentBlacklist)
    {
        List<BasePaymentBlacklist> list = basePaymentBlacklistService.selectBasePaymentBlacklistList(basePaymentBlacklist);
        ExcelUtil<BasePaymentBlacklist> util = new ExcelUtil<BasePaymentBlacklist>(BasePaymentBlacklist.class);
        util.exportExcel(response, list, "消费者黑名单数据");
    }

    /**
     * 获取消费者黑名单详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:blacklist:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(basePaymentBlacklistService.selectBasePaymentBlacklistById(id));
    }

    /**
     * 新增消费者黑名单
     */
    @PreAuthorize("@ss.hasPermi('system:blacklist:add')")
    @Log(title = "消费者黑名单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BasePaymentBlacklist basePaymentBlacklist)
    {
        return toAjax(basePaymentBlacklistService.insertBasePaymentBlacklist(basePaymentBlacklist));
    }

    /**
     * 修改消费者黑名单
     */
    @PreAuthorize("@ss.hasPermi('system:blacklist:edit')")
    @Log(title = "消费者黑名单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BasePaymentBlacklist basePaymentBlacklist)
    {
        return toAjax(basePaymentBlacklistService.updateBasePaymentBlacklist(basePaymentBlacklist));
    }

    /**
     * 删除消费者黑名单
     */
    @PreAuthorize("@ss.hasPermi('system:blacklist:remove')")
    @Log(title = "消费者黑名单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(basePaymentBlacklistService.deleteBasePaymentBlacklistByIds(ids));
    }
}
