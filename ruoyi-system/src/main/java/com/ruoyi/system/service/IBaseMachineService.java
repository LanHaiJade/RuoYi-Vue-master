package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.domain.BaseMachine;
import com.ruoyi.common.domain.vo.MachineVo;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseMachineService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseMachine selectBaseMachineById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachine 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseMachine> selectBaseMachineList(BaseMachine baseMachine);

    /**
     * 查询运营商售货机列表
     * @param machineVo
     * @return
     */
    public List<BaseMachine> selectBaseMachineList(MachineVo machineVo);

    /**
     * 组织售货机列表数据
     * @param list 售货机列表
     * @return 售货机列表
     */
    public List<MachineVo>  selectMachineVoList(List<BaseMachine> list);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachine 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseMachine(BaseMachine baseMachine);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachine 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseMachine(BaseMachine baseMachine);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseMachineByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseMachineById(Long id);
}
