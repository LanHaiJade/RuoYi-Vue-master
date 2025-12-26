package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BaseRefundReason;

/**
 * 退款原因Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseRefundReasonMapper 
{
    /**
     * 查询退款原因
     * 
     * @param baseRefundReasonId 退款原因主键
     * @return 退款原因
     */
    public BaseRefundReason selectBaseRefundReasonByBaseRefundReasonId(String baseRefundReasonId);

    /**
     * 查询退款原因列表
     * 
     * @param baseRefundReason 退款原因
     * @return 退款原因集合
     */
    public List<BaseRefundReason> selectBaseRefundReasonList(BaseRefundReason baseRefundReason);

    /**
     * 新增退款原因
     * 
     * @param baseRefundReason 退款原因
     * @return 结果
     */
    public int insertBaseRefundReason(BaseRefundReason baseRefundReason);

    /**
     * 修改退款原因
     * 
     * @param baseRefundReason 退款原因
     * @return 结果
     */
    public int updateBaseRefundReason(BaseRefundReason baseRefundReason);

    /**
     * 删除退款原因
     * 
     * @param baseRefundReasonId 退款原因主键
     * @return 结果
     */
    public int deleteBaseRefundReasonByBaseRefundReasonId(String baseRefundReasonId);

    /**
     * 批量删除退款原因
     * 
     * @param baseRefundReasonIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseRefundReasonByBaseRefundReasonIds(String[] baseRefundReasonIds);
}
