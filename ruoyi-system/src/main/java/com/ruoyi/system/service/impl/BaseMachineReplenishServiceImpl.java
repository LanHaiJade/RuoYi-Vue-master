package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseMachineReplenishMapper;
import com.ruoyi.system.domain.BaseMachineReplenish;
import com.ruoyi.system.service.IBaseMachineReplenishService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseMachineReplenishServiceImpl implements IBaseMachineReplenishService 
{
    @Autowired
    private BaseMachineReplenishMapper baseMachineReplenishMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseMachineReplenish selectBaseMachineReplenishById(Long id)
    {
        return baseMachineReplenishMapper.selectBaseMachineReplenishById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineReplenish 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseMachineReplenish> selectBaseMachineReplenishList(BaseMachineReplenish baseMachineReplenish)
    {
        return baseMachineReplenishMapper.selectBaseMachineReplenishList(baseMachineReplenish);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineReplenish 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseMachineReplenish(BaseMachineReplenish baseMachineReplenish)
    {
        return baseMachineReplenishMapper.insertBaseMachineReplenish(baseMachineReplenish);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineReplenish 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseMachineReplenish(BaseMachineReplenish baseMachineReplenish)
    {
        return baseMachineReplenishMapper.updateBaseMachineReplenish(baseMachineReplenish);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineReplenishByIds(Long[] ids)
    {
        return baseMachineReplenishMapper.deleteBaseMachineReplenishByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineReplenishById(Long id)
    {
        return baseMachineReplenishMapper.deleteBaseMachineReplenishById(id);
    }
}
