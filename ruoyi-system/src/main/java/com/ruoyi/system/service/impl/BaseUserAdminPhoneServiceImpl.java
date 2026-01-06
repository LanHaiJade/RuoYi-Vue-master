package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseUserAdminPhoneMapper;
import com.ruoyi.common.domain.BaseUserAdminPhone;
import com.ruoyi.system.service.IBaseUserAdminPhoneService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseUserAdminPhoneServiceImpl implements IBaseUserAdminPhoneService 
{
    @Autowired
    private BaseUserAdminPhoneMapper baseUserAdminPhoneMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseUserAdminPhone selectBaseUserAdminPhoneById(Integer id)
    {
        return baseUserAdminPhoneMapper.selectBaseUserAdminPhoneById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseUserAdminPhone 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseUserAdminPhone> selectBaseUserAdminPhoneList(BaseUserAdminPhone baseUserAdminPhone)
    {
        return baseUserAdminPhoneMapper.selectBaseUserAdminPhoneList(baseUserAdminPhone);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseUserAdminPhone 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseUserAdminPhone(BaseUserAdminPhone baseUserAdminPhone)
    {
        baseUserAdminPhone.setCreateTime(DateUtils.getNowDate());
        return baseUserAdminPhoneMapper.insertBaseUserAdminPhone(baseUserAdminPhone);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseUserAdminPhone 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseUserAdminPhone(BaseUserAdminPhone baseUserAdminPhone)
    {
        baseUserAdminPhone.setUpdateTime(DateUtils.getNowDate());
        return baseUserAdminPhoneMapper.updateBaseUserAdminPhone(baseUserAdminPhone);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseUserAdminPhoneByIds(Integer[] ids)
    {
        return baseUserAdminPhoneMapper.deleteBaseUserAdminPhoneByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseUserAdminPhoneById(Integer id)
    {
        return baseUserAdminPhoneMapper.deleteBaseUserAdminPhoneById(id);
    }
}
