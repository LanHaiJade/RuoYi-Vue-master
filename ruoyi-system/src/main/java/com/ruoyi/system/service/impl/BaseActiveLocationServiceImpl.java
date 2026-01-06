package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseActiveLocationMapper;
import com.ruoyi.common.domain.BaseActiveLocation;
import com.ruoyi.system.service.IBaseActiveLocationService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseActiveLocationServiceImpl implements IBaseActiveLocationService 
{
    @Autowired
    private BaseActiveLocationMapper baseActiveLocationMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseActiveLocation selectBaseActiveLocationById(Long id)
    {
        return baseActiveLocationMapper.selectBaseActiveLocationById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseActiveLocation 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseActiveLocation> selectBaseActiveLocationList(BaseActiveLocation baseActiveLocation)
    {
        return baseActiveLocationMapper.selectBaseActiveLocationList(baseActiveLocation);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseActiveLocation 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseActiveLocation(BaseActiveLocation baseActiveLocation)
    {
        baseActiveLocation.setCreateTime(DateUtils.getNowDate());
        return baseActiveLocationMapper.insertBaseActiveLocation(baseActiveLocation);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseActiveLocation 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseActiveLocation(BaseActiveLocation baseActiveLocation)
    {
        baseActiveLocation.setUpdateTime(DateUtils.getNowDate());
        return baseActiveLocationMapper.updateBaseActiveLocation(baseActiveLocation);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseActiveLocationByIds(Long[] ids)
    {
        return baseActiveLocationMapper.deleteBaseActiveLocationByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseActiveLocationById(Long id)
    {
        return baseActiveLocationMapper.deleteBaseActiveLocationById(id);
    }
}
