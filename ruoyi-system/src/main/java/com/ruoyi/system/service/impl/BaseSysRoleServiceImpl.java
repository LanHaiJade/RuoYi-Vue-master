package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseSysRoleMapper;
import com.ruoyi.system.domain.BaseSysRole;
import com.ruoyi.system.service.IBaseSysRoleService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseSysRoleServiceImpl implements IBaseSysRoleService 
{
    @Autowired
    private BaseSysRoleMapper baseSysRoleMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param roleId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseSysRole selectBaseSysRoleByRoleId(Long roleId)
    {
        return baseSysRoleMapper.selectBaseSysRoleByRoleId(roleId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseSysRole 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseSysRole> selectBaseSysRoleList(BaseSysRole baseSysRole)
    {
        return baseSysRoleMapper.selectBaseSysRoleList(baseSysRole);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseSysRole 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseSysRole(BaseSysRole baseSysRole)
    {
        return baseSysRoleMapper.insertBaseSysRole(baseSysRole);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseSysRole 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseSysRole(BaseSysRole baseSysRole)
    {
        baseSysRole.setUpdateTime(DateUtils.getNowDate());
        return baseSysRoleMapper.updateBaseSysRole(baseSysRole);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param roleIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseSysRoleByRoleIds(Long[] roleIds)
    {
        return baseSysRoleMapper.deleteBaseSysRoleByRoleIds(roleIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param roleId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseSysRoleByRoleId(Long roleId)
    {
        return baseSysRoleMapper.deleteBaseSysRoleByRoleId(roleId);
    }
}
