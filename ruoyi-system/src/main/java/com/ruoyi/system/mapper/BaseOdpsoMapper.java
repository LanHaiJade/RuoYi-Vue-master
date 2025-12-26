package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BaseOdpso;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseOdpsoMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseOdpso selectBaseOdpsoById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseOdpso 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseOdpso> selectBaseOdpsoList(BaseOdpso baseOdpso);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseOdpso 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseOdpso(BaseOdpso baseOdpso);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseOdpso 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseOdpso(BaseOdpso baseOdpso);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseOdpsoById(Integer id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseOdpsoByIds(Integer[] ids);
}
