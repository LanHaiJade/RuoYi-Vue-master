package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseKfyhdTaskMapper;
import com.ruoyi.system.domain.BaseKfyhdTask;
import com.ruoyi.system.service.IBaseKfyhdTaskService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseKfyhdTaskServiceImpl implements IBaseKfyhdTaskService 
{
    @Autowired
    private BaseKfyhdTaskMapper baseKfyhdTaskMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseKfyhdTask selectBaseKfyhdTaskById(Integer id)
    {
        return baseKfyhdTaskMapper.selectBaseKfyhdTaskById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseKfyhdTask 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseKfyhdTask> selectBaseKfyhdTaskList(BaseKfyhdTask baseKfyhdTask)
    {
        return baseKfyhdTaskMapper.selectBaseKfyhdTaskList(baseKfyhdTask);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseKfyhdTask 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseKfyhdTask(BaseKfyhdTask baseKfyhdTask)
    {
        baseKfyhdTask.setCreateTime(DateUtils.getNowDate());
        return baseKfyhdTaskMapper.insertBaseKfyhdTask(baseKfyhdTask);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseKfyhdTask 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseKfyhdTask(BaseKfyhdTask baseKfyhdTask)
    {
        baseKfyhdTask.setUpdateTime(DateUtils.getNowDate());
        return baseKfyhdTaskMapper.updateBaseKfyhdTask(baseKfyhdTask);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseKfyhdTaskByIds(Integer[] ids)
    {
        return baseKfyhdTaskMapper.deleteBaseKfyhdTaskByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseKfyhdTaskById(Integer id)
    {
        return baseKfyhdTaskMapper.deleteBaseKfyhdTaskById(id);
    }
}
