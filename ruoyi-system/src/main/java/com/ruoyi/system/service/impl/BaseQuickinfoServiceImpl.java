package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseQuickinfoMapper;
import com.ruoyi.common.domain.BaseQuickinfo;
import com.ruoyi.system.service.IBaseQuickinfoService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseQuickinfoServiceImpl implements IBaseQuickinfoService 
{
    @Autowired
    private BaseQuickinfoMapper baseQuickinfoMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseQuickinfo selectBaseQuickinfoById(Long id)
    {
        return baseQuickinfoMapper.selectBaseQuickinfoById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseQuickinfo 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseQuickinfo> selectBaseQuickinfoList(BaseQuickinfo baseQuickinfo)
    {
        return baseQuickinfoMapper.selectBaseQuickinfoList(baseQuickinfo);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseQuickinfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseQuickinfo(BaseQuickinfo baseQuickinfo)
    {
        baseQuickinfo.setCreateTime(DateUtils.getNowDate());
        return baseQuickinfoMapper.insertBaseQuickinfo(baseQuickinfo);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseQuickinfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseQuickinfo(BaseQuickinfo baseQuickinfo)
    {
        baseQuickinfo.setUpdateTime(DateUtils.getNowDate());
        return baseQuickinfoMapper.updateBaseQuickinfo(baseQuickinfo);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseQuickinfoByIds(Long[] ids)
    {
        return baseQuickinfoMapper.deleteBaseQuickinfoByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseQuickinfoById(Long id)
    {
        return baseQuickinfoMapper.deleteBaseQuickinfoById(id);
    }
}
