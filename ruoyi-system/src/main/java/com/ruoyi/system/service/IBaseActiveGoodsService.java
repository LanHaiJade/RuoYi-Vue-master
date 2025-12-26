package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BaseActiveGoods;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseActiveGoodsService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseActiveGoods selectBaseActiveGoodsById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseActiveGoods 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseActiveGoods> selectBaseActiveGoodsList(BaseActiveGoods baseActiveGoods);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseActiveGoods 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseActiveGoods(BaseActiveGoods baseActiveGoods);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseActiveGoods 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseActiveGoods(BaseActiveGoods baseActiveGoods);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseActiveGoodsByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseActiveGoodsById(Long id);
}
