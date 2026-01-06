package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseOfflineFacePayinfoMapper;
import com.ruoyi.common.domain.BaseOfflineFacePayinfo;
import com.ruoyi.system.service.IBaseOfflineFacePayinfoService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseOfflineFacePayinfoServiceImpl implements IBaseOfflineFacePayinfoService 
{
    @Autowired
    private BaseOfflineFacePayinfoMapper baseOfflineFacePayinfoMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseOfflineFacePayinfo selectBaseOfflineFacePayinfoById(Long id)
    {
        return baseOfflineFacePayinfoMapper.selectBaseOfflineFacePayinfoById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseOfflineFacePayinfo 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseOfflineFacePayinfo> selectBaseOfflineFacePayinfoList(BaseOfflineFacePayinfo baseOfflineFacePayinfo)
    {
        return baseOfflineFacePayinfoMapper.selectBaseOfflineFacePayinfoList(baseOfflineFacePayinfo);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseOfflineFacePayinfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseOfflineFacePayinfo(BaseOfflineFacePayinfo baseOfflineFacePayinfo)
    {
        return baseOfflineFacePayinfoMapper.insertBaseOfflineFacePayinfo(baseOfflineFacePayinfo);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseOfflineFacePayinfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseOfflineFacePayinfo(BaseOfflineFacePayinfo baseOfflineFacePayinfo)
    {
        return baseOfflineFacePayinfoMapper.updateBaseOfflineFacePayinfo(baseOfflineFacePayinfo);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseOfflineFacePayinfoByIds(Long[] ids)
    {
        return baseOfflineFacePayinfoMapper.deleteBaseOfflineFacePayinfoByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseOfflineFacePayinfoById(Long id)
    {
        return baseOfflineFacePayinfoMapper.deleteBaseOfflineFacePayinfoById(id);
    }
}
