package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.common.domain.BaseRegisterCode;

/**
 * 运营商注册Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseRegisterCodeMapper 
{
    /**
     * 查询运营商注册
     * 
     * @param id 运营商注册主键
     * @return 运营商注册
     */
    public BaseRegisterCode selectBaseRegisterCodeById(Long id);

    /**
     * 查询运营商注册列表
     * 
     * @param baseRegisterCode 运营商注册
     * @return 运营商注册集合
     */
    public List<BaseRegisterCode> selectBaseRegisterCodeList(BaseRegisterCode baseRegisterCode);

    /**
     * 新增运营商注册
     * 
     * @param baseRegisterCode 运营商注册
     * @return 结果
     */
    public int insertBaseRegisterCode(BaseRegisterCode baseRegisterCode);

    /**
     * 修改运营商注册
     * 
     * @param baseRegisterCode 运营商注册
     * @return 结果
     */
    public int updateBaseRegisterCode(BaseRegisterCode baseRegisterCode);

    /**
     * 删除运营商注册
     * 
     * @param id 运营商注册主键
     * @return 结果
     */
    public int deleteBaseRegisterCodeById(Long id);

    /**
     * 批量删除运营商注册
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseRegisterCodeByIds(Long[] ids);
}
