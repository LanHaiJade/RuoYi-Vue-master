package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseSysMenuMapper;
import com.ruoyi.system.domain.BaseSysMenu;
import com.ruoyi.system.service.IBaseSysMenuService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseSysMenuServiceImpl implements IBaseSysMenuService 
{
    @Autowired
    private BaseSysMenuMapper baseSysMenuMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param menuId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseSysMenu selectBaseSysMenuByMenuId(Long menuId)
    {
        return baseSysMenuMapper.selectBaseSysMenuByMenuId(menuId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseSysMenu 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseSysMenu> selectBaseSysMenuList(BaseSysMenu baseSysMenu)
    {
        return baseSysMenuMapper.selectBaseSysMenuList(baseSysMenu);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseSysMenu 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseSysMenu(BaseSysMenu baseSysMenu)
    {
        return baseSysMenuMapper.insertBaseSysMenu(baseSysMenu);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseSysMenu 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseSysMenu(BaseSysMenu baseSysMenu)
    {
        baseSysMenu.setUpdateTime(DateUtils.getNowDate());
        return baseSysMenuMapper.updateBaseSysMenu(baseSysMenu);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param menuIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseSysMenuByMenuIds(Long[] menuIds)
    {
        return baseSysMenuMapper.deleteBaseSysMenuByMenuIds(menuIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param menuId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseSysMenuByMenuId(Long menuId)
    {
        return baseSysMenuMapper.deleteBaseSysMenuByMenuId(menuId);
    }
}
