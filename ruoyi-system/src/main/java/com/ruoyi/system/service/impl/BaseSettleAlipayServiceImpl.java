package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseSettleAlipayMapper;
import com.ruoyi.common.domain.BaseSettleAlipay;
import com.ruoyi.system.service.IBaseSettleAlipayService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseSettleAlipayServiceImpl implements IBaseSettleAlipayService 
{
    @Autowired
    private BaseSettleAlipayMapper baseSettleAlipayMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseSettleAlipay selectBaseSettleAlipayById(Long id)
    {
        return baseSettleAlipayMapper.selectBaseSettleAlipayById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseSettleAlipay 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseSettleAlipay> selectBaseSettleAlipayList(BaseSettleAlipay baseSettleAlipay)
    {
        return baseSettleAlipayMapper.selectBaseSettleAlipayList(baseSettleAlipay);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseSettleAlipay 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseSettleAlipay(BaseSettleAlipay baseSettleAlipay)
    {
        baseSettleAlipay.setCreateTime(DateUtils.getNowDate());
        return baseSettleAlipayMapper.insertBaseSettleAlipay(baseSettleAlipay);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseSettleAlipay 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseSettleAlipay(BaseSettleAlipay baseSettleAlipay)
    {
        baseSettleAlipay.setUpdateTime(DateUtils.getNowDate());
        return baseSettleAlipayMapper.updateBaseSettleAlipay(baseSettleAlipay);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseSettleAlipayByIds(Long[] ids)
    {
        return baseSettleAlipayMapper.deleteBaseSettleAlipayByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseSettleAlipayById(Long id)
    {
        return baseSettleAlipayMapper.deleteBaseSettleAlipayById(id);
    }
}
