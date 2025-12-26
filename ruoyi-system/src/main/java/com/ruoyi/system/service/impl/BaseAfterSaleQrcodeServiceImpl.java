package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseAfterSaleQrcodeMapper;
import com.ruoyi.system.domain.BaseAfterSaleQrcode;
import com.ruoyi.system.service.IBaseAfterSaleQrcodeService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseAfterSaleQrcodeServiceImpl implements IBaseAfterSaleQrcodeService 
{
    @Autowired
    private BaseAfterSaleQrcodeMapper baseAfterSaleQrcodeMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseAfterSaleQrcode selectBaseAfterSaleQrcodeById(Long id)
    {
        return baseAfterSaleQrcodeMapper.selectBaseAfterSaleQrcodeById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseAfterSaleQrcode 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseAfterSaleQrcode> selectBaseAfterSaleQrcodeList(BaseAfterSaleQrcode baseAfterSaleQrcode)
    {
        return baseAfterSaleQrcodeMapper.selectBaseAfterSaleQrcodeList(baseAfterSaleQrcode);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseAfterSaleQrcode 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseAfterSaleQrcode(BaseAfterSaleQrcode baseAfterSaleQrcode)
    {
        baseAfterSaleQrcode.setCreateTime(DateUtils.getNowDate());
        return baseAfterSaleQrcodeMapper.insertBaseAfterSaleQrcode(baseAfterSaleQrcode);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseAfterSaleQrcode 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseAfterSaleQrcode(BaseAfterSaleQrcode baseAfterSaleQrcode)
    {
        return baseAfterSaleQrcodeMapper.updateBaseAfterSaleQrcode(baseAfterSaleQrcode);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseAfterSaleQrcodeByIds(Long[] ids)
    {
        return baseAfterSaleQrcodeMapper.deleteBaseAfterSaleQrcodeByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseAfterSaleQrcodeById(Long id)
    {
        return baseAfterSaleQrcodeMapper.deleteBaseAfterSaleQrcodeById(id);
    }
}
