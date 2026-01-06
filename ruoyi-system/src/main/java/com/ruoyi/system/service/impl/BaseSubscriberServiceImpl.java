package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseSubscriberMapper;
import com.ruoyi.common.domain.BaseSubscriber;
import com.ruoyi.system.service.IBaseSubscriberService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseSubscriberServiceImpl implements IBaseSubscriberService 
{
    @Autowired
    private BaseSubscriberMapper baseSubscriberMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseSubscriber selectBaseSubscriberById(Long id)
    {
        return baseSubscriberMapper.selectBaseSubscriberById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseSubscriber 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseSubscriber> selectBaseSubscriberList(BaseSubscriber baseSubscriber)
    {
        return baseSubscriberMapper.selectBaseSubscriberList(baseSubscriber);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseSubscriber 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseSubscriber(BaseSubscriber baseSubscriber)
    {
        baseSubscriber.setCreateTime(DateUtils.getNowDate());
        return baseSubscriberMapper.insertBaseSubscriber(baseSubscriber);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseSubscriber 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseSubscriber(BaseSubscriber baseSubscriber)
    {
        return baseSubscriberMapper.updateBaseSubscriber(baseSubscriber);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseSubscriberByIds(Long[] ids)
    {
        return baseSubscriberMapper.deleteBaseSubscriberByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseSubscriberById(Long id)
    {
        return baseSubscriberMapper.deleteBaseSubscriberById(id);
    }
}
