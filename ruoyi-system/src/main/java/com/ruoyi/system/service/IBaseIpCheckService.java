package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.domain.BaseIpCheck;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseIpCheckService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseIpCheck selectBaseIpCheckById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseIpCheck 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseIpCheck> selectBaseIpCheckList(BaseIpCheck baseIpCheck);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseIpCheck 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseIpCheck(BaseIpCheck baseIpCheck);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseIpCheck 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseIpCheck(BaseIpCheck baseIpCheck);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseIpCheckByIds(Integer[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseIpCheckById(Integer id);
}
