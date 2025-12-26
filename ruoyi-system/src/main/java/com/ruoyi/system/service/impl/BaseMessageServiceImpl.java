package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseMessageMapper;
import com.ruoyi.system.domain.BaseMessage;
import com.ruoyi.system.service.IBaseMessageService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseMessageServiceImpl implements IBaseMessageService 
{
    @Autowired
    private BaseMessageMapper baseMessageMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseMessage selectBaseMessageById(Long id)
    {
        return baseMessageMapper.selectBaseMessageById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMessage 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseMessage> selectBaseMessageList(BaseMessage baseMessage)
    {
        return baseMessageMapper.selectBaseMessageList(baseMessage);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMessage 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseMessage(BaseMessage baseMessage)
    {
        baseMessage.setCreateTime(DateUtils.getNowDate());
        return baseMessageMapper.insertBaseMessage(baseMessage);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMessage 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseMessage(BaseMessage baseMessage)
    {
        return baseMessageMapper.updateBaseMessage(baseMessage);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMessageByIds(Long[] ids)
    {
        return baseMessageMapper.deleteBaseMessageByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMessageById(Long id)
    {
        return baseMessageMapper.deleteBaseMessageById(id);
    }
}
