package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BaseMachineType;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseMachineTypeService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseMachineType selectBaseMachineTypeById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineType 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseMachineType> selectBaseMachineTypeList(BaseMachineType baseMachineType);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineType 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseMachineType(BaseMachineType baseMachineType);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineType 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseMachineType(BaseMachineType baseMachineType);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseMachineTypeByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseMachineTypeById(Long id);
}
