package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseRoleMapper;
import com.ruoyi.common.domain.BaseRole;
import com.ruoyi.system.service.IBaseRoleService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseRoleServiceImpl implements IBaseRoleService 
{
    @Autowired
    private BaseRoleMapper baseRoleMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseRole selectBaseRoleById(Long id)
    {
        return baseRoleMapper.selectBaseRoleById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseRole 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseRole> selectBaseRoleList(BaseRole baseRole)
    {
        return baseRoleMapper.selectBaseRoleList(baseRole);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseRole 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseRole(BaseRole baseRole)
    {
        return baseRoleMapper.insertBaseRole(baseRole);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseRole 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseRole(BaseRole baseRole)
    {
        return baseRoleMapper.updateBaseRole(baseRole);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseRoleByIds(Long[] ids)
    {
        return baseRoleMapper.deleteBaseRoleByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseRoleById(Long id)
    {
        return baseRoleMapper.deleteBaseRoleById(id);
    }
}
