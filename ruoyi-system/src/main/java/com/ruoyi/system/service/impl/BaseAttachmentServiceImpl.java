package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseAttachmentMapper;
import com.ruoyi.system.domain.BaseAttachment;
import com.ruoyi.system.service.IBaseAttachmentService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseAttachmentServiceImpl implements IBaseAttachmentService 
{
    @Autowired
    private BaseAttachmentMapper baseAttachmentMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseAttachment selectBaseAttachmentById(Long id)
    {
        return baseAttachmentMapper.selectBaseAttachmentById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseAttachment 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseAttachment> selectBaseAttachmentList(BaseAttachment baseAttachment)
    {
        return baseAttachmentMapper.selectBaseAttachmentList(baseAttachment);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseAttachment 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseAttachment(BaseAttachment baseAttachment)
    {
        baseAttachment.setCreateTime(DateUtils.getNowDate());
        return baseAttachmentMapper.insertBaseAttachment(baseAttachment);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseAttachment 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseAttachment(BaseAttachment baseAttachment)
    {
        return baseAttachmentMapper.updateBaseAttachment(baseAttachment);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseAttachmentByIds(Long[] ids)
    {
        return baseAttachmentMapper.deleteBaseAttachmentByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseAttachmentById(Long id)
    {
        return baseAttachmentMapper.deleteBaseAttachmentById(id);
    }
}
