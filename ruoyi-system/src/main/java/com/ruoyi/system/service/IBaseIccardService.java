package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.domain.BaseIccard;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseIccardService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseIccard selectBaseIccardById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseIccard 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseIccard> selectBaseIccardList(BaseIccard baseIccard);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseIccard 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseIccard(BaseIccard baseIccard);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseIccard 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseIccard(BaseIccard baseIccard);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseIccardByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseIccardById(Long id);
}
