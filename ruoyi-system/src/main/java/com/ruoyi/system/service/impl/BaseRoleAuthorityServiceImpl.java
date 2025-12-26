package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseRoleAuthorityMapper;
import com.ruoyi.system.domain.BaseRoleAuthority;
import com.ruoyi.system.service.IBaseRoleAuthorityService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseRoleAuthorityServiceImpl implements IBaseRoleAuthorityService 
{
    @Autowired
    private BaseRoleAuthorityMapper baseRoleAuthorityMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseRoleAuthority selectBaseRoleAuthorityById(Long id)
    {
        return baseRoleAuthorityMapper.selectBaseRoleAuthorityById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseRoleAuthority 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseRoleAuthority> selectBaseRoleAuthorityList(BaseRoleAuthority baseRoleAuthority)
    {
        return baseRoleAuthorityMapper.selectBaseRoleAuthorityList(baseRoleAuthority);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseRoleAuthority 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseRoleAuthority(BaseRoleAuthority baseRoleAuthority)
    {
        return baseRoleAuthorityMapper.insertBaseRoleAuthority(baseRoleAuthority);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseRoleAuthority 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseRoleAuthority(BaseRoleAuthority baseRoleAuthority)
    {
        return baseRoleAuthorityMapper.updateBaseRoleAuthority(baseRoleAuthority);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseRoleAuthorityByIds(Long[] ids)
    {
        return baseRoleAuthorityMapper.deleteBaseRoleAuthorityByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseRoleAuthorityById(Long id)
    {
        return baseRoleAuthorityMapper.deleteBaseRoleAuthorityById(id);
    }
}
