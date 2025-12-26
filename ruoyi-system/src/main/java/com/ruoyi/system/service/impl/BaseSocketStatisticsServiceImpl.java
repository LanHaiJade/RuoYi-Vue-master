package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseSocketStatisticsMapper;
import com.ruoyi.system.domain.BaseSocketStatistics;
import com.ruoyi.system.service.IBaseSocketStatisticsService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseSocketStatisticsServiceImpl implements IBaseSocketStatisticsService 
{
    @Autowired
    private BaseSocketStatisticsMapper baseSocketStatisticsMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseSocketStatistics selectBaseSocketStatisticsById(Long id)
    {
        return baseSocketStatisticsMapper.selectBaseSocketStatisticsById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseSocketStatistics 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseSocketStatistics> selectBaseSocketStatisticsList(BaseSocketStatistics baseSocketStatistics)
    {
        return baseSocketStatisticsMapper.selectBaseSocketStatisticsList(baseSocketStatistics);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseSocketStatistics 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseSocketStatistics(BaseSocketStatistics baseSocketStatistics)
    {
        baseSocketStatistics.setCreateTime(DateUtils.getNowDate());
        return baseSocketStatisticsMapper.insertBaseSocketStatistics(baseSocketStatistics);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseSocketStatistics 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseSocketStatistics(BaseSocketStatistics baseSocketStatistics)
    {
        return baseSocketStatisticsMapper.updateBaseSocketStatistics(baseSocketStatistics);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseSocketStatisticsByIds(Long[] ids)
    {
        return baseSocketStatisticsMapper.deleteBaseSocketStatisticsByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseSocketStatisticsById(Long id)
    {
        return baseSocketStatisticsMapper.deleteBaseSocketStatisticsById(id);
    }
}
