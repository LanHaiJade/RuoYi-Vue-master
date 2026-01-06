package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BasePaymentLimitMapper;
import com.ruoyi.common.domain.BasePaymentLimit;
import com.ruoyi.system.service.IBasePaymentLimitService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BasePaymentLimitServiceImpl implements IBasePaymentLimitService 
{
    @Autowired
    private BasePaymentLimitMapper basePaymentLimitMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BasePaymentLimit selectBasePaymentLimitById(Integer id)
    {
        return basePaymentLimitMapper.selectBasePaymentLimitById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param basePaymentLimit 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BasePaymentLimit> selectBasePaymentLimitList(BasePaymentLimit basePaymentLimit)
    {
        return basePaymentLimitMapper.selectBasePaymentLimitList(basePaymentLimit);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param basePaymentLimit 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBasePaymentLimit(BasePaymentLimit basePaymentLimit)
    {
        basePaymentLimit.setCreateTime(DateUtils.getNowDate());
        return basePaymentLimitMapper.insertBasePaymentLimit(basePaymentLimit);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param basePaymentLimit 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBasePaymentLimit(BasePaymentLimit basePaymentLimit)
    {
        basePaymentLimit.setUpdateTime(DateUtils.getNowDate());
        return basePaymentLimitMapper.updateBasePaymentLimit(basePaymentLimit);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBasePaymentLimitByIds(Integer[] ids)
    {
        return basePaymentLimitMapper.deleteBasePaymentLimitByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBasePaymentLimitById(Integer id)
    {
        return basePaymentLimitMapper.deleteBasePaymentLimitById(id);
    }
}
