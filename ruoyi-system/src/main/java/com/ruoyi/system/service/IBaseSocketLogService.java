package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BaseSocketLog;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseSocketLogService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseSocketLog selectBaseSocketLogById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseSocketLog 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseSocketLog> selectBaseSocketLogList(BaseSocketLog baseSocketLog);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseSocketLog 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseSocketLog(BaseSocketLog baseSocketLog);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseSocketLog 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseSocketLog(BaseSocketLog baseSocketLog);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseSocketLogByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseSocketLogById(Long id);
}
