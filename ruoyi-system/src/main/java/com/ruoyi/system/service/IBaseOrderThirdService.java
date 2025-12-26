package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BaseOrderThird;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseOrderThirdService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseOrderThird selectBaseOrderThirdById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseOrderThird 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseOrderThird> selectBaseOrderThirdList(BaseOrderThird baseOrderThird);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseOrderThird 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseOrderThird(BaseOrderThird baseOrderThird);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseOrderThird 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseOrderThird(BaseOrderThird baseOrderThird);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseOrderThirdByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseOrderThirdById(Long id);
}
