package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseMachineSetMapper;
import com.ruoyi.system.domain.BaseMachineSet;
import com.ruoyi.system.service.IBaseMachineSetService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseMachineSetServiceImpl implements IBaseMachineSetService 
{
    @Autowired
    private BaseMachineSetMapper baseMachineSetMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseMachineSet selectBaseMachineSetById(Integer id)
    {
        return baseMachineSetMapper.selectBaseMachineSetById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineSet 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseMachineSet> selectBaseMachineSetList(BaseMachineSet baseMachineSet)
    {
        return baseMachineSetMapper.selectBaseMachineSetList(baseMachineSet);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineSet 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseMachineSet(BaseMachineSet baseMachineSet)
    {
        baseMachineSet.setCreateTime(DateUtils.getNowDate());
        return baseMachineSetMapper.insertBaseMachineSet(baseMachineSet);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineSet 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseMachineSet(BaseMachineSet baseMachineSet)
    {
        baseMachineSet.setUpdateTime(DateUtils.getNowDate());
        return baseMachineSetMapper.updateBaseMachineSet(baseMachineSet);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineSetByIds(Integer[] ids)
    {
        return baseMachineSetMapper.deleteBaseMachineSetByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineSetById(Integer id)
    {
        return baseMachineSetMapper.deleteBaseMachineSetById(id);
    }
}
