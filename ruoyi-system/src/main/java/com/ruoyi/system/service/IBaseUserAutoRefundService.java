package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BaseUserAutoRefund;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseUserAutoRefundService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseUserAutoRefund selectBaseUserAutoRefundById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseUserAutoRefund 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseUserAutoRefund> selectBaseUserAutoRefundList(BaseUserAutoRefund baseUserAutoRefund);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseUserAutoRefund 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseUserAutoRefund(BaseUserAutoRefund baseUserAutoRefund);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseUserAutoRefund 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseUserAutoRefund(BaseUserAutoRefund baseUserAutoRefund);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseUserAutoRefundByIds(Integer[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseUserAutoRefundById(Integer id);
}
