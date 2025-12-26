package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseActiveSettingMapper;
import com.ruoyi.system.domain.BaseActiveSetting;
import com.ruoyi.system.service.IBaseActiveSettingService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseActiveSettingServiceImpl implements IBaseActiveSettingService 
{
    @Autowired
    private BaseActiveSettingMapper baseActiveSettingMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseActiveSetting selectBaseActiveSettingById(Long id)
    {
        return baseActiveSettingMapper.selectBaseActiveSettingById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseActiveSetting 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseActiveSetting> selectBaseActiveSettingList(BaseActiveSetting baseActiveSetting)
    {
        return baseActiveSettingMapper.selectBaseActiveSettingList(baseActiveSetting);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseActiveSetting 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseActiveSetting(BaseActiveSetting baseActiveSetting)
    {
        baseActiveSetting.setCreateTime(DateUtils.getNowDate());
        return baseActiveSettingMapper.insertBaseActiveSetting(baseActiveSetting);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseActiveSetting 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseActiveSetting(BaseActiveSetting baseActiveSetting)
    {
        baseActiveSetting.setUpdateTime(DateUtils.getNowDate());
        return baseActiveSettingMapper.updateBaseActiveSetting(baseActiveSetting);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseActiveSettingByIds(Long[] ids)
    {
        return baseActiveSettingMapper.deleteBaseActiveSettingByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseActiveSettingById(Long id)
    {
        return baseActiveSettingMapper.deleteBaseActiveSettingById(id);
    }
}
