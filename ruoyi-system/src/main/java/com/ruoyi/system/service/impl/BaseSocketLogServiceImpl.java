package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseSocketLogMapper;
import com.ruoyi.system.domain.BaseSocketLog;
import com.ruoyi.system.service.IBaseSocketLogService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseSocketLogServiceImpl implements IBaseSocketLogService 
{
    @Autowired
    private BaseSocketLogMapper baseSocketLogMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseSocketLog selectBaseSocketLogById(Long id)
    {
        return baseSocketLogMapper.selectBaseSocketLogById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseSocketLog 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseSocketLog> selectBaseSocketLogList(BaseSocketLog baseSocketLog)
    {
        return baseSocketLogMapper.selectBaseSocketLogList(baseSocketLog);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseSocketLog 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseSocketLog(BaseSocketLog baseSocketLog)
    {
        baseSocketLog.setCreateTime(DateUtils.getNowDate());
        return baseSocketLogMapper.insertBaseSocketLog(baseSocketLog);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseSocketLog 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseSocketLog(BaseSocketLog baseSocketLog)
    {
        return baseSocketLogMapper.updateBaseSocketLog(baseSocketLog);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseSocketLogByIds(Long[] ids)
    {
        return baseSocketLogMapper.deleteBaseSocketLogByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseSocketLogById(Long id)
    {
        return baseSocketLogMapper.deleteBaseSocketLogById(id);
    }
}
