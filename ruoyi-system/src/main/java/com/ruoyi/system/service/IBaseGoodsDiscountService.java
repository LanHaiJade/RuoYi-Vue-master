package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BaseGoodsDiscount;

/**
 * 商品优惠Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseGoodsDiscountService 
{
    /**
     * 查询商品优惠
     * 
     * @param id 商品优惠主键
     * @return 商品优惠
     */
    public BaseGoodsDiscount selectBaseGoodsDiscountById(Long id);

    /**
     * 查询商品优惠列表
     * 
     * @param baseGoodsDiscount 商品优惠
     * @return 商品优惠集合
     */
    public List<BaseGoodsDiscount> selectBaseGoodsDiscountList(BaseGoodsDiscount baseGoodsDiscount);

    /**
     * 新增商品优惠
     * 
     * @param baseGoodsDiscount 商品优惠
     * @return 结果
     */
    public int insertBaseGoodsDiscount(BaseGoodsDiscount baseGoodsDiscount);

    /**
     * 修改商品优惠
     * 
     * @param baseGoodsDiscount 商品优惠
     * @return 结果
     */
    public int updateBaseGoodsDiscount(BaseGoodsDiscount baseGoodsDiscount);

    /**
     * 批量删除商品优惠
     * 
     * @param ids 需要删除的商品优惠主键集合
     * @return 结果
     */
    public int deleteBaseGoodsDiscountByIds(Long[] ids);

    /**
     * 删除商品优惠信息
     * 
     * @param id 商品优惠主键
     * @return 结果
     */
    public int deleteBaseGoodsDiscountById(Long id);
}
