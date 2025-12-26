package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BaseGoods;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseGoodsService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseGoods selectBaseGoodsById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseGoods 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseGoods> selectBaseGoodsList(BaseGoods baseGoods);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseGoods 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseGoods(BaseGoods baseGoods);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseGoods 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseGoods(BaseGoods baseGoods);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseGoodsByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseGoodsById(Long id);
}
