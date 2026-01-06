package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.common.domain.BaseUserMicro;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseUserMicroMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseUserMicro selectBaseUserMicroById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseUserMicro 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseUserMicro> selectBaseUserMicroList(BaseUserMicro baseUserMicro);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseUserMicro 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseUserMicro(BaseUserMicro baseUserMicro);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseUserMicro 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseUserMicro(BaseUserMicro baseUserMicro);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseUserMicroById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseUserMicroByIds(Long[] ids);
}
