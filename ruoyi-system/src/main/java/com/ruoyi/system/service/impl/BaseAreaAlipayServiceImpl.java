package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseAreaAlipayMapper;
import com.ruoyi.common.domain.BaseAreaAlipay;
import com.ruoyi.system.service.IBaseAreaAlipayService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseAreaAlipayServiceImpl implements IBaseAreaAlipayService 
{
    @Autowired
    private BaseAreaAlipayMapper baseAreaAlipayMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param code 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseAreaAlipay selectBaseAreaAlipayByCode(String code)
    {
        return baseAreaAlipayMapper.selectBaseAreaAlipayByCode(code);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseAreaAlipay 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseAreaAlipay> selectBaseAreaAlipayList(BaseAreaAlipay baseAreaAlipay)
    {
        return baseAreaAlipayMapper.selectBaseAreaAlipayList(baseAreaAlipay);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseAreaAlipay 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseAreaAlipay(BaseAreaAlipay baseAreaAlipay)
    {
        return baseAreaAlipayMapper.insertBaseAreaAlipay(baseAreaAlipay);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseAreaAlipay 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseAreaAlipay(BaseAreaAlipay baseAreaAlipay)
    {
        return baseAreaAlipayMapper.updateBaseAreaAlipay(baseAreaAlipay);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param codes 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseAreaAlipayByCodes(String[] codes)
    {
        return baseAreaAlipayMapper.deleteBaseAreaAlipayByCodes(codes);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param code 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseAreaAlipayByCode(String code)
    {
        return baseAreaAlipayMapper.deleteBaseAreaAlipayByCode(code);
    }
}
