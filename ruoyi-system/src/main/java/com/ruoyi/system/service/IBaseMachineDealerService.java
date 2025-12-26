package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BaseMachineDealer;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseMachineDealerService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseMachineDealer selectBaseMachineDealerById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineDealer 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseMachineDealer> selectBaseMachineDealerList(BaseMachineDealer baseMachineDealer);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineDealer 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseMachineDealer(BaseMachineDealer baseMachineDealer);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineDealer 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseMachineDealer(BaseMachineDealer baseMachineDealer);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseMachineDealerByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseMachineDealerById(Long id);
}
