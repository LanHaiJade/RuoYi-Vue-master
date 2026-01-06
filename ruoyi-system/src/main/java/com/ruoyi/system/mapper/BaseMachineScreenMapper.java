package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.common.domain.BaseMachineScreen;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseMachineScreenMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseMachineScreen selectBaseMachineScreenById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineScreen 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseMachineScreen> selectBaseMachineScreenList(BaseMachineScreen baseMachineScreen);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineScreen 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseMachineScreen(BaseMachineScreen baseMachineScreen);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineScreen 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseMachineScreen(BaseMachineScreen baseMachineScreen);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseMachineScreenById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseMachineScreenByIds(Long[] ids);
}
