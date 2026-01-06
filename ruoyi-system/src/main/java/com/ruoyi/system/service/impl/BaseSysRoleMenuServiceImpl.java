package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseSysRoleMenuMapper;
import com.ruoyi.common.domain.BaseSysRoleMenu;
import com.ruoyi.system.service.IBaseSysRoleMenuService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseSysRoleMenuServiceImpl implements IBaseSysRoleMenuService 
{
    @Autowired
    private BaseSysRoleMenuMapper baseSysRoleMenuMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param roleId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseSysRoleMenu selectBaseSysRoleMenuByRoleId(Long roleId)
    {
        return baseSysRoleMenuMapper.selectBaseSysRoleMenuByRoleId(roleId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseSysRoleMenu 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseSysRoleMenu> selectBaseSysRoleMenuList(BaseSysRoleMenu baseSysRoleMenu)
    {
        return baseSysRoleMenuMapper.selectBaseSysRoleMenuList(baseSysRoleMenu);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseSysRoleMenu 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseSysRoleMenu(BaseSysRoleMenu baseSysRoleMenu)
    {
        return baseSysRoleMenuMapper.insertBaseSysRoleMenu(baseSysRoleMenu);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseSysRoleMenu 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseSysRoleMenu(BaseSysRoleMenu baseSysRoleMenu)
    {
        return baseSysRoleMenuMapper.updateBaseSysRoleMenu(baseSysRoleMenu);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param roleIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseSysRoleMenuByRoleIds(Long[] roleIds)
    {
        return baseSysRoleMenuMapper.deleteBaseSysRoleMenuByRoleIds(roleIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param roleId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseSysRoleMenuByRoleId(Long roleId)
    {
        return baseSysRoleMenuMapper.deleteBaseSysRoleMenuByRoleId(roleId);
    }
}
