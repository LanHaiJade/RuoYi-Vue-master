package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.domain.BaseActiveSetting;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseActiveSettingService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseActiveSetting selectBaseActiveSettingById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseActiveSetting 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseActiveSetting> selectBaseActiveSettingList(BaseActiveSetting baseActiveSetting);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseActiveSetting 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseActiveSetting(BaseActiveSetting baseActiveSetting);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseActiveSetting 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseActiveSetting(BaseActiveSetting baseActiveSetting);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseActiveSettingByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseActiveSettingById(Long id);
}
