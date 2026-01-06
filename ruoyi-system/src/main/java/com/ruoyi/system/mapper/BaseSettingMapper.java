package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.common.domain.BaseSetting;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseSettingMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseSetting selectBaseSettingById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseSetting 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseSetting> selectBaseSettingList(BaseSetting baseSetting);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseSetting 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseSetting(BaseSetting baseSetting);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseSetting 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseSetting(BaseSetting baseSetting);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseSettingById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseSettingByIds(Long[] ids);
}
