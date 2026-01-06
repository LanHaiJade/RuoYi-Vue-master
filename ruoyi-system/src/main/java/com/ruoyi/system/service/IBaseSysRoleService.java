package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.domain.BaseSysRole;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseSysRoleService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param roleId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseSysRole selectBaseSysRoleByRoleId(Long roleId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseSysRole 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseSysRole> selectBaseSysRoleList(BaseSysRole baseSysRole);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseSysRole 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseSysRole(BaseSysRole baseSysRole);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseSysRole 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseSysRole(BaseSysRole baseSysRole);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param roleIds 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseSysRoleByRoleIds(Long[] roleIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param roleId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseSysRoleByRoleId(Long roleId);
}
