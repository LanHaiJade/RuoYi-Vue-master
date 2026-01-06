package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.domain.BaseUserAlipaynfc;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseUserAlipaynfcService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseUserAlipaynfc selectBaseUserAlipaynfcById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseUserAlipaynfc 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseUserAlipaynfc> selectBaseUserAlipaynfcList(BaseUserAlipaynfc baseUserAlipaynfc);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseUserAlipaynfc 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseUserAlipaynfc(BaseUserAlipaynfc baseUserAlipaynfc);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseUserAlipaynfc 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseUserAlipaynfc(BaseUserAlipaynfc baseUserAlipaynfc);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseUserAlipaynfcByIds(Integer[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseUserAlipaynfcById(Integer id);
}
