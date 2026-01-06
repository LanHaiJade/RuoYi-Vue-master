package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.domain.BaseInternalMessageUser;

/**
 * 站内信用户映射Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseInternalMessageUserService 
{
    /**
     * 查询站内信用户映射
     * 
     * @param id 站内信用户映射主键
     * @return 站内信用户映射
     */
    public BaseInternalMessageUser selectBaseInternalMessageUserById(Long id);

    /**
     * 查询站内信用户映射列表
     * 
     * @param baseInternalMessageUser 站内信用户映射
     * @return 站内信用户映射集合
     */
    public List<BaseInternalMessageUser> selectBaseInternalMessageUserList(BaseInternalMessageUser baseInternalMessageUser);

    /**
     * 新增站内信用户映射
     * 
     * @param baseInternalMessageUser 站内信用户映射
     * @return 结果
     */
    public int insertBaseInternalMessageUser(BaseInternalMessageUser baseInternalMessageUser);

    /**
     * 修改站内信用户映射
     * 
     * @param baseInternalMessageUser 站内信用户映射
     * @return 结果
     */
    public int updateBaseInternalMessageUser(BaseInternalMessageUser baseInternalMessageUser);

    /**
     * 批量删除站内信用户映射
     * 
     * @param ids 需要删除的站内信用户映射主键集合
     * @return 结果
     */
    public int deleteBaseInternalMessageUserByIds(Long[] ids);

    /**
     * 删除站内信用户映射信息
     * 
     * @param id 站内信用户映射主键
     * @return 结果
     */
    public int deleteBaseInternalMessageUserById(Long id);
}
