package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseSimFlowLimitMapper;
import com.ruoyi.common.domain.BaseSimFlowLimit;
import com.ruoyi.system.service.IBaseSimFlowLimitService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseSimFlowLimitServiceImpl implements IBaseSimFlowLimitService 
{
    @Autowired
    private BaseSimFlowLimitMapper baseSimFlowLimitMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseSimFlowLimit selectBaseSimFlowLimitById(Long id)
    {
        return baseSimFlowLimitMapper.selectBaseSimFlowLimitById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseSimFlowLimit 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseSimFlowLimit> selectBaseSimFlowLimitList(BaseSimFlowLimit baseSimFlowLimit)
    {
        return baseSimFlowLimitMapper.selectBaseSimFlowLimitList(baseSimFlowLimit);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseSimFlowLimit 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseSimFlowLimit(BaseSimFlowLimit baseSimFlowLimit)
    {
        baseSimFlowLimit.setCreateTime(DateUtils.getNowDate());
        return baseSimFlowLimitMapper.insertBaseSimFlowLimit(baseSimFlowLimit);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseSimFlowLimit 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseSimFlowLimit(BaseSimFlowLimit baseSimFlowLimit)
    {
        baseSimFlowLimit.setUpdateTime(DateUtils.getNowDate());
        return baseSimFlowLimitMapper.updateBaseSimFlowLimit(baseSimFlowLimit);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseSimFlowLimitByIds(Long[] ids)
    {
        return baseSimFlowLimitMapper.deleteBaseSimFlowLimitByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseSimFlowLimitById(Long id)
    {
        return baseSimFlowLimitMapper.deleteBaseSimFlowLimitById(id);
    }
}
