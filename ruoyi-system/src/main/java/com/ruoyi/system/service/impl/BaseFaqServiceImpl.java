package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseFaqMapper;
import com.ruoyi.common.domain.BaseFaq;
import com.ruoyi.system.service.IBaseFaqService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseFaqServiceImpl implements IBaseFaqService 
{
    @Autowired
    private BaseFaqMapper baseFaqMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseFaq selectBaseFaqById(Long id)
    {
        return baseFaqMapper.selectBaseFaqById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseFaq 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseFaq> selectBaseFaqList(BaseFaq baseFaq)
    {
        return baseFaqMapper.selectBaseFaqList(baseFaq);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseFaq 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseFaq(BaseFaq baseFaq)
    {
        baseFaq.setCreateTime(DateUtils.getNowDate());
        return baseFaqMapper.insertBaseFaq(baseFaq);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseFaq 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseFaq(BaseFaq baseFaq)
    {
        baseFaq.setUpdateTime(DateUtils.getNowDate());
        return baseFaqMapper.updateBaseFaq(baseFaq);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseFaqByIds(Long[] ids)
    {
        return baseFaqMapper.deleteBaseFaqByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseFaqById(Long id)
    {
        return baseFaqMapper.deleteBaseFaqById(id);
    }
}
