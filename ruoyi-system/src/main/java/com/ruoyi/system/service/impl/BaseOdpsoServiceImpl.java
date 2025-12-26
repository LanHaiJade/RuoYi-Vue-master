package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseOdpsoMapper;
import com.ruoyi.system.domain.BaseOdpso;
import com.ruoyi.system.service.IBaseOdpsoService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseOdpsoServiceImpl implements IBaseOdpsoService 
{
    @Autowired
    private BaseOdpsoMapper baseOdpsoMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseOdpso selectBaseOdpsoById(Integer id)
    {
        return baseOdpsoMapper.selectBaseOdpsoById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseOdpso 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseOdpso> selectBaseOdpsoList(BaseOdpso baseOdpso)
    {
        return baseOdpsoMapper.selectBaseOdpsoList(baseOdpso);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseOdpso 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseOdpso(BaseOdpso baseOdpso)
    {
        baseOdpso.setCreateTime(DateUtils.getNowDate());
        return baseOdpsoMapper.insertBaseOdpso(baseOdpso);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseOdpso 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseOdpso(BaseOdpso baseOdpso)
    {
        baseOdpso.setUpdateTime(DateUtils.getNowDate());
        return baseOdpsoMapper.updateBaseOdpso(baseOdpso);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseOdpsoByIds(Integer[] ids)
    {
        return baseOdpsoMapper.deleteBaseOdpsoByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseOdpsoById(Integer id)
    {
        return baseOdpsoMapper.deleteBaseOdpsoById(id);
    }
}
