package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseKfyhdRegmachMapper;
import com.ruoyi.common.domain.BaseKfyhdRegmach;
import com.ruoyi.system.service.IBaseKfyhdRegmachService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseKfyhdRegmachServiceImpl implements IBaseKfyhdRegmachService 
{
    @Autowired
    private BaseKfyhdRegmachMapper baseKfyhdRegmachMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseKfyhdRegmach selectBaseKfyhdRegmachById(Integer id)
    {
        return baseKfyhdRegmachMapper.selectBaseKfyhdRegmachById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseKfyhdRegmach 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseKfyhdRegmach> selectBaseKfyhdRegmachList(BaseKfyhdRegmach baseKfyhdRegmach)
    {
        return baseKfyhdRegmachMapper.selectBaseKfyhdRegmachList(baseKfyhdRegmach);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseKfyhdRegmach 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseKfyhdRegmach(BaseKfyhdRegmach baseKfyhdRegmach)
    {
        baseKfyhdRegmach.setCreateTime(DateUtils.getNowDate());
        return baseKfyhdRegmachMapper.insertBaseKfyhdRegmach(baseKfyhdRegmach);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseKfyhdRegmach 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseKfyhdRegmach(BaseKfyhdRegmach baseKfyhdRegmach)
    {
        baseKfyhdRegmach.setUpdateTime(DateUtils.getNowDate());
        return baseKfyhdRegmachMapper.updateBaseKfyhdRegmach(baseKfyhdRegmach);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseKfyhdRegmachByIds(Integer[] ids)
    {
        return baseKfyhdRegmachMapper.deleteBaseKfyhdRegmachByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseKfyhdRegmachById(Integer id)
    {
        return baseKfyhdRegmachMapper.deleteBaseKfyhdRegmachById(id);
    }
}
