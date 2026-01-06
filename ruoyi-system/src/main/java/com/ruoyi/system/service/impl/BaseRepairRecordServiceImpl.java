package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseRepairRecordMapper;
import com.ruoyi.common.domain.BaseRepairRecord;
import com.ruoyi.system.service.IBaseRepairRecordService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseRepairRecordServiceImpl implements IBaseRepairRecordService 
{
    @Autowired
    private BaseRepairRecordMapper baseRepairRecordMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseRepairRecord selectBaseRepairRecordById(Long id)
    {
        return baseRepairRecordMapper.selectBaseRepairRecordById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseRepairRecord 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseRepairRecord> selectBaseRepairRecordList(BaseRepairRecord baseRepairRecord)
    {
        return baseRepairRecordMapper.selectBaseRepairRecordList(baseRepairRecord);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseRepairRecord 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseRepairRecord(BaseRepairRecord baseRepairRecord)
    {
        baseRepairRecord.setCreateTime(DateUtils.getNowDate());
        return baseRepairRecordMapper.insertBaseRepairRecord(baseRepairRecord);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseRepairRecord 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseRepairRecord(BaseRepairRecord baseRepairRecord)
    {
        baseRepairRecord.setUpdateTime(DateUtils.getNowDate());
        return baseRepairRecordMapper.updateBaseRepairRecord(baseRepairRecord);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseRepairRecordByIds(Long[] ids)
    {
        return baseRepairRecordMapper.deleteBaseRepairRecordByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseRepairRecordById(Long id)
    {
        return baseRepairRecordMapper.deleteBaseRepairRecordById(id);
    }
}
