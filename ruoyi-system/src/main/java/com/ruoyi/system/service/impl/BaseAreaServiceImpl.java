package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseAreaMapper;
import com.ruoyi.common.domain.BaseArea;
import com.ruoyi.system.service.IBaseAreaService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseAreaServiceImpl implements IBaseAreaService 
{
    @Autowired
    private BaseAreaMapper baseAreaMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseArea selectBaseAreaById(String id)
    {
        return baseAreaMapper.selectBaseAreaById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseArea 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseArea> selectBaseAreaList(BaseArea baseArea)
    {
        return baseAreaMapper.selectBaseAreaList(baseArea);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseArea 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseArea(BaseArea baseArea)
    {
        return baseAreaMapper.insertBaseArea(baseArea);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseArea 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseArea(BaseArea baseArea)
    {
        return baseAreaMapper.updateBaseArea(baseArea);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseAreaByIds(String[] ids)
    {
        return baseAreaMapper.deleteBaseAreaByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseAreaById(String id)
    {
        return baseAreaMapper.deleteBaseAreaById(id);
    }
}
