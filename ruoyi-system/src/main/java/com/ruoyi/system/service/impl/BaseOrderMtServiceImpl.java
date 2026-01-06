package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseOrderMtMapper;
import com.ruoyi.common.domain.BaseOrderMt;
import com.ruoyi.system.service.IBaseOrderMtService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseOrderMtServiceImpl implements IBaseOrderMtService 
{
    @Autowired
    private BaseOrderMtMapper baseOrderMtMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseOrderMt selectBaseOrderMtById(Integer id)
    {
        return baseOrderMtMapper.selectBaseOrderMtById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseOrderMt 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseOrderMt> selectBaseOrderMtList(BaseOrderMt baseOrderMt)
    {
        return baseOrderMtMapper.selectBaseOrderMtList(baseOrderMt);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseOrderMt 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseOrderMt(BaseOrderMt baseOrderMt)
    {
        baseOrderMt.setCreateTime(DateUtils.getNowDate());
        return baseOrderMtMapper.insertBaseOrderMt(baseOrderMt);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseOrderMt 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseOrderMt(BaseOrderMt baseOrderMt)
    {
        baseOrderMt.setUpdateTime(DateUtils.getNowDate());
        return baseOrderMtMapper.updateBaseOrderMt(baseOrderMt);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseOrderMtByIds(Integer[] ids)
    {
        return baseOrderMtMapper.deleteBaseOrderMtByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseOrderMtById(Integer id)
    {
        return baseOrderMtMapper.deleteBaseOrderMtById(id);
    }
}
