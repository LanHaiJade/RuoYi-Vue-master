package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BaseFaq;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseFaqService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseFaq selectBaseFaqById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseFaq 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseFaq> selectBaseFaqList(BaseFaq baseFaq);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseFaq 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseFaq(BaseFaq baseFaq);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseFaq 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseFaq(BaseFaq baseFaq);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseFaqByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseFaqById(Long id);
}
