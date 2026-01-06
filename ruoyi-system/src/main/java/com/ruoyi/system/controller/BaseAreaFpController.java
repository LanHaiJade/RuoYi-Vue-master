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
import com.ruoyi.common.domain.BaseAreaFp;
import com.ruoyi.system.service.IBaseAreaFpService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 省市县Controller
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@RestController
@RequestMapping("/system/arfp")
public class BaseAreaFpController extends BaseController
{
    @Autowired
    private IBaseAreaFpService baseAreaFpService;

    /**
     * 查询省市县列表
     */
    @PreAuthorize("@ss.hasPermi('system:fp:list')")
    @GetMapping("/list")
    public TableDataInfo list(BaseAreaFp baseAreaFp)
    {
        startPage();
        List<BaseAreaFp> list = baseAreaFpService.selectBaseAreaFpList(baseAreaFp);
        return getDataTable(list);
    }

    /**
     * 导出省市县列表
     */
    @PreAuthorize("@ss.hasPermi('system:fp:export')")
    @Log(title = "省市县", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BaseAreaFp baseAreaFp)
    {
        List<BaseAreaFp> list = baseAreaFpService.selectBaseAreaFpList(baseAreaFp);
        ExcelUtil<BaseAreaFp> util = new ExcelUtil<BaseAreaFp>(BaseAreaFp.class);
        util.exportExcel(response, list, "省市县数据");
    }

    /**
     * 获取省市县详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:fp:query')")
    @GetMapping(value = "/{regionid}")
    public AjaxResult getInfo(@PathVariable("regionid") String regionid)
    {
        return success(baseAreaFpService.selectBaseAreaFpByRegionid(regionid));
    }

    /**
     * 新增省市县
     */
    @PreAuthorize("@ss.hasPermi('system:fp:add')")
    @Log(title = "省市县", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BaseAreaFp baseAreaFp)
    {
        return toAjax(baseAreaFpService.insertBaseAreaFp(baseAreaFp));
    }

    /**
     * 修改省市县
     */
    @PreAuthorize("@ss.hasPermi('system:fp:edit')")
    @Log(title = "省市县", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BaseAreaFp baseAreaFp)
    {
        return toAjax(baseAreaFpService.updateBaseAreaFp(baseAreaFp));
    }

    /**
     * 删除省市县
     */
    @PreAuthorize("@ss.hasPermi('system:fp:remove')")
    @Log(title = "省市县", businessType = BusinessType.DELETE)
	@DeleteMapping("/{regionids}")
    public AjaxResult remove(@PathVariable String[] regionids)
    {
        return toAjax(baseAreaFpService.deleteBaseAreaFpByRegionids(regionids));
    }
}
