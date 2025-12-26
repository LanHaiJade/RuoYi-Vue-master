package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BaseUserManager;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseUserManagerService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param userId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseUserManager selectBaseUserManagerByUserId(Long userId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseUserManager 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseUserManager> selectBaseUserManagerList(BaseUserManager baseUserManager);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseUserManager 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseUserManager(BaseUserManager baseUserManager);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseUserManager 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseUserManager(BaseUserManager baseUserManager);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param userIds 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseUserManagerByUserIds(Long[] userIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param userId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseUserManagerByUserId(Long userId);
}
