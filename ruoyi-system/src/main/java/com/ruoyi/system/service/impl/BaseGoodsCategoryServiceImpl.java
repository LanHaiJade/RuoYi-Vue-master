package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseGoodsCategoryMapper;
import com.ruoyi.system.domain.BaseGoodsCategory;
import com.ruoyi.system.service.IBaseGoodsCategoryService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseGoodsCategoryServiceImpl implements IBaseGoodsCategoryService 
{
    @Autowired
    private BaseGoodsCategoryMapper baseGoodsCategoryMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseGoodsCategory selectBaseGoodsCategoryById(Long id)
    {
        return baseGoodsCategoryMapper.selectBaseGoodsCategoryById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseGoodsCategory 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseGoodsCategory> selectBaseGoodsCategoryList(BaseGoodsCategory baseGoodsCategory)
    {
        return baseGoodsCategoryMapper.selectBaseGoodsCategoryList(baseGoodsCategory);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseGoodsCategory 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseGoodsCategory(BaseGoodsCategory baseGoodsCategory)
    {
        baseGoodsCategory.setCreateTime(DateUtils.getNowDate());
        return baseGoodsCategoryMapper.insertBaseGoodsCategory(baseGoodsCategory);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseGoodsCategory 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseGoodsCategory(BaseGoodsCategory baseGoodsCategory)
    {
        baseGoodsCategory.setUpdateTime(DateUtils.getNowDate());
        return baseGoodsCategoryMapper.updateBaseGoodsCategory(baseGoodsCategory);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseGoodsCategoryByIds(Long[] ids)
    {
        return baseGoodsCategoryMapper.deleteBaseGoodsCategoryByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseGoodsCategoryById(Long id)
    {
        return baseGoodsCategoryMapper.deleteBaseGoodsCategoryById(id);
    }
}
