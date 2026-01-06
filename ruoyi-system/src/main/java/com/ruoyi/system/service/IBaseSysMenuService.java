package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.domain.BaseSysMenu;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseSysMenuService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param menuId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseSysMenu selectBaseSysMenuByMenuId(Long menuId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseSysMenu 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseSysMenu> selectBaseSysMenuList(BaseSysMenu baseSysMenu);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseSysMenu 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseSysMenu(BaseSysMenu baseSysMenu);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseSysMenu 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseSysMenu(BaseSysMenu baseSysMenu);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param menuIds 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseSysMenuByMenuIds(Long[] menuIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param menuId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseSysMenuByMenuId(Long menuId);
}
