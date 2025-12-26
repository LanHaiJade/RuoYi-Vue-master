package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseRefundMapper;
import com.ruoyi.system.domain.BaseRefund;
import com.ruoyi.system.service.IBaseRefundService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseRefundServiceImpl implements IBaseRefundService 
{
    @Autowired
    private BaseRefundMapper baseRefundMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseRefund selectBaseRefundById(Long id)
    {
        return baseRefundMapper.selectBaseRefundById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseRefund 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseRefund> selectBaseRefundList(BaseRefund baseRefund)
    {
        return baseRefundMapper.selectBaseRefundList(baseRefund);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseRefund 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseRefund(BaseRefund baseRefund)
    {
        baseRefund.setCreateTime(DateUtils.getNowDate());
        return baseRefundMapper.insertBaseRefund(baseRefund);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseRefund 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseRefund(BaseRefund baseRefund)
    {
        baseRefund.setUpdateTime(DateUtils.getNowDate());
        return baseRefundMapper.updateBaseRefund(baseRefund);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseRefundByIds(Long[] ids)
    {
        return baseRefundMapper.deleteBaseRefundByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseRefundById(Long id)
    {
        return baseRefundMapper.deleteBaseRefundById(id);
    }
}
