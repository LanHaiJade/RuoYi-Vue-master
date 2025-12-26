package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BaseGoodsComment;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseGoodsCommentMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseGoodsComment selectBaseGoodsCommentById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseGoodsComment 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseGoodsComment> selectBaseGoodsCommentList(BaseGoodsComment baseGoodsComment);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseGoodsComment 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseGoodsComment(BaseGoodsComment baseGoodsComment);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseGoodsComment 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseGoodsComment(BaseGoodsComment baseGoodsComment);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseGoodsCommentById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseGoodsCommentByIds(Long[] ids);
}
