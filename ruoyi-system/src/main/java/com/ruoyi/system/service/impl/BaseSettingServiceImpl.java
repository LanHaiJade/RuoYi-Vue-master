package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseSettingMapper;
import com.ruoyi.common.domain.BaseSetting;
import com.ruoyi.system.service.IBaseSettingService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseSettingServiceImpl implements IBaseSettingService 
{
    @Autowired
    private BaseSettingMapper baseSettingMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseSetting selectBaseSettingById(Long id)
    {
        return baseSettingMapper.selectBaseSettingById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseSetting 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseSetting> selectBaseSettingList(BaseSetting baseSetting)
    {
        return baseSettingMapper.selectBaseSettingList(baseSetting);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseSetting 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseSetting(BaseSetting baseSetting)
    {
        return baseSettingMapper.insertBaseSetting(baseSetting);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseSetting 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseSetting(BaseSetting baseSetting)
    {
        baseSetting.setUpdateTime(DateUtils.getNowDate());
        return baseSettingMapper.updateBaseSetting(baseSetting);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseSettingByIds(Long[] ids)
    {
        return baseSettingMapper.deleteBaseSettingByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseSettingById(Long id)
    {
        return baseSettingMapper.deleteBaseSettingById(id);
    }
}
