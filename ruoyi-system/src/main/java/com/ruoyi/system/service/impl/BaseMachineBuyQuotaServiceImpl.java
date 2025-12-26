package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseMachineBuyQuotaMapper;
import com.ruoyi.system.domain.BaseMachineBuyQuota;
import com.ruoyi.system.service.IBaseMachineBuyQuotaService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseMachineBuyQuotaServiceImpl implements IBaseMachineBuyQuotaService 
{
    @Autowired
    private BaseMachineBuyQuotaMapper baseMachineBuyQuotaMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseMachineBuyQuota selectBaseMachineBuyQuotaById(Integer id)
    {
        return baseMachineBuyQuotaMapper.selectBaseMachineBuyQuotaById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineBuyQuota 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseMachineBuyQuota> selectBaseMachineBuyQuotaList(BaseMachineBuyQuota baseMachineBuyQuota)
    {
        return baseMachineBuyQuotaMapper.selectBaseMachineBuyQuotaList(baseMachineBuyQuota);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineBuyQuota 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseMachineBuyQuota(BaseMachineBuyQuota baseMachineBuyQuota)
    {
        return baseMachineBuyQuotaMapper.insertBaseMachineBuyQuota(baseMachineBuyQuota);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineBuyQuota 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseMachineBuyQuota(BaseMachineBuyQuota baseMachineBuyQuota)
    {
        baseMachineBuyQuota.setUpdateTime(DateUtils.getNowDate());
        return baseMachineBuyQuotaMapper.updateBaseMachineBuyQuota(baseMachineBuyQuota);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineBuyQuotaByIds(Integer[] ids)
    {
        return baseMachineBuyQuotaMapper.deleteBaseMachineBuyQuotaByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineBuyQuotaById(Integer id)
    {
        return baseMachineBuyQuotaMapper.deleteBaseMachineBuyQuotaById(id);
    }
}
