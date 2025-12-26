package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseBinMapper;
import com.ruoyi.system.domain.BaseBin;
import com.ruoyi.system.service.IBaseBinService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseBinServiceImpl implements IBaseBinService 
{
    @Autowired
    private BaseBinMapper baseBinMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseBin selectBaseBinById(Integer id)
    {
        return baseBinMapper.selectBaseBinById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseBin 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseBin> selectBaseBinList(BaseBin baseBin)
    {
        return baseBinMapper.selectBaseBinList(baseBin);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseBin 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseBin(BaseBin baseBin)
    {
        baseBin.setCreateTime(DateUtils.getNowDate());
        return baseBinMapper.insertBaseBin(baseBin);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseBin 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseBin(BaseBin baseBin)
    {
        baseBin.setUpdateTime(DateUtils.getNowDate());
        return baseBinMapper.updateBaseBin(baseBin);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseBinByIds(Integer[] ids)
    {
        return baseBinMapper.deleteBaseBinByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseBinById(Integer id)
    {
        return baseBinMapper.deleteBaseBinById(id);
    }
}
