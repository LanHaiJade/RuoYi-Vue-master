package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.domain.BaseTransferAccount;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseTransferAccountService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseTransferAccount selectBaseTransferAccountById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseTransferAccount 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseTransferAccount> selectBaseTransferAccountList(BaseTransferAccount baseTransferAccount);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseTransferAccount 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseTransferAccount(BaseTransferAccount baseTransferAccount);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseTransferAccount 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseTransferAccount(BaseTransferAccount baseTransferAccount);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseTransferAccountByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseTransferAccountById(Long id);
}
