package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BasePayinfoMapper;
import com.ruoyi.common.domain.BasePayinfo;
import com.ruoyi.system.service.IBasePayinfoService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BasePayinfoServiceImpl implements IBasePayinfoService 
{
    @Autowired
    private BasePayinfoMapper basePayinfoMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BasePayinfo selectBasePayinfoById(Long id)
    {
        return basePayinfoMapper.selectBasePayinfoById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param basePayinfo 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BasePayinfo> selectBasePayinfoList(BasePayinfo basePayinfo)
    {
        return basePayinfoMapper.selectBasePayinfoList(basePayinfo);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param basePayinfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBasePayinfo(BasePayinfo basePayinfo)
    {
        basePayinfo.setCreateTime(DateUtils.getNowDate());
        return basePayinfoMapper.insertBasePayinfo(basePayinfo);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param basePayinfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBasePayinfo(BasePayinfo basePayinfo)
    {
        basePayinfo.setUpdateTime(DateUtils.getNowDate());
        return basePayinfoMapper.updateBasePayinfo(basePayinfo);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBasePayinfoByIds(Long[] ids)
    {
        return basePayinfoMapper.deleteBasePayinfoByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBasePayinfoById(Long id)
    {
        return basePayinfoMapper.deleteBasePayinfoById(id);
    }
}
