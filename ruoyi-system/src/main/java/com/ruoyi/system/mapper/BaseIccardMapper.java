package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.common.domain.BaseIccard;
import com.ruoyi.common.domain.vo.BaseIccardVo;
import org.apache.ibatis.annotations.Param;

/**
 * 【IC卡】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseIccardMapper 
{
    /**
     * 查询【IC卡】
     * 
     * @param id 【IC卡】主键
     * @return 【IC卡】
     */
    public BaseIccard selectBaseIccardById(Long id);

    /**
     * 查询【IC卡】列表
     * 
     * @param baseIccard 【IC卡】
     * @return 【IC卡】集合
     */
    public List<BaseIccard> selectBaseIccardList(BaseIccard baseIccard);

    /**
     * 新增【IC卡】
     * 
     * @param baseIccard 【IC卡】
     * @return 结果
     */
    public int insertBaseIccard(BaseIccard baseIccard);

    /**
     * 修改【IC卡】
     * 
     * @param baseIccard 【IC卡】
     * @return 结果
     */
    public int updateBaseIccard(BaseIccard baseIccard);

    /**
     * 删除【IC卡】
     * 
     * @param id 【IC卡】主键
     * @return 结果
     */
    public int deleteBaseIccardById(Long id);

    /**
     * 批量删除【IC卡】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseIccardByIds(Long[] ids);

    /**
     * 多个ID查询IC卡信息
     * @param ids
     */
    List<BaseIccard> selectBaseIccardIds(@Param("ids") List<Long> ids);

    /**
     * 批量修改IC卡余额数据
     * @param iccardList
     * @return
     */
    int updateBaseIccardIds(@Param("iccardList") List<BaseIccard> iccardList);

    /**
     * 根据用户ID查询所有IC卡信息
     * @return
     */
    List<BaseIccard> selectBaseIccard(@Param("userId") Long userId,@Param("status") Long status);


    /**
     * 批量插入IC卡信息
     */
    int batchInsertBaseIccard(List<BaseIccard> list);

    /**
     * 根据卡号列表查询已存在的卡
     */
    List<BaseIccard> selectCardsByNos(@Param("cardNos") List<String> cardNos,@Param("userId") Long userId);

    /**
     * 不分页查询数据
     * @param baseIccardVo
     * @return
     */
    List<BaseIccard> selectBaseIccardListNoPage(BaseIccardVo baseIccardVo);
}
