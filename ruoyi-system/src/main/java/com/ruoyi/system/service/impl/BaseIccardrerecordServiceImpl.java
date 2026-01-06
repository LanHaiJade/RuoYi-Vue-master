package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseIccardrerecordMapper;
import com.ruoyi.common.domain.BaseIccardrerecord;
import com.ruoyi.system.service.IBaseIccardrerecordService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseIccardrerecordServiceImpl implements IBaseIccardrerecordService 
{
    @Autowired
    private BaseIccardrerecordMapper baseIccardrerecordMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseIccardrerecord selectBaseIccardrerecordById(Long id)
    {
        return baseIccardrerecordMapper.selectBaseIccardrerecordById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseIccardrerecord 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseIccardrerecord> selectBaseIccardrerecordList(BaseIccardrerecord baseIccardrerecord)
    {
        return baseIccardrerecordMapper.selectBaseIccardrerecordList(baseIccardrerecord);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseIccardrerecord 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseIccardrerecord(BaseIccardrerecord baseIccardrerecord)
    {
        baseIccardrerecord.setCreateTime(DateUtils.getNowDate());
        return baseIccardrerecordMapper.insertBaseIccardrerecord(baseIccardrerecord);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseIccardrerecord 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseIccardrerecord(BaseIccardrerecord baseIccardrerecord)
    {
        baseIccardrerecord.setUpdateTime(DateUtils.getNowDate());
        return baseIccardrerecordMapper.updateBaseIccardrerecord(baseIccardrerecord);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseIccardrerecordByIds(Long[] ids)
    {
        return baseIccardrerecordMapper.deleteBaseIccardrerecordByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseIccardrerecordById(Long id)
    {
        return baseIccardrerecordMapper.deleteBaseIccardrerecordById(id);
    }
}
