package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseRefundReasonMapper;
import com.ruoyi.system.domain.BaseRefundReason;
import com.ruoyi.system.service.IBaseRefundReasonService;

/**
 * 退款原因Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseRefundReasonServiceImpl implements IBaseRefundReasonService 
{
    @Autowired
    private BaseRefundReasonMapper baseRefundReasonMapper;

    /**
     * 查询退款原因
     * 
     * @param baseRefundReasonId 退款原因主键
     * @return 退款原因
     */
    @Override
    public BaseRefundReason selectBaseRefundReasonByBaseRefundReasonId(String baseRefundReasonId)
    {
        return baseRefundReasonMapper.selectBaseRefundReasonByBaseRefundReasonId(baseRefundReasonId);
    }

    /**
     * 查询退款原因列表
     * 
     * @param baseRefundReason 退款原因
     * @return 退款原因
     */
    @Override
    public List<BaseRefundReason> selectBaseRefundReasonList(BaseRefundReason baseRefundReason)
    {
        return baseRefundReasonMapper.selectBaseRefundReasonList(baseRefundReason);
    }

    /**
     * 新增退款原因
     * 
     * @param baseRefundReason 退款原因
     * @return 结果
     */
    @Override
    public int insertBaseRefundReason(BaseRefundReason baseRefundReason)
    {
        return baseRefundReasonMapper.insertBaseRefundReason(baseRefundReason);
    }

    /**
     * 修改退款原因
     * 
     * @param baseRefundReason 退款原因
     * @return 结果
     */
    @Override
    public int updateBaseRefundReason(BaseRefundReason baseRefundReason)
    {
        return baseRefundReasonMapper.updateBaseRefundReason(baseRefundReason);
    }

    /**
     * 批量删除退款原因
     * 
     * @param baseRefundReasonIds 需要删除的退款原因主键
     * @return 结果
     */
    @Override
    public int deleteBaseRefundReasonByBaseRefundReasonIds(String[] baseRefundReasonIds)
    {
        return baseRefundReasonMapper.deleteBaseRefundReasonByBaseRefundReasonIds(baseRefundReasonIds);
    }

    /**
     * 删除退款原因信息
     * 
     * @param baseRefundReasonId 退款原因主键
     * @return 结果
     */
    @Override
    public int deleteBaseRefundReasonByBaseRefundReasonId(String baseRefundReasonId)
    {
        return baseRefundReasonMapper.deleteBaseRefundReasonByBaseRefundReasonId(baseRefundReasonId);
    }
}
