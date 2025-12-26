package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseLoginLogMapper;
import com.ruoyi.system.domain.BaseLoginLog;
import com.ruoyi.system.service.IBaseLoginLogService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseLoginLogServiceImpl implements IBaseLoginLogService 
{
    @Autowired
    private BaseLoginLogMapper baseLoginLogMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseLoginLog selectBaseLoginLogById(Long id)
    {
        return baseLoginLogMapper.selectBaseLoginLogById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseLoginLog 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseLoginLog> selectBaseLoginLogList(BaseLoginLog baseLoginLog)
    {
        return baseLoginLogMapper.selectBaseLoginLogList(baseLoginLog);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseLoginLog 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseLoginLog(BaseLoginLog baseLoginLog)
    {
        baseLoginLog.setCreateTime(DateUtils.getNowDate());
        return baseLoginLogMapper.insertBaseLoginLog(baseLoginLog);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseLoginLog 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseLoginLog(BaseLoginLog baseLoginLog)
    {
        return baseLoginLogMapper.updateBaseLoginLog(baseLoginLog);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseLoginLogByIds(Long[] ids)
    {
        return baseLoginLogMapper.deleteBaseLoginLogByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseLoginLogById(Long id)
    {
        return baseLoginLogMapper.deleteBaseLoginLogById(id);
    }
}
