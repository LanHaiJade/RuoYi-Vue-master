package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseCashinfoMapper;
import com.ruoyi.common.domain.BaseCashinfo;
import com.ruoyi.system.service.IBaseCashinfoService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseCashinfoServiceImpl implements IBaseCashinfoService 
{
    @Autowired
    private BaseCashinfoMapper baseCashinfoMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseCashinfo selectBaseCashinfoById(Long id)
    {
        return baseCashinfoMapper.selectBaseCashinfoById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseCashinfo 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseCashinfo> selectBaseCashinfoList(BaseCashinfo baseCashinfo)
    {
        return baseCashinfoMapper.selectBaseCashinfoList(baseCashinfo);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseCashinfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseCashinfo(BaseCashinfo baseCashinfo)
    {
        baseCashinfo.setCreateTime(DateUtils.getNowDate());
        return baseCashinfoMapper.insertBaseCashinfo(baseCashinfo);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseCashinfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseCashinfo(BaseCashinfo baseCashinfo)
    {
        baseCashinfo.setUpdateTime(DateUtils.getNowDate());
        return baseCashinfoMapper.updateBaseCashinfo(baseCashinfo);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseCashinfoByIds(Long[] ids)
    {
        return baseCashinfoMapper.deleteBaseCashinfoByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseCashinfoById(Long id)
    {
        return baseCashinfoMapper.deleteBaseCashinfoById(id);
    }
}
