package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseUserAutoRefundMapper;
import com.ruoyi.common.domain.BaseUserAutoRefund;
import com.ruoyi.system.service.IBaseUserAutoRefundService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseUserAutoRefundServiceImpl implements IBaseUserAutoRefundService 
{
    @Autowired
    private BaseUserAutoRefundMapper baseUserAutoRefundMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseUserAutoRefund selectBaseUserAutoRefundById(Integer id)
    {
        return baseUserAutoRefundMapper.selectBaseUserAutoRefundById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseUserAutoRefund 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseUserAutoRefund> selectBaseUserAutoRefundList(BaseUserAutoRefund baseUserAutoRefund)
    {
        return baseUserAutoRefundMapper.selectBaseUserAutoRefundList(baseUserAutoRefund);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseUserAutoRefund 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseUserAutoRefund(BaseUserAutoRefund baseUserAutoRefund)
    {
        baseUserAutoRefund.setCreateTime(DateUtils.getNowDate());
        return baseUserAutoRefundMapper.insertBaseUserAutoRefund(baseUserAutoRefund);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseUserAutoRefund 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseUserAutoRefund(BaseUserAutoRefund baseUserAutoRefund)
    {
        baseUserAutoRefund.setUpdateTime(DateUtils.getNowDate());
        return baseUserAutoRefundMapper.updateBaseUserAutoRefund(baseUserAutoRefund);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseUserAutoRefundByIds(Integer[] ids)
    {
        return baseUserAutoRefundMapper.deleteBaseUserAutoRefundByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseUserAutoRefundById(Integer id)
    {
        return baseUserAutoRefundMapper.deleteBaseUserAutoRefundById(id);
    }
}
