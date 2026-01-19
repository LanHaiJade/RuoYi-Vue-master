package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.domain.BaseIccardRecharge;
import com.ruoyi.common.domain.vo.BaseIccardRechargeVo;

/**
 * 【 会员卡充值记录】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseIccardRechargeService 
{
    /**
     * 查询【 会员卡充值记录】
     * 
     * @param id 【 会员卡充值记录】主键
     * @return 【 会员卡充值记录】
     */
    public BaseIccardRecharge selectBaseIccardRechargeById(Long id);

    /**
     * 查询【 会员卡充值记录】列表
     * 
     * @param baseIccardRecharge 【 会员卡充值记录】
     * @return 【 会员卡充值记录】集合
     */
    public List<BaseIccardRecharge> selectBaseIccardRechargeList(BaseIccardRecharge baseIccardRecharge);

    /**
     * 新增【 会员卡充值记录】
     * 
     * @param baseIccardRecharge 【 会员卡充值记录】
     * @return 结果
     */
    public int insertBaseIccardRecharge(BaseIccardRecharge baseIccardRecharge);

    /**
     * 修改【 会员卡充值记录】
     * 
     * @param baseIccardRecharge 【 会员卡充值记录】
     * @return 结果
     */
    public int updateBaseIccardRecharge(BaseIccardRecharge baseIccardRecharge);

    /**
     * 批量删除【 会员卡充值记录】
     * 
     * @param ids 需要删除的【 会员卡充值记录】主键集合
     * @return 结果
     */
    public int deleteBaseIccardRechargeByIds(Long[] ids);

    /**
     * 删除【 会员卡充值记录】信息
     * 
     * @param id 【 会员卡充值记录】主键
     * @return 结果
     */
    public int deleteBaseIccardRechargeById(Long id);

    /**
     * 分页查询
     * @param baseIccardRecharge
     * @return
     */
    List<BaseIccardRechargeVo> selectBaseIccardRechargeVoList(BaseIccardRechargeVo baseIccardRecharge);
}
