package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseCouponMapper;
import com.ruoyi.system.domain.BaseCoupon;
import com.ruoyi.system.service.IBaseCouponService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseCouponServiceImpl implements IBaseCouponService 
{
    @Autowired
    private BaseCouponMapper baseCouponMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseCoupon selectBaseCouponById(Long id)
    {
        return baseCouponMapper.selectBaseCouponById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseCoupon 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseCoupon> selectBaseCouponList(BaseCoupon baseCoupon)
    {
        return baseCouponMapper.selectBaseCouponList(baseCoupon);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseCoupon 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseCoupon(BaseCoupon baseCoupon)
    {
        baseCoupon.setCreateTime(DateUtils.getNowDate());
        return baseCouponMapper.insertBaseCoupon(baseCoupon);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseCoupon 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseCoupon(BaseCoupon baseCoupon)
    {
        baseCoupon.setUpdateTime(DateUtils.getNowDate());
        return baseCouponMapper.updateBaseCoupon(baseCoupon);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseCouponByIds(Long[] ids)
    {
        return baseCouponMapper.deleteBaseCouponByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseCouponById(Long id)
    {
        return baseCouponMapper.deleteBaseCouponById(id);
    }
}
