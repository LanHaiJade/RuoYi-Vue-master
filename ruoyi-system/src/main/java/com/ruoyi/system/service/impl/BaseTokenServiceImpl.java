package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseTokenMapper;
import com.ruoyi.common.domain.BaseToken;
import com.ruoyi.system.service.IBaseTokenService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseTokenServiceImpl implements IBaseTokenService 
{
    @Autowired
    private BaseTokenMapper baseTokenMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseToken selectBaseTokenById(Long id)
    {
        return baseTokenMapper.selectBaseTokenById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseToken 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseToken> selectBaseTokenList(BaseToken baseToken)
    {
        return baseTokenMapper.selectBaseTokenList(baseToken);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseToken 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseToken(BaseToken baseToken)
    {
        baseToken.setCreateTime(DateUtils.getNowDate());
        return baseTokenMapper.insertBaseToken(baseToken);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseToken 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseToken(BaseToken baseToken)
    {
        return baseTokenMapper.updateBaseToken(baseToken);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseTokenByIds(Long[] ids)
    {
        return baseTokenMapper.deleteBaseTokenByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseTokenById(Long id)
    {
        return baseTokenMapper.deleteBaseTokenById(id);
    }
}
