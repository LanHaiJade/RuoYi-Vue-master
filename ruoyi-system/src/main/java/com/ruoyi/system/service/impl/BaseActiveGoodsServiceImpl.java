package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseActiveGoodsMapper;
import com.ruoyi.system.domain.BaseActiveGoods;
import com.ruoyi.system.service.IBaseActiveGoodsService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseActiveGoodsServiceImpl implements IBaseActiveGoodsService 
{
    @Autowired
    private BaseActiveGoodsMapper baseActiveGoodsMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseActiveGoods selectBaseActiveGoodsById(Long id)
    {
        return baseActiveGoodsMapper.selectBaseActiveGoodsById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseActiveGoods 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseActiveGoods> selectBaseActiveGoodsList(BaseActiveGoods baseActiveGoods)
    {
        return baseActiveGoodsMapper.selectBaseActiveGoodsList(baseActiveGoods);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseActiveGoods 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseActiveGoods(BaseActiveGoods baseActiveGoods)
    {
        baseActiveGoods.setCreateTime(DateUtils.getNowDate());
        return baseActiveGoodsMapper.insertBaseActiveGoods(baseActiveGoods);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseActiveGoods 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseActiveGoods(BaseActiveGoods baseActiveGoods)
    {
        baseActiveGoods.setUpdateTime(DateUtils.getNowDate());
        return baseActiveGoodsMapper.updateBaseActiveGoods(baseActiveGoods);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseActiveGoodsByIds(Long[] ids)
    {
        return baseActiveGoodsMapper.deleteBaseActiveGoodsByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseActiveGoodsById(Long id)
    {
        return baseActiveGoodsMapper.deleteBaseActiveGoodsById(id);
    }
}
