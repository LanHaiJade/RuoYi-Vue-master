package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BaseMemberWeixin;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseMemberWeixinService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseMemberWeixin selectBaseMemberWeixinById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMemberWeixin 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseMemberWeixin> selectBaseMemberWeixinList(BaseMemberWeixin baseMemberWeixin);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMemberWeixin 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseMemberWeixin(BaseMemberWeixin baseMemberWeixin);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMemberWeixin 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseMemberWeixin(BaseMemberWeixin baseMemberWeixin);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseMemberWeixinByIds(Integer[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseMemberWeixinById(Integer id);
}
