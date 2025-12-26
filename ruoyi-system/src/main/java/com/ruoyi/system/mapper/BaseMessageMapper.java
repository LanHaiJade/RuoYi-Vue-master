package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BaseMessage;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseMessageMapper 
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
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseMessageById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseMessageByIds(Long[] ids);
}
