package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseUserRoleMapper;
import com.ruoyi.system.domain.BaseUserRole;
import com.ruoyi.system.service.IBaseUserRoleService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseUserRoleServiceImpl implements IBaseUserRoleService 
{
    @Autowired
    private BaseUserRoleMapper baseUserRoleMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param userId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseUserRole selectBaseUserRoleByUserId(Long userId)
    {
        return baseUserRoleMapper.selectBaseUserRoleByUserId(userId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseUserRole 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseUserRole> selectBaseUserRoleList(BaseUserRole baseUserRole)
    {
        return baseUserRoleMapper.selectBaseUserRoleList(baseUserRole);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseUserRole 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseUserRole(BaseUserRole baseUserRole)
    {
        return baseUserRoleMapper.insertBaseUserRole(baseUserRole);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseUserRole 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseUserRole(BaseUserRole baseUserRole)
    {
        return baseUserRoleMapper.updateBaseUserRole(baseUserRole);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param userIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseUserRoleByUserIds(Long[] userIds)
    {
        return baseUserRoleMapper.deleteBaseUserRoleByUserIds(userIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param userId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseUserRoleByUserId(Long userId)
    {
        return baseUserRoleMapper.deleteBaseUserRoleByUserId(userId);
    }
}
