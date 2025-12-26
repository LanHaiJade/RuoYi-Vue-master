package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Goodscategory;

/**
 * 商品分类Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IGoodscategoryService 
{
    /**
     * 查询商品分类
     * 
     * @param categoryid 商品分类主键
     * @return 商品分类
     */
    public Goodscategory selectGoodscategoryByCategoryid(String categoryid);

    /**
     * 查询商品分类列表
     * 
     * @param goodscategory 商品分类
     * @return 商品分类集合
     */
    public List<Goodscategory> selectGoodscategoryList(Goodscategory goodscategory);

    /**
     * 新增商品分类
     * 
     * @param goodscategory 商品分类
     * @return 结果
     */
    public int insertGoodscategory(Goodscategory goodscategory);

    /**
     * 修改商品分类
     * 
     * @param goodscategory 商品分类
     * @return 结果
     */
    public int updateGoodscategory(Goodscategory goodscategory);

    /**
     * 批量删除商品分类
     * 
     * @param categoryids 需要删除的商品分类主键集合
     * @return 结果
     */
    public int deleteGoodscategoryByCategoryids(String[] categoryids);

    /**
     * 删除商品分类信息
     * 
     * @param categoryid 商品分类主键
     * @return 结果
     */
    public int deleteGoodscategoryByCategoryid(String categoryid);
}
