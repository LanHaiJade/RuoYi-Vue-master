package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.common.domain.BaseFaq;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseFaqMapper 
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
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseFaqById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseFaqByIds(Long[] ids);
}
