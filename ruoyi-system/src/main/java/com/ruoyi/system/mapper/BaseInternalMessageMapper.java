package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.common.domain.BaseInternalMessage;

/**
 * 站内信消息Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseInternalMessageMapper 
{
    /**
     * 查询站内信消息
     * 
     * @param id 站内信消息主键
     * @return 站内信消息
     */
    public BaseInternalMessage selectBaseInternalMessageById(Long id);

    /**
     * 查询站内信消息列表
     * 
     * @param baseInternalMessage 站内信消息
     * @return 站内信消息集合
     */
    public List<BaseInternalMessage> selectBaseInternalMessageList(BaseInternalMessage baseInternalMessage);

    /**
     * 新增站内信消息
     * 
     * @param baseInternalMessage 站内信消息
     * @return 结果
     */
    public int insertBaseInternalMessage(BaseInternalMessage baseInternalMessage);

    /**
     * 修改站内信消息
     * 
     * @param baseInternalMessage 站内信消息
     * @return 结果
     */
    public int updateBaseInternalMessage(BaseInternalMessage baseInternalMessage);

    /**
     * 删除站内信消息
     * 
     * @param id 站内信消息主键
     * @return 结果
     */
    public int deleteBaseInternalMessageById(Long id);

    /**
     * 批量删除站内信消息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseInternalMessageByIds(Long[] ids);
}
