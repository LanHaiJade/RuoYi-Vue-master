package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseInternalMessageUserMapper;
import com.ruoyi.common.domain.BaseInternalMessageUser;
import com.ruoyi.system.service.IBaseInternalMessageUserService;

/**
 * 站内信用户映射Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseInternalMessageUserServiceImpl implements IBaseInternalMessageUserService 
{
    @Autowired
    private BaseInternalMessageUserMapper baseInternalMessageUserMapper;

    /**
     * 查询站内信用户映射
     * 
     * @param id 站内信用户映射主键
     * @return 站内信用户映射
     */
    @Override
    public BaseInternalMessageUser selectBaseInternalMessageUserById(Long id)
    {
        return baseInternalMessageUserMapper.selectBaseInternalMessageUserById(id);
    }

    /**
     * 查询站内信用户映射列表
     * 
     * @param baseInternalMessageUser 站内信用户映射
     * @return 站内信用户映射
     */
    @Override
    public List<BaseInternalMessageUser> selectBaseInternalMessageUserList(BaseInternalMessageUser baseInternalMessageUser)
    {
        return baseInternalMessageUserMapper.selectBaseInternalMessageUserList(baseInternalMessageUser);
    }

    /**
     * 新增站内信用户映射
     * 
     * @param baseInternalMessageUser 站内信用户映射
     * @return 结果
     */
    @Override
    public int insertBaseInternalMessageUser(BaseInternalMessageUser baseInternalMessageUser)
    {
        return baseInternalMessageUserMapper.insertBaseInternalMessageUser(baseInternalMessageUser);
    }

    /**
     * 修改站内信用户映射
     * 
     * @param baseInternalMessageUser 站内信用户映射
     * @return 结果
     */
    @Override
    public int updateBaseInternalMessageUser(BaseInternalMessageUser baseInternalMessageUser)
    {
        return baseInternalMessageUserMapper.updateBaseInternalMessageUser(baseInternalMessageUser);
    }

    /**
     * 批量删除站内信用户映射
     * 
     * @param ids 需要删除的站内信用户映射主键
     * @return 结果
     */
    @Override
    public int deleteBaseInternalMessageUserByIds(Long[] ids)
    {
        return baseInternalMessageUserMapper.deleteBaseInternalMessageUserByIds(ids);
    }

    /**
     * 删除站内信用户映射信息
     * 
     * @param id 站内信用户映射主键
     * @return 结果
     */
    @Override
    public int deleteBaseInternalMessageUserById(Long id)
    {
        return baseInternalMessageUserMapper.deleteBaseInternalMessageUserById(id);
    }
}
