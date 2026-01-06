package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseUserAlipayMapper;
import com.ruoyi.common.domain.BaseUserAlipay;
import com.ruoyi.system.service.IBaseUserAlipayService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseUserAlipayServiceImpl implements IBaseUserAlipayService 
{
    @Autowired
    private BaseUserAlipayMapper baseUserAlipayMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseUserAlipay selectBaseUserAlipayById(Long id)
    {
        return baseUserAlipayMapper.selectBaseUserAlipayById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseUserAlipay 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseUserAlipay> selectBaseUserAlipayList(BaseUserAlipay baseUserAlipay)
    {
        return baseUserAlipayMapper.selectBaseUserAlipayList(baseUserAlipay);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseUserAlipay 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseUserAlipay(BaseUserAlipay baseUserAlipay)
    {
        baseUserAlipay.setCreateTime(DateUtils.getNowDate());
        return baseUserAlipayMapper.insertBaseUserAlipay(baseUserAlipay);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseUserAlipay 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseUserAlipay(BaseUserAlipay baseUserAlipay)
    {
        baseUserAlipay.setUpdateTime(DateUtils.getNowDate());
        return baseUserAlipayMapper.updateBaseUserAlipay(baseUserAlipay);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseUserAlipayByIds(Long[] ids)
    {
        return baseUserAlipayMapper.deleteBaseUserAlipayByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseUserAlipayById(Long id)
    {
        return baseUserAlipayMapper.deleteBaseUserAlipayById(id);
    }
}
