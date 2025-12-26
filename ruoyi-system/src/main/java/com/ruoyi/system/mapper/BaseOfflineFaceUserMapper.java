package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BaseOfflineFaceUser;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseOfflineFaceUserMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseOfflineFaceUser selectBaseOfflineFaceUserById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseOfflineFaceUser 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseOfflineFaceUser> selectBaseOfflineFaceUserList(BaseOfflineFaceUser baseOfflineFaceUser);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseOfflineFaceUser 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseOfflineFaceUser(BaseOfflineFaceUser baseOfflineFaceUser);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseOfflineFaceUser 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseOfflineFaceUser(BaseOfflineFaceUser baseOfflineFaceUser);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseOfflineFaceUserById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseOfflineFaceUserByIds(Long[] ids);
}
