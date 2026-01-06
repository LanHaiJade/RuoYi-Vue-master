package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.common.domain.BasePayinfo;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BasePayinfoMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BasePayinfo selectBasePayinfoById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param basePayinfo 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BasePayinfo> selectBasePayinfoList(BasePayinfo basePayinfo);

    /**
     * 新增【请填写功能名称】
     * 
     * @param basePayinfo 【请填写功能名称】
     * @return 结果
     */
    public int insertBasePayinfo(BasePayinfo basePayinfo);

    /**
     * 修改【请填写功能名称】
     * 
     * @param basePayinfo 【请填写功能名称】
     * @return 结果
     */
    public int updateBasePayinfo(BasePayinfo basePayinfo);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBasePayinfoById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBasePayinfoByIds(Long[] ids);
}
