package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.common.domain.BaseFeedback;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseFeedbackMapper 
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
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseFeedbackById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseFeedbackByIds(Long[] ids);
}
