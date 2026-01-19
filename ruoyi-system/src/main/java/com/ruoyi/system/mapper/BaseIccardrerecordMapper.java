package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.common.domain.BaseIccardrerecord;
import com.ruoyi.common.domain.vo.BaseIccardrerecordVo;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseIccardrerecordMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseIccardrerecord selectBaseIccardrerecordById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseIccardrerecord 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseIccardrerecord> selectBaseIccardrerecordList(BaseIccardrerecord baseIccardrerecord);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseIccardrerecord 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseIccardrerecord(BaseIccardrerecord baseIccardrerecord);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseIccardrerecord 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseIccardrerecord(BaseIccardrerecord baseIccardrerecord);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseIccardrerecordById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseIccardrerecordByIds(Long[] ids);


    int insertBaseIccardrerecordList(List<BaseIccardrerecord> baseIccardrerecord);

    /**
     * 分页查询
     * @param baseIccardrerecordVo
     * @return
     */
    List<BaseIccardrerecordVo> selectBaseIccardrerecordVoList(BaseIccardrerecordVo baseIccardrerecordVo);
}
