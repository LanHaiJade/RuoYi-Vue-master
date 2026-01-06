package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BasePayinfoDetailMapper;
import com.ruoyi.common.domain.BasePayinfoDetail;
import com.ruoyi.system.service.IBasePayinfoDetailService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BasePayinfoDetailServiceImpl implements IBasePayinfoDetailService 
{
    @Autowired
    private BasePayinfoDetailMapper basePayinfoDetailMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BasePayinfoDetail selectBasePayinfoDetailById(Long id)
    {
        return basePayinfoDetailMapper.selectBasePayinfoDetailById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param basePayinfoDetail 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BasePayinfoDetail> selectBasePayinfoDetailList(BasePayinfoDetail basePayinfoDetail)
    {
        return basePayinfoDetailMapper.selectBasePayinfoDetailList(basePayinfoDetail);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param basePayinfoDetail 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBasePayinfoDetail(BasePayinfoDetail basePayinfoDetail)
    {
        basePayinfoDetail.setCreateTime(DateUtils.getNowDate());
        return basePayinfoDetailMapper.insertBasePayinfoDetail(basePayinfoDetail);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param basePayinfoDetail 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBasePayinfoDetail(BasePayinfoDetail basePayinfoDetail)
    {
        basePayinfoDetail.setUpdateTime(DateUtils.getNowDate());
        return basePayinfoDetailMapper.updateBasePayinfoDetail(basePayinfoDetail);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBasePayinfoDetailByIds(Long[] ids)
    {
        return basePayinfoDetailMapper.deleteBasePayinfoDetailByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBasePayinfoDetailById(Long id)
    {
        return basePayinfoDetailMapper.deleteBasePayinfoDetailById(id);
    }
}
