package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.domain.BaseRecharge;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseRechargeService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseRecharge selectBaseRechargeById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseRecharge 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseRecharge> selectBaseRechargeList(BaseRecharge baseRecharge);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseRecharge 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseRecharge(BaseRecharge baseRecharge);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseRecharge 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseRecharge(BaseRecharge baseRecharge);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseRechargeByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseRechargeById(Long id);
}
