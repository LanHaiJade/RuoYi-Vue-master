package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseGoodsMapper;
import com.ruoyi.common.domain.BaseGoods;
import com.ruoyi.system.service.IBaseGoodsService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseGoodsServiceImpl implements IBaseGoodsService 
{
    @Autowired
    private BaseGoodsMapper baseGoodsMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseGoods selectBaseGoodsById(Long id)
    {
        return baseGoodsMapper.selectBaseGoodsById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseGoods 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseGoods> selectBaseGoodsList(BaseGoods baseGoods)
    {
        return baseGoodsMapper.selectBaseGoodsList(baseGoods);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseGoods 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseGoods(BaseGoods baseGoods)
    {
        baseGoods.setCreateTime(DateUtils.getNowDate());
        return baseGoodsMapper.insertBaseGoods(baseGoods);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseGoods 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseGoods(BaseGoods baseGoods)
    {
        baseGoods.setUpdateTime(DateUtils.getNowDate());
        return baseGoodsMapper.updateBaseGoods(baseGoods);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseGoodsByIds(Long[] ids)
    {
        return baseGoodsMapper.deleteBaseGoodsByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseGoodsById(Long id)
    {
        return baseGoodsMapper.deleteBaseGoodsById(id);
    }
}
