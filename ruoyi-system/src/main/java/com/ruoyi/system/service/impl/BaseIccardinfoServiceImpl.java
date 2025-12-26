package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseIccardinfoMapper;
import com.ruoyi.system.domain.BaseIccardinfo;
import com.ruoyi.system.service.IBaseIccardinfoService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseIccardinfoServiceImpl implements IBaseIccardinfoService 
{
    @Autowired
    private BaseIccardinfoMapper baseIccardinfoMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseIccardinfo selectBaseIccardinfoById(Long id)
    {
        return baseIccardinfoMapper.selectBaseIccardinfoById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseIccardinfo 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseIccardinfo> selectBaseIccardinfoList(BaseIccardinfo baseIccardinfo)
    {
        return baseIccardinfoMapper.selectBaseIccardinfoList(baseIccardinfo);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseIccardinfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseIccardinfo(BaseIccardinfo baseIccardinfo)
    {
        baseIccardinfo.setCreateTime(DateUtils.getNowDate());
        return baseIccardinfoMapper.insertBaseIccardinfo(baseIccardinfo);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseIccardinfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseIccardinfo(BaseIccardinfo baseIccardinfo)
    {
        baseIccardinfo.setUpdateTime(DateUtils.getNowDate());
        return baseIccardinfoMapper.updateBaseIccardinfo(baseIccardinfo);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseIccardinfoByIds(Long[] ids)
    {
        return baseIccardinfoMapper.deleteBaseIccardinfoByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseIccardinfoById(Long id)
    {
        return baseIccardinfoMapper.deleteBaseIccardinfoById(id);
    }
}
