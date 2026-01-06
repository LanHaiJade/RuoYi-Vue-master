package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.common.domain.BaseSysMenu;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseSysMenuMapper 
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
     * 删除【请填写功能名称】
     * 
     * @param menuId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseSysMenuByMenuId(Long menuId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param menuIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseSysMenuByMenuIds(Long[] menuIds);
}
