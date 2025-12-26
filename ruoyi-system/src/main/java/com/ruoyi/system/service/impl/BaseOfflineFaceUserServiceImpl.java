package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseOfflineFaceUserMapper;
import com.ruoyi.system.domain.BaseOfflineFaceUser;
import com.ruoyi.system.service.IBaseOfflineFaceUserService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseOfflineFaceUserServiceImpl implements IBaseOfflineFaceUserService 
{
    @Autowired
    private BaseOfflineFaceUserMapper baseOfflineFaceUserMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseOfflineFaceUser selectBaseOfflineFaceUserById(Long id)
    {
        return baseOfflineFaceUserMapper.selectBaseOfflineFaceUserById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseOfflineFaceUser 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseOfflineFaceUser> selectBaseOfflineFaceUserList(BaseOfflineFaceUser baseOfflineFaceUser)
    {
        return baseOfflineFaceUserMapper.selectBaseOfflineFaceUserList(baseOfflineFaceUser);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseOfflineFaceUser 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseOfflineFaceUser(BaseOfflineFaceUser baseOfflineFaceUser)
    {
        return baseOfflineFaceUserMapper.insertBaseOfflineFaceUser(baseOfflineFaceUser);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseOfflineFaceUser 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseOfflineFaceUser(BaseOfflineFaceUser baseOfflineFaceUser)
    {
        return baseOfflineFaceUserMapper.updateBaseOfflineFaceUser(baseOfflineFaceUser);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseOfflineFaceUserByIds(Long[] ids)
    {
        return baseOfflineFaceUserMapper.deleteBaseOfflineFaceUserByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseOfflineFaceUserById(Long id)
    {
        return baseOfflineFaceUserMapper.deleteBaseOfflineFaceUserById(id);
    }
}
