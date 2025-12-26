package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseMachineMapper;
import com.ruoyi.system.domain.BaseMachine;
import com.ruoyi.system.service.IBaseMachineService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseMachineServiceImpl implements IBaseMachineService 
{
    @Autowired
    private BaseMachineMapper baseMachineMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseMachine selectBaseMachineById(Long id)
    {
        return baseMachineMapper.selectBaseMachineById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachine 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseMachine> selectBaseMachineList(BaseMachine baseMachine)
    {
        return baseMachineMapper.selectBaseMachineList(baseMachine);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachine 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseMachine(BaseMachine baseMachine)
    {
        baseMachine.setCreateTime(DateUtils.getNowDate());
        return baseMachineMapper.insertBaseMachine(baseMachine);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachine 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseMachine(BaseMachine baseMachine)
    {
        baseMachine.setUpdateTime(DateUtils.getNowDate());
        return baseMachineMapper.updateBaseMachine(baseMachine);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineByIds(Long[] ids)
    {
        return baseMachineMapper.deleteBaseMachineByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineById(Long id)
    {
        return baseMachineMapper.deleteBaseMachineById(id);
    }
}
