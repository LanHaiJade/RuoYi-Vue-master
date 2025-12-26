package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseActiveControlMapper;
import com.ruoyi.system.domain.BaseActiveControl;
import com.ruoyi.system.service.IBaseActiveControlService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseActiveControlServiceImpl implements IBaseActiveControlService 
{
    @Autowired
    private BaseActiveControlMapper baseActiveControlMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseActiveControl selectBaseActiveControlById(Long id)
    {
        return baseActiveControlMapper.selectBaseActiveControlById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseActiveControl 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseActiveControl> selectBaseActiveControlList(BaseActiveControl baseActiveControl)
    {
        return baseActiveControlMapper.selectBaseActiveControlList(baseActiveControl);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseActiveControl 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseActiveControl(BaseActiveControl baseActiveControl)
    {
        baseActiveControl.setCreateTime(DateUtils.getNowDate());
        return baseActiveControlMapper.insertBaseActiveControl(baseActiveControl);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseActiveControl 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseActiveControl(BaseActiveControl baseActiveControl)
    {
        baseActiveControl.setUpdateTime(DateUtils.getNowDate());
        return baseActiveControlMapper.updateBaseActiveControl(baseActiveControl);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseActiveControlByIds(Long[] ids)
    {
        return baseActiveControlMapper.deleteBaseActiveControlByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseActiveControlById(Long id)
    {
        return baseActiveControlMapper.deleteBaseActiveControlById(id);
    }
}
