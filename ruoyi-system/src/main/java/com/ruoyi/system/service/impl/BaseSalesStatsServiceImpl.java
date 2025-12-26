package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseSalesStatsMapper;
import com.ruoyi.system.domain.BaseSalesStats;
import com.ruoyi.system.service.IBaseSalesStatsService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseSalesStatsServiceImpl implements IBaseSalesStatsService 
{
    @Autowired
    private BaseSalesStatsMapper baseSalesStatsMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseSalesStats selectBaseSalesStatsById(Long id)
    {
        return baseSalesStatsMapper.selectBaseSalesStatsById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseSalesStats 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseSalesStats> selectBaseSalesStatsList(BaseSalesStats baseSalesStats)
    {
        return baseSalesStatsMapper.selectBaseSalesStatsList(baseSalesStats);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseSalesStats 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseSalesStats(BaseSalesStats baseSalesStats)
    {
        baseSalesStats.setCreateTime(DateUtils.getNowDate());
        return baseSalesStatsMapper.insertBaseSalesStats(baseSalesStats);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseSalesStats 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseSalesStats(BaseSalesStats baseSalesStats)
    {
        baseSalesStats.setUpdateTime(DateUtils.getNowDate());
        return baseSalesStatsMapper.updateBaseSalesStats(baseSalesStats);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseSalesStatsByIds(Long[] ids)
    {
        return baseSalesStatsMapper.deleteBaseSalesStatsByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseSalesStatsById(Long id)
    {
        return baseSalesStatsMapper.deleteBaseSalesStatsById(id);
    }
}
