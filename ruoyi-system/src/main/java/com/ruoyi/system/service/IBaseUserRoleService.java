package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BaseUserRole;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseUserRoleService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param userId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseUserRole selectBaseUserRoleByUserId(Long userId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseUserRole 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseUserRole> selectBaseUserRoleList(BaseUserRole baseUserRole);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseUserRole 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseUserRole(BaseUserRole baseUserRole);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseUserRole 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseUserRole(BaseUserRole baseUserRole);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param userIds 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseUserRoleByUserIds(Long[] userIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param userId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseUserRoleByUserId(Long userId);
}
