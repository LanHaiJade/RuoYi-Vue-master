package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseDeliveryCodeMapper;
import com.ruoyi.system.domain.BaseDeliveryCode;
import com.ruoyi.system.service.IBaseDeliveryCodeService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseDeliveryCodeServiceImpl implements IBaseDeliveryCodeService 
{
    @Autowired
    private BaseDeliveryCodeMapper baseDeliveryCodeMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseDeliveryCode selectBaseDeliveryCodeById(Long id)
    {
        return baseDeliveryCodeMapper.selectBaseDeliveryCodeById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseDeliveryCode 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseDeliveryCode> selectBaseDeliveryCodeList(BaseDeliveryCode baseDeliveryCode)
    {
        return baseDeliveryCodeMapper.selectBaseDeliveryCodeList(baseDeliveryCode);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseDeliveryCode 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseDeliveryCode(BaseDeliveryCode baseDeliveryCode)
    {
        baseDeliveryCode.setCreateTime(DateUtils.getNowDate());
        return baseDeliveryCodeMapper.insertBaseDeliveryCode(baseDeliveryCode);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseDeliveryCode 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseDeliveryCode(BaseDeliveryCode baseDeliveryCode)
    {
        baseDeliveryCode.setUpdateTime(DateUtils.getNowDate());
        return baseDeliveryCodeMapper.updateBaseDeliveryCode(baseDeliveryCode);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseDeliveryCodeByIds(Long[] ids)
    {
        return baseDeliveryCodeMapper.deleteBaseDeliveryCodeByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseDeliveryCodeById(Long id)
    {
        return baseDeliveryCodeMapper.deleteBaseDeliveryCodeById(id);
    }
}
