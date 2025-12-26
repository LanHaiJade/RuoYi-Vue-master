package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BaseGoodsCategory;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseGoodsCategoryMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseGoodsCategory selectBaseGoodsCategoryById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseGoodsCategory 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseGoodsCategory> selectBaseGoodsCategoryList(BaseGoodsCategory baseGoodsCategory);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseGoodsCategory 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseGoodsCategory(BaseGoodsCategory baseGoodsCategory);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseGoodsCategory 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseGoodsCategory(BaseGoodsCategory baseGoodsCategory);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseGoodsCategoryById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseGoodsCategoryByIds(Long[] ids);
}
