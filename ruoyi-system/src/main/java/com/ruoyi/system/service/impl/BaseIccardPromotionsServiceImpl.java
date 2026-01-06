package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseIccardPromotionsMapper;
import com.ruoyi.common.domain.BaseIccardPromotions;
import com.ruoyi.system.service.IBaseIccardPromotionsService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseIccardPromotionsServiceImpl implements IBaseIccardPromotionsService 
{
    @Autowired
    private BaseIccardPromotionsMapper baseIccardPromotionsMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseIccardPromotions selectBaseIccardPromotionsById(Integer id)
    {
        return baseIccardPromotionsMapper.selectBaseIccardPromotionsById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseIccardPromotions 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseIccardPromotions> selectBaseIccardPromotionsList(BaseIccardPromotions baseIccardPromotions)
    {
        return baseIccardPromotionsMapper.selectBaseIccardPromotionsList(baseIccardPromotions);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseIccardPromotions 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseIccardPromotions(BaseIccardPromotions baseIccardPromotions)
    {
        baseIccardPromotions.setCreateTime(DateUtils.getNowDate());
        return baseIccardPromotionsMapper.insertBaseIccardPromotions(baseIccardPromotions);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseIccardPromotions 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseIccardPromotions(BaseIccardPromotions baseIccardPromotions)
    {
        baseIccardPromotions.setUpdateTime(DateUtils.getNowDate());
        return baseIccardPromotionsMapper.updateBaseIccardPromotions(baseIccardPromotions);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseIccardPromotionsByIds(Integer[] ids)
    {
        return baseIccardPromotionsMapper.deleteBaseIccardPromotionsByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseIccardPromotionsById(Integer id)
    {
        return baseIccardPromotionsMapper.deleteBaseIccardPromotionsById(id);
    }
}
