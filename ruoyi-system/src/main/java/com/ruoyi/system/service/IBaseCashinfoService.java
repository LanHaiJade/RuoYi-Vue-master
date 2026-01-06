package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.domain.BaseCashinfo;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseCashinfoService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseCashinfo selectBaseCashinfoById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseCashinfo 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseCashinfo> selectBaseCashinfoList(BaseCashinfo baseCashinfo);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseCashinfo 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseCashinfo(BaseCashinfo baseCashinfo);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseCashinfo 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseCashinfo(BaseCashinfo baseCashinfo);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseCashinfoByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseCashinfoById(Long id);
}
