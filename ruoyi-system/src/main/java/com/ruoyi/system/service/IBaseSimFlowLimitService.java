package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BaseSimFlowLimit;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseSimFlowLimitService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseSimFlowLimit selectBaseSimFlowLimitById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseSimFlowLimit 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseSimFlowLimit> selectBaseSimFlowLimitList(BaseSimFlowLimit baseSimFlowLimit);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseSimFlowLimit 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseSimFlowLimit(BaseSimFlowLimit baseSimFlowLimit);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseSimFlowLimit 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseSimFlowLimit(BaseSimFlowLimit baseSimFlowLimit);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseSimFlowLimitByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseSimFlowLimitById(Long id);
}
