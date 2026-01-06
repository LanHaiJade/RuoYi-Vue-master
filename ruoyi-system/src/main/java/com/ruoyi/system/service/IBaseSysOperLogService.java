package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.domain.BaseSysOperLog;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseSysOperLogService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseSysOperLog selectBaseSysOperLogById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseSysOperLog 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseSysOperLog> selectBaseSysOperLogList(BaseSysOperLog baseSysOperLog);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseSysOperLog 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseSysOperLog(BaseSysOperLog baseSysOperLog);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseSysOperLog 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseSysOperLog(BaseSysOperLog baseSysOperLog);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseSysOperLogByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseSysOperLogById(Long id);
}
