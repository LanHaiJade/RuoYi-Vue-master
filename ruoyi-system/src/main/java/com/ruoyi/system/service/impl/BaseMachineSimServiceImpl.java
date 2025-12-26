package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseMachineSimMapper;
import com.ruoyi.system.domain.BaseMachineSim;
import com.ruoyi.system.service.IBaseMachineSimService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseMachineSimServiceImpl implements IBaseMachineSimService 
{
    @Autowired
    private BaseMachineSimMapper baseMachineSimMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseMachineSim selectBaseMachineSimById(Long id)
    {
        return baseMachineSimMapper.selectBaseMachineSimById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineSim 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseMachineSim> selectBaseMachineSimList(BaseMachineSim baseMachineSim)
    {
        return baseMachineSimMapper.selectBaseMachineSimList(baseMachineSim);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineSim 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseMachineSim(BaseMachineSim baseMachineSim)
    {
        baseMachineSim.setCreateTime(DateUtils.getNowDate());
        return baseMachineSimMapper.insertBaseMachineSim(baseMachineSim);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineSim 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseMachineSim(BaseMachineSim baseMachineSim)
    {
        return baseMachineSimMapper.updateBaseMachineSim(baseMachineSim);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineSimByIds(Long[] ids)
    {
        return baseMachineSimMapper.deleteBaseMachineSimByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineSimById(Long id)
    {
        return baseMachineSimMapper.deleteBaseMachineSimById(id);
    }
}
