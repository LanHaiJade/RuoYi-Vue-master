package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseAfterSaleServiceMapper;
import com.ruoyi.common.domain.BaseAfterSaleService;
import com.ruoyi.system.service.IBaseAfterSaleServiceService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseAfterSaleServiceServiceImpl implements IBaseAfterSaleServiceService 
{
    @Autowired
    private BaseAfterSaleServiceMapper baseAfterSaleServiceMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseAfterSaleService selectBaseAfterSaleServiceById(Long id)
    {
        return baseAfterSaleServiceMapper.selectBaseAfterSaleServiceById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseAfterSaleService 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseAfterSaleService> selectBaseAfterSaleServiceList(BaseAfterSaleService baseAfterSaleService)
    {
        return baseAfterSaleServiceMapper.selectBaseAfterSaleServiceList(baseAfterSaleService);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseAfterSaleService 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseAfterSaleService(BaseAfterSaleService baseAfterSaleService)
    {
        baseAfterSaleService.setCreateTime(DateUtils.getNowDate());
        return baseAfterSaleServiceMapper.insertBaseAfterSaleService(baseAfterSaleService);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseAfterSaleService 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseAfterSaleService(BaseAfterSaleService baseAfterSaleService)
    {
        return baseAfterSaleServiceMapper.updateBaseAfterSaleService(baseAfterSaleService);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseAfterSaleServiceByIds(Long[] ids)
    {
        return baseAfterSaleServiceMapper.deleteBaseAfterSaleServiceByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseAfterSaleServiceById(Long id)
    {
        return baseAfterSaleServiceMapper.deleteBaseAfterSaleServiceById(id);
    }
}
