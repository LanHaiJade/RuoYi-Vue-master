package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BaseSalesStats;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseSalesStatsMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseSalesStats selectBaseSalesStatsById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseSalesStats 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseSalesStats> selectBaseSalesStatsList(BaseSalesStats baseSalesStats);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseSalesStats 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseSalesStats(BaseSalesStats baseSalesStats);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseSalesStats 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseSalesStats(BaseSalesStats baseSalesStats);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseSalesStatsById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseSalesStatsByIds(Long[] ids);
}
