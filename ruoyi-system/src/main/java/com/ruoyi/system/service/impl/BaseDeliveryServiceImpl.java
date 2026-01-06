package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseDeliveryMapper;
import com.ruoyi.common.domain.BaseDelivery;
import com.ruoyi.system.service.IBaseDeliveryService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseDeliveryServiceImpl implements IBaseDeliveryService 
{
    @Autowired
    private BaseDeliveryMapper baseDeliveryMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseDelivery selectBaseDeliveryById(Long id)
    {
        return baseDeliveryMapper.selectBaseDeliveryById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseDelivery 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseDelivery> selectBaseDeliveryList(BaseDelivery baseDelivery)
    {
        return baseDeliveryMapper.selectBaseDeliveryList(baseDelivery);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseDelivery 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseDelivery(BaseDelivery baseDelivery)
    {
        baseDelivery.setCreateTime(DateUtils.getNowDate());
        return baseDeliveryMapper.insertBaseDelivery(baseDelivery);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseDelivery 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseDelivery(BaseDelivery baseDelivery)
    {
        baseDelivery.setUpdateTime(DateUtils.getNowDate());
        return baseDeliveryMapper.updateBaseDelivery(baseDelivery);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseDeliveryByIds(Long[] ids)
    {
        return baseDeliveryMapper.deleteBaseDeliveryByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseDeliveryById(Long id)
    {
        return baseDeliveryMapper.deleteBaseDeliveryById(id);
    }
}
