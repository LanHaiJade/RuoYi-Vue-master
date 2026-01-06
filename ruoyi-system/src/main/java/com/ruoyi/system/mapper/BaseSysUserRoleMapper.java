package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.common.domain.BaseSysUserRole;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseSysUserRoleMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param userId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseSysUserRole selectBaseSysUserRoleByUserId(Long userId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseSysUserRole 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseSysUserRole> selectBaseSysUserRoleList(BaseSysUserRole baseSysUserRole);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseSysUserRole 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseSysUserRole(BaseSysUserRole baseSysUserRole);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseSysUserRole 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseSysUserRole(BaseSysUserRole baseSysUserRole);

    /**
     * 删除【请填写功能名称】
     * 
     * @param userId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseSysUserRoleByUserId(Long userId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param userIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseSysUserRoleByUserIds(Long[] userIds);
}
