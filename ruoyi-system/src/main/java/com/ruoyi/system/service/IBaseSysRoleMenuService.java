package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BaseSysRoleMenu;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseSysRoleMenuService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param roleId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseSysRoleMenu selectBaseSysRoleMenuByRoleId(Long roleId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseSysRoleMenu 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseSysRoleMenu> selectBaseSysRoleMenuList(BaseSysRoleMenu baseSysRoleMenu);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseSysRoleMenu 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseSysRoleMenu(BaseSysRoleMenu baseSysRoleMenu);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseSysRoleMenu 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseSysRoleMenu(BaseSysRoleMenu baseSysRoleMenu);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param roleIds 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseSysRoleMenuByRoleIds(Long[] roleIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param roleId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseSysRoleMenuByRoleId(Long roleId);
}
