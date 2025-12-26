package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseTransferAccountMapper;
import com.ruoyi.system.domain.BaseTransferAccount;
import com.ruoyi.system.service.IBaseTransferAccountService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseTransferAccountServiceImpl implements IBaseTransferAccountService 
{
    @Autowired
    private BaseTransferAccountMapper baseTransferAccountMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseTransferAccount selectBaseTransferAccountById(Long id)
    {
        return baseTransferAccountMapper.selectBaseTransferAccountById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseTransferAccount 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseTransferAccount> selectBaseTransferAccountList(BaseTransferAccount baseTransferAccount)
    {
        return baseTransferAccountMapper.selectBaseTransferAccountList(baseTransferAccount);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseTransferAccount 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseTransferAccount(BaseTransferAccount baseTransferAccount)
    {
        baseTransferAccount.setCreateTime(DateUtils.getNowDate());
        return baseTransferAccountMapper.insertBaseTransferAccount(baseTransferAccount);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseTransferAccount 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseTransferAccount(BaseTransferAccount baseTransferAccount)
    {
        baseTransferAccount.setUpdateTime(DateUtils.getNowDate());
        return baseTransferAccountMapper.updateBaseTransferAccount(baseTransferAccount);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseTransferAccountByIds(Long[] ids)
    {
        return baseTransferAccountMapper.deleteBaseTransferAccountByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseTransferAccountById(Long id)
    {
        return baseTransferAccountMapper.deleteBaseTransferAccountById(id);
    }
}
