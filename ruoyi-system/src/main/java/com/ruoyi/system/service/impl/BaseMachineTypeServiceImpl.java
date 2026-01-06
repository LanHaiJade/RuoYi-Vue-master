package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseMachineTypeMapper;
import com.ruoyi.common.domain.BaseMachineType;
import com.ruoyi.system.service.IBaseMachineTypeService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseMachineTypeServiceImpl implements IBaseMachineTypeService 
{
    @Autowired
    private BaseMachineTypeMapper baseMachineTypeMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseMachineType selectBaseMachineTypeById(Long id)
    {
        return baseMachineTypeMapper.selectBaseMachineTypeById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineType 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseMachineType> selectBaseMachineTypeList(BaseMachineType baseMachineType)
    {
        return baseMachineTypeMapper.selectBaseMachineTypeList(baseMachineType);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineType 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseMachineType(BaseMachineType baseMachineType)
    {
        return baseMachineTypeMapper.insertBaseMachineType(baseMachineType);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineType 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseMachineType(BaseMachineType baseMachineType)
    {
        return baseMachineTypeMapper.updateBaseMachineType(baseMachineType);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineTypeByIds(Long[] ids)
    {
        return baseMachineTypeMapper.deleteBaseMachineTypeByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineTypeById(Long id)
    {
        return baseMachineTypeMapper.deleteBaseMachineTypeById(id);
    }
}
