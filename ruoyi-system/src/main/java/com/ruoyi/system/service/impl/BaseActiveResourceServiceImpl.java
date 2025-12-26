package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseActiveResourceMapper;
import com.ruoyi.system.domain.BaseActiveResource;
import com.ruoyi.system.service.IBaseActiveResourceService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseActiveResourceServiceImpl implements IBaseActiveResourceService 
{
    @Autowired
    private BaseActiveResourceMapper baseActiveResourceMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseActiveResource selectBaseActiveResourceById(Long id)
    {
        return baseActiveResourceMapper.selectBaseActiveResourceById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseActiveResource 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseActiveResource> selectBaseActiveResourceList(BaseActiveResource baseActiveResource)
    {
        return baseActiveResourceMapper.selectBaseActiveResourceList(baseActiveResource);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseActiveResource 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseActiveResource(BaseActiveResource baseActiveResource)
    {
        baseActiveResource.setCreateTime(DateUtils.getNowDate());
        return baseActiveResourceMapper.insertBaseActiveResource(baseActiveResource);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseActiveResource 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseActiveResource(BaseActiveResource baseActiveResource)
    {
        baseActiveResource.setUpdateTime(DateUtils.getNowDate());
        return baseActiveResourceMapper.updateBaseActiveResource(baseActiveResource);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseActiveResourceByIds(Long[] ids)
    {
        return baseActiveResourceMapper.deleteBaseActiveResourceByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseActiveResourceById(Long id)
    {
        return baseActiveResourceMapper.deleteBaseActiveResourceById(id);
    }
}
