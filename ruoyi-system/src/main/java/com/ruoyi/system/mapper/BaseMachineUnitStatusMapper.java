package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BaseMachineUnitStatus;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseMachineUnitStatusMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseMachineUnitStatus selectBaseMachineUnitStatusById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineUnitStatus 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseMachineUnitStatus> selectBaseMachineUnitStatusList(BaseMachineUnitStatus baseMachineUnitStatus);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineUnitStatus 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseMachineUnitStatus(BaseMachineUnitStatus baseMachineUnitStatus);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineUnitStatus 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseMachineUnitStatus(BaseMachineUnitStatus baseMachineUnitStatus);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseMachineUnitStatusById(Integer id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseMachineUnitStatusByIds(Integer[] ids);
}
