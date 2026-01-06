package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.domain.BaseDelivery;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseDeliveryService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseDelivery selectBaseDeliveryById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseDelivery 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseDelivery> selectBaseDeliveryList(BaseDelivery baseDelivery);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseDelivery 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseDelivery(BaseDelivery baseDelivery);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseDelivery 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseDelivery(BaseDelivery baseDelivery);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseDeliveryByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseDeliveryById(Long id);
}
