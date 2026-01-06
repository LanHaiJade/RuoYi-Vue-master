package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseInternalMessageMapper;
import com.ruoyi.common.domain.BaseInternalMessage;
import com.ruoyi.system.service.IBaseInternalMessageService;

/**
 * 站内信消息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseInternalMessageServiceImpl implements IBaseInternalMessageService 
{
    @Autowired
    private BaseInternalMessageMapper baseInternalMessageMapper;

    /**
     * 查询站内信消息
     * 
     * @param id 站内信消息主键
     * @return 站内信消息
     */
    @Override
    public BaseInternalMessage selectBaseInternalMessageById(Long id)
    {
        return baseInternalMessageMapper.selectBaseInternalMessageById(id);
    }

    /**
     * 查询站内信消息列表
     * 
     * @param baseInternalMessage 站内信消息
     * @return 站内信消息
     */
    @Override
    public List<BaseInternalMessage> selectBaseInternalMessageList(BaseInternalMessage baseInternalMessage)
    {
        return baseInternalMessageMapper.selectBaseInternalMessageList(baseInternalMessage);
    }

    /**
     * 新增站内信消息
     * 
     * @param baseInternalMessage 站内信消息
     * @return 结果
     */
    @Override
    public int insertBaseInternalMessage(BaseInternalMessage baseInternalMessage)
    {
        baseInternalMessage.setCreateTime(DateUtils.getNowDate());
        return baseInternalMessageMapper.insertBaseInternalMessage(baseInternalMessage);
    }

    /**
     * 修改站内信消息
     * 
     * @param baseInternalMessage 站内信消息
     * @return 结果
     */
    @Override
    public int updateBaseInternalMessage(BaseInternalMessage baseInternalMessage)
    {
        baseInternalMessage.setUpdateTime(DateUtils.getNowDate());
        return baseInternalMessageMapper.updateBaseInternalMessage(baseInternalMessage);
    }

    /**
     * 批量删除站内信消息
     * 
     * @param ids 需要删除的站内信消息主键
     * @return 结果
     */
    @Override
    public int deleteBaseInternalMessageByIds(Long[] ids)
    {
        return baseInternalMessageMapper.deleteBaseInternalMessageByIds(ids);
    }

    /**
     * 删除站内信消息信息
     * 
     * @param id 站内信消息主键
     * @return 结果
     */
    @Override
    public int deleteBaseInternalMessageById(Long id)
    {
        return baseInternalMessageMapper.deleteBaseInternalMessageById(id);
    }
}
