package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BaseIccardPromotions;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseIccardPromotionsService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseIccardPromotions selectBaseIccardPromotionsById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseIccardPromotions 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseIccardPromotions> selectBaseIccardPromotionsList(BaseIccardPromotions baseIccardPromotions);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseIccardPromotions 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseIccardPromotions(BaseIccardPromotions baseIccardPromotions);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseIccardPromotions 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseIccardPromotions(BaseIccardPromotions baseIccardPromotions);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseIccardPromotionsByIds(Integer[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseIccardPromotionsById(Integer id);
}
