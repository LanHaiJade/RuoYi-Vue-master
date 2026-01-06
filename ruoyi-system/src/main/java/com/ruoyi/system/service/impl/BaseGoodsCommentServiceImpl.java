package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseGoodsCommentMapper;
import com.ruoyi.common.domain.BaseGoodsComment;
import com.ruoyi.system.service.IBaseGoodsCommentService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseGoodsCommentServiceImpl implements IBaseGoodsCommentService 
{
    @Autowired
    private BaseGoodsCommentMapper baseGoodsCommentMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseGoodsComment selectBaseGoodsCommentById(Long id)
    {
        return baseGoodsCommentMapper.selectBaseGoodsCommentById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseGoodsComment 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseGoodsComment> selectBaseGoodsCommentList(BaseGoodsComment baseGoodsComment)
    {
        return baseGoodsCommentMapper.selectBaseGoodsCommentList(baseGoodsComment);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseGoodsComment 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseGoodsComment(BaseGoodsComment baseGoodsComment)
    {
        baseGoodsComment.setCreateTime(DateUtils.getNowDate());
        return baseGoodsCommentMapper.insertBaseGoodsComment(baseGoodsComment);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseGoodsComment 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseGoodsComment(BaseGoodsComment baseGoodsComment)
    {
        baseGoodsComment.setUpdateTime(DateUtils.getNowDate());
        return baseGoodsCommentMapper.updateBaseGoodsComment(baseGoodsComment);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseGoodsCommentByIds(Long[] ids)
    {
        return baseGoodsCommentMapper.deleteBaseGoodsCommentByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseGoodsCommentById(Long id)
    {
        return baseGoodsCommentMapper.deleteBaseGoodsCommentById(id);
    }
}
