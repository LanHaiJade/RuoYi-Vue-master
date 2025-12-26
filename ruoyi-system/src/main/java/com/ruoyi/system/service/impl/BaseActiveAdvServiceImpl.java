package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseActiveAdvMapper;
import com.ruoyi.system.domain.BaseActiveAdv;
import com.ruoyi.system.service.IBaseActiveAdvService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseActiveAdvServiceImpl implements IBaseActiveAdvService 
{
    @Autowired
    private BaseActiveAdvMapper baseActiveAdvMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseActiveAdv selectBaseActiveAdvById(Long id)
    {
        return baseActiveAdvMapper.selectBaseActiveAdvById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseActiveAdv 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseActiveAdv> selectBaseActiveAdvList(BaseActiveAdv baseActiveAdv)
    {
        return baseActiveAdvMapper.selectBaseActiveAdvList(baseActiveAdv);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseActiveAdv 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseActiveAdv(BaseActiveAdv baseActiveAdv)
    {
        baseActiveAdv.setCreateTime(DateUtils.getNowDate());
        return baseActiveAdvMapper.insertBaseActiveAdv(baseActiveAdv);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseActiveAdv 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseActiveAdv(BaseActiveAdv baseActiveAdv)
    {
        baseActiveAdv.setUpdateTime(DateUtils.getNowDate());
        return baseActiveAdvMapper.updateBaseActiveAdv(baseActiveAdv);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseActiveAdvByIds(Long[] ids)
    {
        return baseActiveAdvMapper.deleteBaseActiveAdvByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseActiveAdvById(Long id)
    {
        return baseActiveAdvMapper.deleteBaseActiveAdvById(id);
    }
}
