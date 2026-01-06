package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.domain.BaseMessage;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseMessageService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseMessage selectBaseMessageById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMessage 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseMessage> selectBaseMessageList(BaseMessage baseMessage);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMessage 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseMessage(BaseMessage baseMessage);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMessage 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseMessage(BaseMessage baseMessage);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseMessageByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseMessageById(Long id);
}
