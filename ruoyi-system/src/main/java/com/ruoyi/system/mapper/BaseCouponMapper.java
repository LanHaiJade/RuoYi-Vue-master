package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BaseCoupon;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseCouponMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseCoupon selectBaseCouponById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseCoupon 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseCoupon> selectBaseCouponList(BaseCoupon baseCoupon);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseCoupon 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseCoupon(BaseCoupon baseCoupon);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseCoupon 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseCoupon(BaseCoupon baseCoupon);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseCouponById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseCouponByIds(Long[] ids);
}
