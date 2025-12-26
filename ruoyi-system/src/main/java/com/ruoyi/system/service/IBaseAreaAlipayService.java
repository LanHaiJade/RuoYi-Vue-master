package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BaseAreaAlipay;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseAreaAlipayService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param code 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseAreaAlipay selectBaseAreaAlipayByCode(String code);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseAreaAlipay 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseAreaAlipay> selectBaseAreaAlipayList(BaseAreaAlipay baseAreaAlipay);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseAreaAlipay 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseAreaAlipay(BaseAreaAlipay baseAreaAlipay);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseAreaAlipay 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseAreaAlipay(BaseAreaAlipay baseAreaAlipay);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param codes 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseAreaAlipayByCodes(String[] codes);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param code 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseAreaAlipayByCode(String code);
}
