package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseActiveDeliveryMapper;
import com.ruoyi.common.domain.BaseActiveDelivery;
import com.ruoyi.system.service.IBaseActiveDeliveryService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseActiveDeliveryServiceImpl implements IBaseActiveDeliveryService 
{
    @Autowired
    private BaseActiveDeliveryMapper baseActiveDeliveryMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseActiveDelivery selectBaseActiveDeliveryById(Long id)
    {
        return baseActiveDeliveryMapper.selectBaseActiveDeliveryById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseActiveDelivery 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseActiveDelivery> selectBaseActiveDeliveryList(BaseActiveDelivery baseActiveDelivery)
    {
        return baseActiveDeliveryMapper.selectBaseActiveDeliveryList(baseActiveDelivery);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseActiveDelivery 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseActiveDelivery(BaseActiveDelivery baseActiveDelivery)
    {
        baseActiveDelivery.setCreateTime(DateUtils.getNowDate());
        return baseActiveDeliveryMapper.insertBaseActiveDelivery(baseActiveDelivery);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseActiveDelivery 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseActiveDelivery(BaseActiveDelivery baseActiveDelivery)
    {
        baseActiveDelivery.setUpdateTime(DateUtils.getNowDate());
        return baseActiveDeliveryMapper.updateBaseActiveDelivery(baseActiveDelivery);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseActiveDeliveryByIds(Long[] ids)
    {
        return baseActiveDeliveryMapper.deleteBaseActiveDeliveryByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseActiveDeliveryById(Long id)
    {
        return baseActiveDeliveryMapper.deleteBaseActiveDeliveryById(id);
    }
}
