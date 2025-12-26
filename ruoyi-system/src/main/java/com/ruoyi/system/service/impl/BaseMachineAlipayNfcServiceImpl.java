package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseMachineAlipayNfcMapper;
import com.ruoyi.system.domain.BaseMachineAlipayNfc;
import com.ruoyi.system.service.IBaseMachineAlipayNfcService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseMachineAlipayNfcServiceImpl implements IBaseMachineAlipayNfcService 
{
    @Autowired
    private BaseMachineAlipayNfcMapper baseMachineAlipayNfcMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseMachineAlipayNfc selectBaseMachineAlipayNfcById(Integer id)
    {
        return baseMachineAlipayNfcMapper.selectBaseMachineAlipayNfcById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineAlipayNfc 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseMachineAlipayNfc> selectBaseMachineAlipayNfcList(BaseMachineAlipayNfc baseMachineAlipayNfc)
    {
        return baseMachineAlipayNfcMapper.selectBaseMachineAlipayNfcList(baseMachineAlipayNfc);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineAlipayNfc 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseMachineAlipayNfc(BaseMachineAlipayNfc baseMachineAlipayNfc)
    {
        baseMachineAlipayNfc.setCreateTime(DateUtils.getNowDate());
        return baseMachineAlipayNfcMapper.insertBaseMachineAlipayNfc(baseMachineAlipayNfc);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineAlipayNfc 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseMachineAlipayNfc(BaseMachineAlipayNfc baseMachineAlipayNfc)
    {
        baseMachineAlipayNfc.setUpdateTime(DateUtils.getNowDate());
        return baseMachineAlipayNfcMapper.updateBaseMachineAlipayNfc(baseMachineAlipayNfc);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineAlipayNfcByIds(Integer[] ids)
    {
        return baseMachineAlipayNfcMapper.deleteBaseMachineAlipayNfcByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineAlipayNfcById(Integer id)
    {
        return baseMachineAlipayNfcMapper.deleteBaseMachineAlipayNfcById(id);
    }
}
