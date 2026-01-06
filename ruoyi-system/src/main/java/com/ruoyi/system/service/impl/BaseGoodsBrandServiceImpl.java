package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseGoodsBrandMapper;
import com.ruoyi.common.domain.BaseGoodsBrand;
import com.ruoyi.system.service.IBaseGoodsBrandService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseGoodsBrandServiceImpl implements IBaseGoodsBrandService 
{
    @Autowired
    private BaseGoodsBrandMapper baseGoodsBrandMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseGoodsBrand selectBaseGoodsBrandById(Long id)
    {
        return baseGoodsBrandMapper.selectBaseGoodsBrandById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseGoodsBrand 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseGoodsBrand> selectBaseGoodsBrandList(BaseGoodsBrand baseGoodsBrand)
    {
        return baseGoodsBrandMapper.selectBaseGoodsBrandList(baseGoodsBrand);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseGoodsBrand 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseGoodsBrand(BaseGoodsBrand baseGoodsBrand)
    {
        baseGoodsBrand.setCreateTime(DateUtils.getNowDate());
        return baseGoodsBrandMapper.insertBaseGoodsBrand(baseGoodsBrand);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseGoodsBrand 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseGoodsBrand(BaseGoodsBrand baseGoodsBrand)
    {
        baseGoodsBrand.setUpdateTime(DateUtils.getNowDate());
        return baseGoodsBrandMapper.updateBaseGoodsBrand(baseGoodsBrand);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseGoodsBrandByIds(Long[] ids)
    {
        return baseGoodsBrandMapper.deleteBaseGoodsBrandByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseGoodsBrandById(Long id)
    {
        return baseGoodsBrandMapper.deleteBaseGoodsBrandById(id);
    }
}
