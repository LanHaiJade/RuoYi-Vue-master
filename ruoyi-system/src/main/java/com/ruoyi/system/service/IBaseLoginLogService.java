package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.domain.BaseLoginLog;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseLoginLogService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseLoginLog selectBaseLoginLogById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseLoginLog 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseLoginLog> selectBaseLoginLogList(BaseLoginLog baseLoginLog);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseLoginLog 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseLoginLog(BaseLoginLog baseLoginLog);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseLoginLog 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseLoginLog(BaseLoginLog baseLoginLog);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseLoginLogByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseLoginLogById(Long id);
}
