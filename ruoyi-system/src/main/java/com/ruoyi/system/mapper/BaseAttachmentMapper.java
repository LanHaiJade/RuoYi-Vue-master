package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.common.domain.BaseAttachment;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseAttachmentMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseAttachment selectBaseAttachmentById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseAttachment 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseAttachment> selectBaseAttachmentList(BaseAttachment baseAttachment);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseAttachment 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseAttachment(BaseAttachment baseAttachment);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseAttachment 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseAttachment(BaseAttachment baseAttachment);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseAttachmentById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseAttachmentByIds(Long[] ids);
}
