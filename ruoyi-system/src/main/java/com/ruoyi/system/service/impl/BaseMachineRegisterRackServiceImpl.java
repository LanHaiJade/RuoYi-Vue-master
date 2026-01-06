package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseMachineRegisterRackMapper;
import com.ruoyi.common.domain.BaseMachineRegisterRack;
import com.ruoyi.system.service.IBaseMachineRegisterRackService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseMachineRegisterRackServiceImpl implements IBaseMachineRegisterRackService 
{
    @Autowired
    private BaseMachineRegisterRackMapper baseMachineRegisterRackMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseMachineRegisterRack selectBaseMachineRegisterRackById(Integer id)
    {
        return baseMachineRegisterRackMapper.selectBaseMachineRegisterRackById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineRegisterRack 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseMachineRegisterRack> selectBaseMachineRegisterRackList(BaseMachineRegisterRack baseMachineRegisterRack)
    {
        return baseMachineRegisterRackMapper.selectBaseMachineRegisterRackList(baseMachineRegisterRack);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineRegisterRack 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseMachineRegisterRack(BaseMachineRegisterRack baseMachineRegisterRack)
    {
        return baseMachineRegisterRackMapper.insertBaseMachineRegisterRack(baseMachineRegisterRack);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineRegisterRack 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseMachineRegisterRack(BaseMachineRegisterRack baseMachineRegisterRack)
    {
        return baseMachineRegisterRackMapper.updateBaseMachineRegisterRack(baseMachineRegisterRack);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineRegisterRackByIds(Integer[] ids)
    {
        return baseMachineRegisterRackMapper.deleteBaseMachineRegisterRackByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineRegisterRackById(Integer id)
    {
        return baseMachineRegisterRackMapper.deleteBaseMachineRegisterRackById(id);
    }
}
