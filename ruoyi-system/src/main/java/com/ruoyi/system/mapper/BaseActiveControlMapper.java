package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.common.domain.BaseActiveControl;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseActiveControlMapper 
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
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseActiveControlById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseActiveControlByIds(Long[] ids);
}
