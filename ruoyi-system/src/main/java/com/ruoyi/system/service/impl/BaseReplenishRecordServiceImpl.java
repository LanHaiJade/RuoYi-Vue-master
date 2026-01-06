package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseReplenishRecordMapper;
import com.ruoyi.common.domain.BaseReplenishRecord;
import com.ruoyi.system.service.IBaseReplenishRecordService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseReplenishRecordServiceImpl implements IBaseReplenishRecordService 
{
    @Autowired
    private BaseReplenishRecordMapper baseReplenishRecordMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseReplenishRecord selectBaseReplenishRecordById(Long id)
    {
        return baseReplenishRecordMapper.selectBaseReplenishRecordById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseReplenishRecord 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseReplenishRecord> selectBaseReplenishRecordList(BaseReplenishRecord baseReplenishRecord)
    {
        return baseReplenishRecordMapper.selectBaseReplenishRecordList(baseReplenishRecord);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseReplenishRecord 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseReplenishRecord(BaseReplenishRecord baseReplenishRecord)
    {
        baseReplenishRecord.setCreateTime(DateUtils.getNowDate());
        return baseReplenishRecordMapper.insertBaseReplenishRecord(baseReplenishRecord);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseReplenishRecord 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseReplenishRecord(BaseReplenishRecord baseReplenishRecord)
    {
        baseReplenishRecord.setUpdateTime(DateUtils.getNowDate());
        return baseReplenishRecordMapper.updateBaseReplenishRecord(baseReplenishRecord);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseReplenishRecordByIds(Long[] ids)
    {
        return baseReplenishRecordMapper.deleteBaseReplenishRecordByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseReplenishRecordById(Long id)
    {
        return baseReplenishRecordMapper.deleteBaseReplenishRecordById(id);
    }
}
