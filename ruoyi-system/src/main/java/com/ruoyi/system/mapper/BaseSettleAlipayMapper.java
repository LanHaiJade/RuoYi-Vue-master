package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.common.domain.BaseSettleAlipay;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseSettleAlipayMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseSettleAlipay selectBaseSettleAlipayById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseSettleAlipay 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseSettleAlipay> selectBaseSettleAlipayList(BaseSettleAlipay baseSettleAlipay);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseSettleAlipay 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseSettleAlipay(BaseSettleAlipay baseSettleAlipay);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseSettleAlipay 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseSettleAlipay(BaseSettleAlipay baseSettleAlipay);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseSettleAlipayById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseSettleAlipayByIds(Long[] ids);
}
