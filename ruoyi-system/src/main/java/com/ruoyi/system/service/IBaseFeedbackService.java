package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BaseFeedback;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseFeedbackService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseFeedback selectBaseFeedbackById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseFeedback 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseFeedback> selectBaseFeedbackList(BaseFeedback baseFeedback);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseFeedback 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseFeedback(BaseFeedback baseFeedback);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseFeedback 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseFeedback(BaseFeedback baseFeedback);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseFeedbackByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseFeedbackById(Long id);
}
