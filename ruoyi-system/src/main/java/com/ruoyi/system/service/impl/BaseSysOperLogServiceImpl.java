package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseSysOperLogMapper;
import com.ruoyi.common.domain.BaseSysOperLog;
import com.ruoyi.system.service.IBaseSysOperLogService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseSysOperLogServiceImpl implements IBaseSysOperLogService 
{
    @Autowired
    private BaseSysOperLogMapper baseSysOperLogMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseSysOperLog selectBaseSysOperLogById(Long id)
    {
        return baseSysOperLogMapper.selectBaseSysOperLogById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseSysOperLog 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseSysOperLog> selectBaseSysOperLogList(BaseSysOperLog baseSysOperLog)
    {
        return baseSysOperLogMapper.selectBaseSysOperLogList(baseSysOperLog);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseSysOperLog 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseSysOperLog(BaseSysOperLog baseSysOperLog)
    {
        baseSysOperLog.setCreateTime(DateUtils.getNowDate());
        return baseSysOperLogMapper.insertBaseSysOperLog(baseSysOperLog);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseSysOperLog 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseSysOperLog(BaseSysOperLog baseSysOperLog)
    {
        return baseSysOperLogMapper.updateBaseSysOperLog(baseSysOperLog);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseSysOperLogByIds(Long[] ids)
    {
        return baseSysOperLogMapper.deleteBaseSysOperLogByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseSysOperLogById(Long id)
    {
        return baseSysOperLogMapper.deleteBaseSysOperLogById(id);
    }
}
