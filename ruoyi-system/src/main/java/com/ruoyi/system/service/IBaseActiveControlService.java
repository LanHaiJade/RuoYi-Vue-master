package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BaseActiveControl;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseActiveControlService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseActiveControl selectBaseActiveControlById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseActiveControl 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseActiveControl> selectBaseActiveControlList(BaseActiveControl baseActiveControl);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseActiveControl 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseActiveControl(BaseActiveControl baseActiveControl);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseActiveControl 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseActiveControl(BaseActiveControl baseActiveControl);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseActiveControlByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseActiveControlById(Long id);
}
