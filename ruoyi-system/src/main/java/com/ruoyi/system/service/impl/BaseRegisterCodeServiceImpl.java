package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseRegisterCodeMapper;
import com.ruoyi.common.domain.BaseRegisterCode;
import com.ruoyi.system.service.IBaseRegisterCodeService;

/**
 * 运营商注册Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseRegisterCodeServiceImpl implements IBaseRegisterCodeService 
{
    @Autowired
    private BaseRegisterCodeMapper baseRegisterCodeMapper;

    /**
     * 查询运营商注册
     * 
     * @param id 运营商注册主键
     * @return 运营商注册
     */
    @Override
    public BaseRegisterCode selectBaseRegisterCodeById(Long id)
    {
        return baseRegisterCodeMapper.selectBaseRegisterCodeById(id);
    }

    /**
     * 查询运营商注册列表
     * 
     * @param baseRegisterCode 运营商注册
     * @return 运营商注册
     */
    @Override
    public List<BaseRegisterCode> selectBaseRegisterCodeList(BaseRegisterCode baseRegisterCode)
    {
        return baseRegisterCodeMapper.selectBaseRegisterCodeList(baseRegisterCode);
    }

    /**
     * 新增运营商注册
     * 
     * @param baseRegisterCode 运营商注册
     * @return 结果
     */
    @Override
    public int insertBaseRegisterCode(BaseRegisterCode baseRegisterCode)
    {
        baseRegisterCode.setCreateTime(DateUtils.getNowDate());
        return baseRegisterCodeMapper.insertBaseRegisterCode(baseRegisterCode);
    }

    /**
     * 修改运营商注册
     * 
     * @param baseRegisterCode 运营商注册
     * @return 结果
     */
    @Override
    public int updateBaseRegisterCode(BaseRegisterCode baseRegisterCode)
    {
        return baseRegisterCodeMapper.updateBaseRegisterCode(baseRegisterCode);
    }

    /**
     * 批量删除运营商注册
     * 
     * @param ids 需要删除的运营商注册主键
     * @return 结果
     */
    @Override
    public int deleteBaseRegisterCodeByIds(Long[] ids)
    {
        return baseRegisterCodeMapper.deleteBaseRegisterCodeByIds(ids);
    }

    /**
     * 删除运营商注册信息
     * 
     * @param id 运营商注册主键
     * @return 结果
     */
    @Override
    public int deleteBaseRegisterCodeById(Long id)
    {
        return baseRegisterCodeMapper.deleteBaseRegisterCodeById(id);
    }
}
