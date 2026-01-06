package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.domain.BaseActiveDelivery;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseActiveDeliveryService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseActiveDelivery selectBaseActiveDeliveryById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseActiveDelivery 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseActiveDelivery> selectBaseActiveDeliveryList(BaseActiveDelivery baseActiveDelivery);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseActiveDelivery 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseActiveDelivery(BaseActiveDelivery baseActiveDelivery);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseActiveDelivery 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseActiveDelivery(BaseActiveDelivery baseActiveDelivery);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseActiveDeliveryByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseActiveDeliveryById(Long id);
}
