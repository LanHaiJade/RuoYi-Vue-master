package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BaseMachineSet;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseMachineSetMapper 
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
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseMachineSetById(Integer id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseMachineSetByIds(Integer[] ids);
}
