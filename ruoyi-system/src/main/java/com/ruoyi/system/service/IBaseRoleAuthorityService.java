package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.domain.BaseRoleAuthority;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseRoleAuthorityService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseRoleAuthority selectBaseRoleAuthorityById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseRoleAuthority 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseRoleAuthority> selectBaseRoleAuthorityList(BaseRoleAuthority baseRoleAuthority);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseRoleAuthority 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseRoleAuthority(BaseRoleAuthority baseRoleAuthority);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseRoleAuthority 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseRoleAuthority(BaseRoleAuthority baseRoleAuthority);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseRoleAuthorityByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseRoleAuthorityById(Long id);
}
