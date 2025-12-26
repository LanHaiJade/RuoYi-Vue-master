package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BasePaymentLimit;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BasePaymentLimitMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BasePaymentLimit selectBasePaymentLimitById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param basePaymentLimit 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BasePaymentLimit> selectBasePaymentLimitList(BasePaymentLimit basePaymentLimit);

    /**
     * 新增【请填写功能名称】
     * 
     * @param basePaymentLimit 【请填写功能名称】
     * @return 结果
     */
    public int insertBasePaymentLimit(BasePaymentLimit basePaymentLimit);

    /**
     * 修改【请填写功能名称】
     * 
     * @param basePaymentLimit 【请填写功能名称】
     * @return 结果
     */
    public int updateBasePaymentLimit(BasePaymentLimit basePaymentLimit);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBasePaymentLimitById(Integer id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBasePaymentLimitByIds(Integer[] ids);
}
