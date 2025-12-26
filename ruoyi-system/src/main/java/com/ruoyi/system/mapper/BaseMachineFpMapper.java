package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BaseMachineFp;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseMachineFpMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseMachineFp selectBaseMachineFpById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineFp 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseMachineFp> selectBaseMachineFpList(BaseMachineFp baseMachineFp);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineFp 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseMachineFp(BaseMachineFp baseMachineFp);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineFp 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseMachineFp(BaseMachineFp baseMachineFp);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseMachineFpById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseMachineFpByIds(Long[] ids);
}
