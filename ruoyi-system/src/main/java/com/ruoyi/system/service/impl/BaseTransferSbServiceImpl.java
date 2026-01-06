package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseTransferSbMapper;
import com.ruoyi.common.domain.BaseTransferSb;
import com.ruoyi.system.service.IBaseTransferSbService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseTransferSbServiceImpl implements IBaseTransferSbService 
{
    @Autowired
    private BaseTransferSbMapper baseTransferSbMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseTransferSb selectBaseTransferSbById(Integer id)
    {
        return baseTransferSbMapper.selectBaseTransferSbById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseTransferSb 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseTransferSb> selectBaseTransferSbList(BaseTransferSb baseTransferSb)
    {
        return baseTransferSbMapper.selectBaseTransferSbList(baseTransferSb);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseTransferSb 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseTransferSb(BaseTransferSb baseTransferSb)
    {
        baseTransferSb.setCreateTime(DateUtils.getNowDate());
        return baseTransferSbMapper.insertBaseTransferSb(baseTransferSb);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseTransferSb 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseTransferSb(BaseTransferSb baseTransferSb)
    {
        baseTransferSb.setUpdateTime(DateUtils.getNowDate());
        return baseTransferSbMapper.updateBaseTransferSb(baseTransferSb);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseTransferSbByIds(Integer[] ids)
    {
        return baseTransferSbMapper.deleteBaseTransferSbByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseTransferSbById(Integer id)
    {
        return baseTransferSbMapper.deleteBaseTransferSbById(id);
    }
}
