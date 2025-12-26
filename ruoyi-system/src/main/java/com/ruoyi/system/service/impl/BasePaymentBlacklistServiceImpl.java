package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BasePaymentBlacklistMapper;
import com.ruoyi.system.domain.BasePaymentBlacklist;
import com.ruoyi.system.service.IBasePaymentBlacklistService;

/**
 * 消费者黑名单Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BasePaymentBlacklistServiceImpl implements IBasePaymentBlacklistService 
{
    @Autowired
    private BasePaymentBlacklistMapper basePaymentBlacklistMapper;

    /**
     * 查询消费者黑名单
     * 
     * @param id 消费者黑名单主键
     * @return 消费者黑名单
     */
    @Override
    public BasePaymentBlacklist selectBasePaymentBlacklistById(Long id)
    {
        return basePaymentBlacklistMapper.selectBasePaymentBlacklistById(id);
    }

    /**
     * 查询消费者黑名单列表
     * 
     * @param basePaymentBlacklist 消费者黑名单
     * @return 消费者黑名单
     */
    @Override
    public List<BasePaymentBlacklist> selectBasePaymentBlacklistList(BasePaymentBlacklist basePaymentBlacklist)
    {
        return basePaymentBlacklistMapper.selectBasePaymentBlacklistList(basePaymentBlacklist);
    }

    /**
     * 新增消费者黑名单
     * 
     * @param basePaymentBlacklist 消费者黑名单
     * @return 结果
     */
    @Override
    public int insertBasePaymentBlacklist(BasePaymentBlacklist basePaymentBlacklist)
    {
        basePaymentBlacklist.setCreateTime(DateUtils.getNowDate());
        return basePaymentBlacklistMapper.insertBasePaymentBlacklist(basePaymentBlacklist);
    }

    /**
     * 修改消费者黑名单
     * 
     * @param basePaymentBlacklist 消费者黑名单
     * @return 结果
     */
    @Override
    public int updateBasePaymentBlacklist(BasePaymentBlacklist basePaymentBlacklist)
    {
        return basePaymentBlacklistMapper.updateBasePaymentBlacklist(basePaymentBlacklist);
    }

    /**
     * 批量删除消费者黑名单
     * 
     * @param ids 需要删除的消费者黑名单主键
     * @return 结果
     */
    @Override
    public int deleteBasePaymentBlacklistByIds(Long[] ids)
    {
        return basePaymentBlacklistMapper.deleteBasePaymentBlacklistByIds(ids);
    }

    /**
     * 删除消费者黑名单信息
     * 
     * @param id 消费者黑名单主键
     * @return 结果
     */
    @Override
    public int deleteBasePaymentBlacklistById(Long id)
    {
        return basePaymentBlacklistMapper.deleteBasePaymentBlacklistById(id);
    }
}
