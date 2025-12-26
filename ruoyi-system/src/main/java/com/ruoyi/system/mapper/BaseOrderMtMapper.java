package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BaseOrderMt;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseOrderMtMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseOrderMt selectBaseOrderMtById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseOrderMt 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseOrderMt> selectBaseOrderMtList(BaseOrderMt baseOrderMt);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseOrderMt 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseOrderMt(BaseOrderMt baseOrderMt);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseOrderMt 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseOrderMt(BaseOrderMt baseOrderMt);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseOrderMtById(Integer id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseOrderMtByIds(Integer[] ids);
}
