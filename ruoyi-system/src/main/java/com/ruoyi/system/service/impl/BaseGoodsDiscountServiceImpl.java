package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseGoodsDiscountMapper;
import com.ruoyi.common.domain.BaseGoodsDiscount;
import com.ruoyi.system.service.IBaseGoodsDiscountService;

/**
 * 商品优惠Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseGoodsDiscountServiceImpl implements IBaseGoodsDiscountService 
{
    @Autowired
    private BaseGoodsDiscountMapper baseGoodsDiscountMapper;

    /**
     * 查询商品优惠
     * 
     * @param id 商品优惠主键
     * @return 商品优惠
     */
    @Override
    public BaseGoodsDiscount selectBaseGoodsDiscountById(Long id)
    {
        return baseGoodsDiscountMapper.selectBaseGoodsDiscountById(id);
    }

    /**
     * 查询商品优惠列表
     * 
     * @param baseGoodsDiscount 商品优惠
     * @return 商品优惠
     */
    @Override
    public List<BaseGoodsDiscount> selectBaseGoodsDiscountList(BaseGoodsDiscount baseGoodsDiscount)
    {
        return baseGoodsDiscountMapper.selectBaseGoodsDiscountList(baseGoodsDiscount);
    }

    /**
     * 新增商品优惠
     * 
     * @param baseGoodsDiscount 商品优惠
     * @return 结果
     */
    @Override
    public int insertBaseGoodsDiscount(BaseGoodsDiscount baseGoodsDiscount)
    {
        return baseGoodsDiscountMapper.insertBaseGoodsDiscount(baseGoodsDiscount);
    }

    /**
     * 修改商品优惠
     * 
     * @param baseGoodsDiscount 商品优惠
     * @return 结果
     */
    @Override
    public int updateBaseGoodsDiscount(BaseGoodsDiscount baseGoodsDiscount)
    {
        return baseGoodsDiscountMapper.updateBaseGoodsDiscount(baseGoodsDiscount);
    }

    /**
     * 批量删除商品优惠
     * 
     * @param ids 需要删除的商品优惠主键
     * @return 结果
     */
    @Override
    public int deleteBaseGoodsDiscountByIds(Long[] ids)
    {
        return baseGoodsDiscountMapper.deleteBaseGoodsDiscountByIds(ids);
    }

    /**
     * 删除商品优惠信息
     * 
     * @param id 商品优惠主键
     * @return 结果
     */
    @Override
    public int deleteBaseGoodsDiscountById(Long id)
    {
        return baseGoodsDiscountMapper.deleteBaseGoodsDiscountById(id);
    }
}
