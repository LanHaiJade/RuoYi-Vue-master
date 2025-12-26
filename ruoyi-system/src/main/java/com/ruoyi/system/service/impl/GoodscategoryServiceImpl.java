package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.GoodscategoryMapper;
import com.ruoyi.system.domain.Goodscategory;
import com.ruoyi.system.service.IGoodscategoryService;

/**
 * 商品分类Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class GoodscategoryServiceImpl implements IGoodscategoryService 
{
    @Autowired
    private GoodscategoryMapper goodscategoryMapper;

    /**
     * 查询商品分类
     * 
     * @param categoryid 商品分类主键
     * @return 商品分类
     */
    @Override
    public Goodscategory selectGoodscategoryByCategoryid(String categoryid)
    {
        return goodscategoryMapper.selectGoodscategoryByCategoryid(categoryid);
    }

    /**
     * 查询商品分类列表
     * 
     * @param goodscategory 商品分类
     * @return 商品分类
     */
    @Override
    public List<Goodscategory> selectGoodscategoryList(Goodscategory goodscategory)
    {
        return goodscategoryMapper.selectGoodscategoryList(goodscategory);
    }

    /**
     * 新增商品分类
     * 
     * @param goodscategory 商品分类
     * @return 结果
     */
    @Override
    public int insertGoodscategory(Goodscategory goodscategory)
    {
        return goodscategoryMapper.insertGoodscategory(goodscategory);
    }

    /**
     * 修改商品分类
     * 
     * @param goodscategory 商品分类
     * @return 结果
     */
    @Override
    public int updateGoodscategory(Goodscategory goodscategory)
    {
        return goodscategoryMapper.updateGoodscategory(goodscategory);
    }

    /**
     * 批量删除商品分类
     * 
     * @param categoryids 需要删除的商品分类主键
     * @return 结果
     */
    @Override
    public int deleteGoodscategoryByCategoryids(String[] categoryids)
    {
        return goodscategoryMapper.deleteGoodscategoryByCategoryids(categoryids);
    }

    /**
     * 删除商品分类信息
     * 
     * @param categoryid 商品分类主键
     * @return 结果
     */
    @Override
    public int deleteGoodscategoryByCategoryid(String categoryid)
    {
        return goodscategoryMapper.deleteGoodscategoryByCategoryid(categoryid);
    }
}
