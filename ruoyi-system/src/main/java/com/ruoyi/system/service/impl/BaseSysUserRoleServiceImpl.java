package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseSysUserRoleMapper;
import com.ruoyi.system.domain.BaseSysUserRole;
import com.ruoyi.system.service.IBaseSysUserRoleService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseSysUserRoleServiceImpl implements IBaseSysUserRoleService 
{
    @Autowired
    private BaseSysUserRoleMapper baseSysUserRoleMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param userId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseSysUserRole selectBaseSysUserRoleByUserId(Long userId)
    {
        return baseSysUserRoleMapper.selectBaseSysUserRoleByUserId(userId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseSysUserRole 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseSysUserRole> selectBaseSysUserRoleList(BaseSysUserRole baseSysUserRole)
    {
        return baseSysUserRoleMapper.selectBaseSysUserRoleList(baseSysUserRole);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseSysUserRole 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseSysUserRole(BaseSysUserRole baseSysUserRole)
    {
        return baseSysUserRoleMapper.insertBaseSysUserRole(baseSysUserRole);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseSysUserRole 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseSysUserRole(BaseSysUserRole baseSysUserRole)
    {
        return baseSysUserRoleMapper.updateBaseSysUserRole(baseSysUserRole);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param userIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseSysUserRoleByUserIds(Long[] userIds)
    {
        return baseSysUserRoleMapper.deleteBaseSysUserRoleByUserIds(userIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param userId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseSysUserRoleByUserId(Long userId)
    {
        return baseSysUserRoleMapper.deleteBaseSysUserRoleByUserId(userId);
    }
}
