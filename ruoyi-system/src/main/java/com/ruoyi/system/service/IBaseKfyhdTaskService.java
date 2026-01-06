package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.domain.BaseKfyhdTask;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseKfyhdTaskService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseKfyhdTask selectBaseKfyhdTaskById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseKfyhdTask 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseKfyhdTask> selectBaseKfyhdTaskList(BaseKfyhdTask baseKfyhdTask);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseKfyhdTask 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseKfyhdTask(BaseKfyhdTask baseKfyhdTask);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseKfyhdTask 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseKfyhdTask(BaseKfyhdTask baseKfyhdTask);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseKfyhdTaskByIds(Integer[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseKfyhdTaskById(Integer id);
}
