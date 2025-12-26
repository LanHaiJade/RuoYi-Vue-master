package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BaseMachineSim;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseMachineSimMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseMachineSim selectBaseMachineSimById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineSim 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseMachineSim> selectBaseMachineSimList(BaseMachineSim baseMachineSim);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineSim 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseMachineSim(BaseMachineSim baseMachineSim);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineSim 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseMachineSim(BaseMachineSim baseMachineSim);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseMachineSimById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseMachineSimByIds(Long[] ids);
}
