package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BasePaymentBlacklist;

/**
 * 消费者黑名单Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBasePaymentBlacklistService 
{
    /**
     * 查询消费者黑名单
     * 
     * @param id 消费者黑名单主键
     * @return 消费者黑名单
     */
    public BasePaymentBlacklist selectBasePaymentBlacklistById(Long id);

    /**
     * 查询消费者黑名单列表
     * 
     * @param basePaymentBlacklist 消费者黑名单
     * @return 消费者黑名单集合
     */
    public List<BasePaymentBlacklist> selectBasePaymentBlacklistList(BasePaymentBlacklist basePaymentBlacklist);

    /**
     * 新增消费者黑名单
     * 
     * @param basePaymentBlacklist 消费者黑名单
     * @return 结果
     */
    public int insertBasePaymentBlacklist(BasePaymentBlacklist basePaymentBlacklist);

    /**
     * 修改消费者黑名单
     * 
     * @param basePaymentBlacklist 消费者黑名单
     * @return 结果
     */
    public int updateBasePaymentBlacklist(BasePaymentBlacklist basePaymentBlacklist);

    /**
     * 批量删除消费者黑名单
     * 
     * @param ids 需要删除的消费者黑名单主键集合
     * @return 结果
     */
    public int deleteBasePaymentBlacklistByIds(Long[] ids);

    /**
     * 删除消费者黑名单信息
     * 
     * @param id 消费者黑名单主键
     * @return 结果
     */
    public int deleteBasePaymentBlacklistById(Long id);
}
