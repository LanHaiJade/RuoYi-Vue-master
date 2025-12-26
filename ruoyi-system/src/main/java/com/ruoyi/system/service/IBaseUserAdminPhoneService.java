package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BaseUserAdminPhone;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseUserAdminPhoneService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseUserAdminPhone selectBaseUserAdminPhoneById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseUserAdminPhone 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseUserAdminPhone> selectBaseUserAdminPhoneList(BaseUserAdminPhone baseUserAdminPhone);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseUserAdminPhone 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseUserAdminPhone(BaseUserAdminPhone baseUserAdminPhone);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseUserAdminPhone 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseUserAdminPhone(BaseUserAdminPhone baseUserAdminPhone);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseUserAdminPhoneByIds(Integer[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseUserAdminPhoneById(Integer id);
}
