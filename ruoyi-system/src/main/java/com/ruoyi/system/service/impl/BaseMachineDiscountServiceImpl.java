package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseMachineDiscountMapper;
import com.ruoyi.common.domain.BaseMachineDiscount;
import com.ruoyi.system.service.IBaseMachineDiscountService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseMachineDiscountServiceImpl implements IBaseMachineDiscountService 
{
    @Autowired
    private BaseMachineDiscountMapper baseMachineDiscountMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseMachineDiscount selectBaseMachineDiscountById(Integer id)
    {
        return baseMachineDiscountMapper.selectBaseMachineDiscountById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineDiscount 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseMachineDiscount> selectBaseMachineDiscountList(BaseMachineDiscount baseMachineDiscount)
    {
        return baseMachineDiscountMapper.selectBaseMachineDiscountList(baseMachineDiscount);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineDiscount 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseMachineDiscount(BaseMachineDiscount baseMachineDiscount)
    {
        baseMachineDiscount.setCreateTime(DateUtils.getNowDate());
        return baseMachineDiscountMapper.insertBaseMachineDiscount(baseMachineDiscount);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineDiscount 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseMachineDiscount(BaseMachineDiscount baseMachineDiscount)
    {
        baseMachineDiscount.setUpdateTime(DateUtils.getNowDate());
        return baseMachineDiscountMapper.updateBaseMachineDiscount(baseMachineDiscount);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineDiscountByIds(Integer[] ids)
    {
        return baseMachineDiscountMapper.deleteBaseMachineDiscountByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineDiscountById(Integer id)
    {
        return baseMachineDiscountMapper.deleteBaseMachineDiscountById(id);
    }
}
