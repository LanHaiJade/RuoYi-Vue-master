package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.domain.BaseMachineSet;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseMachineSetService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseMachineSet selectBaseMachineSetById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineSet 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseMachineSet> selectBaseMachineSetList(BaseMachineSet baseMachineSet);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineSet 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseMachineSet(BaseMachineSet baseMachineSet);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineSet 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseMachineSet(BaseMachineSet baseMachineSet);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseMachineSetByIds(Integer[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseMachineSetById(Integer id);
}
