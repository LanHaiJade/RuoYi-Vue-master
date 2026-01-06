package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.common.domain.BaseUserManager;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseUserManagerMapper 
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
     * 删除【请填写功能名称】
     * 
     * @param userId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseUserManagerByUserId(Long userId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param userIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseUserManagerByUserIds(Long[] userIds);
}
