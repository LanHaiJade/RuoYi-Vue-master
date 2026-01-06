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
import com.ruoyi.common.domain.BasePayinfoVideo;
import com.ruoyi.system.service.IBasePayinfoVideoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 销售订单监控视频Controller
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@RestController
@RequestMapping("/system/payvideo")
public class BasePayinfoVideoController extends BaseController
{
    @Autowired
    private IBasePayinfoVideoService basePayinfoVideoService;

    /**
     * 查询销售订单监控视频列表
     */
    @PreAuthorize("@ss.hasPermi('system:video:list')")
    @GetMapping("/list")
    public TableDataInfo list(BasePayinfoVideo basePayinfoVideo)
    {
        startPage();
        List<BasePayinfoVideo> list = basePayinfoVideoService.selectBasePayinfoVideoList(basePayinfoVideo);
        return getDataTable(list);
    }

    /**
     * 导出销售订单监控视频列表
     */
    @PreAuthorize("@ss.hasPermi('system:video:export')")
    @Log(title = "销售订单监控视频", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BasePayinfoVideo basePayinfoVideo)
    {
        List<BasePayinfoVideo> list = basePayinfoVideoService.selectBasePayinfoVideoList(basePayinfoVideo);
        ExcelUtil<BasePayinfoVideo> util = new ExcelUtil<BasePayinfoVideo>(BasePayinfoVideo.class);
        util.exportExcel(response, list, "销售订单监控视频数据");
    }

    /**
     * 获取销售订单监控视频详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:video:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(basePayinfoVideoService.selectBasePayinfoVideoById(id));
    }

    /**
     * 新增销售订单监控视频
     */
    @PreAuthorize("@ss.hasPermi('system:video:add')")
    @Log(title = "销售订单监控视频", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BasePayinfoVideo basePayinfoVideo)
    {
        return toAjax(basePayinfoVideoService.insertBasePayinfoVideo(basePayinfoVideo));
    }

    /**
     * 修改销售订单监控视频
     */
    @PreAuthorize("@ss.hasPermi('system:video:edit')")
    @Log(title = "销售订单监控视频", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BasePayinfoVideo basePayinfoVideo)
    {
        return toAjax(basePayinfoVideoService.updateBasePayinfoVideo(basePayinfoVideo));
    }

    /**
     * 删除销售订单监控视频
     */
    @PreAuthorize("@ss.hasPermi('system:video:remove')")
    @Log(title = "销售订单监控视频", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(basePayinfoVideoService.deleteBasePayinfoVideoByIds(ids));
    }
}
