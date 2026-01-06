package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.domain.BaseMachineReplenish;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseMachineReplenishService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseMachineReplenish selectBaseMachineReplenishById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineReplenish 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseMachineReplenish> selectBaseMachineReplenishList(BaseMachineReplenish baseMachineReplenish);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineReplenish 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseMachineReplenish(BaseMachineReplenish baseMachineReplenish);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineReplenish 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseMachineReplenish(BaseMachineReplenish baseMachineReplenish);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseMachineReplenishByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseMachineReplenishById(Long id);
}
