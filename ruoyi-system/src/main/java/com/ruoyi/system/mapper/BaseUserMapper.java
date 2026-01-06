package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.common.domain.BaseUser;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseUserMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseUser selectBaseUserById(Long id);

    /**
     * 根据手机账号查询用户信息
     * @param Phone
     * @return
     */
    public BaseUser selectBaseUserByPhone(String Phone);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseUser 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseUser> selectBaseUserList(BaseUser baseUser);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseUser 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseUser(BaseUser baseUser);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseUser 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseUser(BaseUser baseUser);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseUserById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseUserByIds(Long[] ids);
}
