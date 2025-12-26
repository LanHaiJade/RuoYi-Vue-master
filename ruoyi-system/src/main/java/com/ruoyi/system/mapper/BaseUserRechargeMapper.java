package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BaseUserRecharge;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseUserRechargeMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseUserRecharge selectBaseUserRechargeById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseUserRecharge 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseUserRecharge> selectBaseUserRechargeList(BaseUserRecharge baseUserRecharge);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseUserRecharge 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseUserRecharge(BaseUserRecharge baseUserRecharge);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseUserRecharge 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseUserRecharge(BaseUserRecharge baseUserRecharge);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseUserRechargeById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseUserRechargeByIds(Long[] ids);
}
