package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseFeedbackMapper;
import com.ruoyi.system.domain.BaseFeedback;
import com.ruoyi.system.service.IBaseFeedbackService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseFeedbackServiceImpl implements IBaseFeedbackService 
{
    @Autowired
    private BaseFeedbackMapper baseFeedbackMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseFeedback selectBaseFeedbackById(Long id)
    {
        return baseFeedbackMapper.selectBaseFeedbackById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseFeedback 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseFeedback> selectBaseFeedbackList(BaseFeedback baseFeedback)
    {
        return baseFeedbackMapper.selectBaseFeedbackList(baseFeedback);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseFeedback 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseFeedback(BaseFeedback baseFeedback)
    {
        baseFeedback.setCreateTime(DateUtils.getNowDate());
        return baseFeedbackMapper.insertBaseFeedback(baseFeedback);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseFeedback 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseFeedback(BaseFeedback baseFeedback)
    {
        baseFeedback.setUpdateTime(DateUtils.getNowDate());
        return baseFeedbackMapper.updateBaseFeedback(baseFeedback);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseFeedbackByIds(Long[] ids)
    {
        return baseFeedbackMapper.deleteBaseFeedbackByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseFeedbackById(Long id)
    {
        return baseFeedbackMapper.deleteBaseFeedbackById(id);
    }
}
