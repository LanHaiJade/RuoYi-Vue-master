package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseUserMapper;
import com.ruoyi.system.domain.BaseUser;
import com.ruoyi.system.service.IBaseUserService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseUserServiceImpl implements IBaseUserService 
{
    @Autowired
    private BaseUserMapper baseUserMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseUser selectBaseUserById(Long id)
    {
        return baseUserMapper.selectBaseUserById(id);
    }

    /**
     * 根据手机账号查询用户信息
     * @param Phone
     * @return
     */
    @Override
    public BaseUser selectBaseUserByPhone(String Phone)
    {
        return baseUserMapper.selectBaseUserByPhone(Phone);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseUser 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseUser> selectBaseUserList(BaseUser baseUser)
    {
        return baseUserMapper.selectBaseUserList(baseUser);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseUser 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseUser(BaseUser baseUser)
    {
        baseUser.setCreateTime(DateUtils.getNowDate());
        return baseUserMapper.insertBaseUser(baseUser);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseUser 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseUser(BaseUser baseUser)
    {
        return baseUserMapper.updateBaseUser(baseUser);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseUserByIds(Long[] ids)
    {
        return baseUserMapper.deleteBaseUserByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseUserById(Long id)
    {
        return baseUserMapper.deleteBaseUserById(id);
    }
}
