package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseUserManagerMapper;
import com.ruoyi.common.domain.BaseUserManager;
import com.ruoyi.system.service.IBaseUserManagerService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseUserManagerServiceImpl implements IBaseUserManagerService 
{
    @Autowired
    private BaseUserManagerMapper baseUserManagerMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param userId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseUserManager selectBaseUserManagerByUserId(Long userId)
    {
        return baseUserManagerMapper.selectBaseUserManagerByUserId(userId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseUserManager 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseUserManager> selectBaseUserManagerList(BaseUserManager baseUserManager)
    {
        return baseUserManagerMapper.selectBaseUserManagerList(baseUserManager);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseUserManager 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseUserManager(BaseUserManager baseUserManager)
    {
        return baseUserManagerMapper.insertBaseUserManager(baseUserManager);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseUserManager 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseUserManager(BaseUserManager baseUserManager)
    {
        return baseUserManagerMapper.updateBaseUserManager(baseUserManager);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param userIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseUserManagerByUserIds(Long[] userIds)
    {
        return baseUserManagerMapper.deleteBaseUserManagerByUserIds(userIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param userId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseUserManagerByUserId(Long userId)
    {
        return baseUserManagerMapper.deleteBaseUserManagerByUserId(userId);
    }
}
