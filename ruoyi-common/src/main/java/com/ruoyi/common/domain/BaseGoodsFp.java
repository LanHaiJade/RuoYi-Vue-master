package com.ruoyi.common.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 base_goods_fp
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseGoodsFp extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 设备ID */
    @Excel(name = "设备ID")
    private String sbId;

    /** 结算平台机柜编号 */
    @Excel(name = "结算平台机柜编号")
    private String containerid;

    /** 操作类型 create , modify , delete */
    @Excel(name = "操作类型 create , modify , delete")
    private String action;

    /** 商品id，运营商自定义 */
    @Excel(name = "商品id，运营商自定义")
    private String goodsid;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String goodsname;

    /** 商品图片地址 */
    @Excel(name = "商品图片地址")
    private String productpic;

    /** 是否扶贫商品（1：是 2:否） */
    @Excel(name = "是否扶贫商品", readConverterExp = "1=：是,2=:否")
    private Integer fpgoodsmark;

    /** 扶贫产品名称，fpgoodsmark=1时必填 */
    @Excel(name = "扶贫产品名称，fpgoodsmark=1时必填")
    private String fpwthirdpartyid;

    /** 供货商名称，fpgoodsmark=1时必填 */
    @Excel(name = "供货商名称，fpgoodsmark=1时必填")
    private String fpwthirdpartyname;

    /** 供货商名称，fpgoodsmark=1时必填 */
    @Excel(name = "供货商名称，fpgoodsmark=1时必填")
    private String suppliername;

    /** 供应商社会信用代码，fpgoodsmark=1时必填 */
    @Excel(name = "供应商社会信用代码，fpgoodsmark=1时必填")
    private String suppliercode;

    /** “销售渠道类型 01：专区，02：专柜，03：专馆（已更新）” */
    @Excel(name = "“销售渠道类型 01：专区，02：专柜，03：专馆", readConverterExp = "已=更新")
    private String salechnltp;

    /** “销售渠道编号 具体设备编号” */
    @Excel(name = "“销售渠道编号 具体设备编号”")
    private String salechnlid;

    /** 销售渠道名称 */
    @Excel(name = "销售渠道名称")
    private String salechnlnm;

    /** 店铺名称 */
    @Excel(name = "店铺名称")
    private String strnm;

    /** 商品单价,不能填空字符串 */
    @Excel(name = "商品单价,不能填空字符串")
    private Long cmdtyunitprc;

    /** 商品链接 */
    @Excel(name = "商品链接")
    private String cmdtylinks;

    /** “商品属性 销售属性 || 分隔” */
    @Excel(name = "“商品属性 销售属性 || 分隔”")
    private String cmdtyattr;

    /** 商品描述 */
    @Excel(name = "商品描述")
    private String cmdtydsc;

    /** “商品状态（专柜传1）0:下架 1:上架” */
    @Excel(name = "“商品状态", readConverterExp = "专=柜传1")
    private String cmdtyst;

    /** “优惠活动文字” */
    @Excel(name = "“优惠活动文字”")
    private String prefavy;

    /** 商品69码 */
    @Excel(name = "商品69码")
    private String cmdty69cd;

    /** 商品SKU码 */
    @Excel(name = "商品SKU码")
    private String cmdtyskucd;

    /** 商品SPU码 */
    @Excel(name = "商品SPU码")
    private String cmdtyspucd;

    /** “商品类型（专柜选2） 0 自建 1电商推送 2 物联网推送” */
    @Excel(name = "“商品类型", readConverterExp = "专=柜选2")
    private String cmdtytp;

    /** 商品品牌 */
    @Excel(name = "商品品牌")
    private String cmdtybrnd;

    /** 承诺发货时间 */
    @Excel(name = "承诺发货时间")
    private String prmsspgtm;

    /** “是否支持无理由退货 0：否，1：是” */
    @Excel(name = "“是否支持无理由退货 0：否，1：是”")
    private String wthrsprtnonrsnretgds;

    /** 保修承诺信息 */
    @Excel(name = "保修承诺信息")
    private String gntprmsinf;

    /** “是否提供发票 0：否，1：是 */
    @Excel(name = "“是否提供发票 0：否，1：是")
    private String wthrprvdinv;

    /** 1级分类code */
    @Excel(name = "1级分类code")
    private String category1code;

    /** 1级分类名称 */
    @Excel(name = "1级分类名称")
    private String category1name;

    /** 2级分类code */
    @Excel(name = "2级分类code")
    private String category2code;

    /** 2级分类名称 */
    @Excel(name = "2级分类名称")
    private String category2name;

    /** 3级分类code */
    @Excel(name = "3级分类code")
    private String code;

    /** 3级分类名称 */
    @Excel(name = "3级分类名称")
    private String categoryname;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setSbId(String sbId) 
    {
        this.sbId = sbId;
    }

    public String getSbId() 
    {
        return sbId;
    }

    public void setContainerid(String containerid) 
    {
        this.containerid = containerid;
    }

    public String getContainerid() 
    {
        return containerid;
    }

    public void setAction(String action) 
    {
        this.action = action;
    }

    public String getAction() 
    {
        return action;
    }

    public void setGoodsid(String goodsid) 
    {
        this.goodsid = goodsid;
    }

    public String getGoodsid() 
    {
        return goodsid;
    }

    public void setGoodsname(String goodsname) 
    {
        this.goodsname = goodsname;
    }

    public String getGoodsname() 
    {
        return goodsname;
    }

    public void setProductpic(String productpic) 
    {
        this.productpic = productpic;
    }

    public String getProductpic() 
    {
        return productpic;
    }

    public void setFpgoodsmark(Integer fpgoodsmark) 
    {
        this.fpgoodsmark = fpgoodsmark;
    }

    public Integer getFpgoodsmark() 
    {
        return fpgoodsmark;
    }

    public void setFpwthirdpartyid(String fpwthirdpartyid) 
    {
        this.fpwthirdpartyid = fpwthirdpartyid;
    }

    public String getFpwthirdpartyid() 
    {
        return fpwthirdpartyid;
    }

    public void setFpwthirdpartyname(String fpwthirdpartyname) 
    {
        this.fpwthirdpartyname = fpwthirdpartyname;
    }

    public String getFpwthirdpartyname() 
    {
        return fpwthirdpartyname;
    }

    public void setSuppliername(String suppliername) 
    {
        this.suppliername = suppliername;
    }

    public String getSuppliername() 
    {
        return suppliername;
    }

    public void setSuppliercode(String suppliercode) 
    {
        this.suppliercode = suppliercode;
    }

    public String getSuppliercode() 
    {
        return suppliercode;
    }

    public void setSalechnltp(String salechnltp) 
    {
        this.salechnltp = salechnltp;
    }

    public String getSalechnltp() 
    {
        return salechnltp;
    }

    public void setSalechnlid(String salechnlid) 
    {
        this.salechnlid = salechnlid;
    }

    public String getSalechnlid() 
    {
        return salechnlid;
    }

    public void setSalechnlnm(String salechnlnm) 
    {
        this.salechnlnm = salechnlnm;
    }

    public String getSalechnlnm() 
    {
        return salechnlnm;
    }

    public void setStrnm(String strnm) 
    {
        this.strnm = strnm;
    }

    public String getStrnm() 
    {
        return strnm;
    }

    public void setCmdtyunitprc(Long cmdtyunitprc) 
    {
        this.cmdtyunitprc = cmdtyunitprc;
    }

    public Long getCmdtyunitprc() 
    {
        return cmdtyunitprc;
    }

    public void setCmdtylinks(String cmdtylinks) 
    {
        this.cmdtylinks = cmdtylinks;
    }

    public String getCmdtylinks() 
    {
        return cmdtylinks;
    }

    public void setCmdtyattr(String cmdtyattr) 
    {
        this.cmdtyattr = cmdtyattr;
    }

    public String getCmdtyattr() 
    {
        return cmdtyattr;
    }

    public void setCmdtydsc(String cmdtydsc) 
    {
        this.cmdtydsc = cmdtydsc;
    }

    public String getCmdtydsc() 
    {
        return cmdtydsc;
    }

    public void setCmdtyst(String cmdtyst) 
    {
        this.cmdtyst = cmdtyst;
    }

    public String getCmdtyst() 
    {
        return cmdtyst;
    }

    public void setPrefavy(String prefavy) 
    {
        this.prefavy = prefavy;
    }

    public String getPrefavy() 
    {
        return prefavy;
    }

    public void setCmdty69cd(String cmdty69cd) 
    {
        this.cmdty69cd = cmdty69cd;
    }

    public String getCmdty69cd() 
    {
        return cmdty69cd;
    }

    public void setCmdtyskucd(String cmdtyskucd) 
    {
        this.cmdtyskucd = cmdtyskucd;
    }

    public String getCmdtyskucd() 
    {
        return cmdtyskucd;
    }

    public void setCmdtyspucd(String cmdtyspucd) 
    {
        this.cmdtyspucd = cmdtyspucd;
    }

    public String getCmdtyspucd() 
    {
        return cmdtyspucd;
    }

    public void setCmdtytp(String cmdtytp) 
    {
        this.cmdtytp = cmdtytp;
    }

    public String getCmdtytp() 
    {
        return cmdtytp;
    }

    public void setCmdtybrnd(String cmdtybrnd) 
    {
        this.cmdtybrnd = cmdtybrnd;
    }

    public String getCmdtybrnd() 
    {
        return cmdtybrnd;
    }

    public void setPrmsspgtm(String prmsspgtm) 
    {
        this.prmsspgtm = prmsspgtm;
    }

    public String getPrmsspgtm() 
    {
        return prmsspgtm;
    }

    public void setWthrsprtnonrsnretgds(String wthrsprtnonrsnretgds) 
    {
        this.wthrsprtnonrsnretgds = wthrsprtnonrsnretgds;
    }

    public String getWthrsprtnonrsnretgds() 
    {
        return wthrsprtnonrsnretgds;
    }

    public void setGntprmsinf(String gntprmsinf) 
    {
        this.gntprmsinf = gntprmsinf;
    }

    public String getGntprmsinf() 
    {
        return gntprmsinf;
    }

    public void setWthrprvdinv(String wthrprvdinv) 
    {
        this.wthrprvdinv = wthrprvdinv;
    }

    public String getWthrprvdinv() 
    {
        return wthrprvdinv;
    }

    public void setCategory1code(String category1code) 
    {
        this.category1code = category1code;
    }

    public String getCategory1code() 
    {
        return category1code;
    }

    public void setCategory1name(String category1name) 
    {
        this.category1name = category1name;
    }

    public String getCategory1name() 
    {
        return category1name;
    }

    public void setCategory2code(String category2code) 
    {
        this.category2code = category2code;
    }

    public String getCategory2code() 
    {
        return category2code;
    }

    public void setCategory2name(String category2name) 
    {
        this.category2name = category2name;
    }

    public String getCategory2name() 
    {
        return category2name;
    }

    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getCode() 
    {
        return code;
    }

    public void setCategoryname(String categoryname) 
    {
        this.categoryname = categoryname;
    }

    public String getCategoryname() 
    {
        return categoryname;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("sbId", getSbId())
            .append("containerid", getContainerid())
            .append("action", getAction())
            .append("goodsid", getGoodsid())
            .append("goodsname", getGoodsname())
            .append("productpic", getProductpic())
            .append("fpgoodsmark", getFpgoodsmark())
            .append("fpwthirdpartyid", getFpwthirdpartyid())
            .append("fpwthirdpartyname", getFpwthirdpartyname())
            .append("suppliername", getSuppliername())
            .append("suppliercode", getSuppliercode())
            .append("salechnltp", getSalechnltp())
            .append("salechnlid", getSalechnlid())
            .append("salechnlnm", getSalechnlnm())
            .append("strnm", getStrnm())
            .append("cmdtyunitprc", getCmdtyunitprc())
            .append("cmdtylinks", getCmdtylinks())
            .append("cmdtyattr", getCmdtyattr())
            .append("cmdtydsc", getCmdtydsc())
            .append("cmdtyst", getCmdtyst())
            .append("prefavy", getPrefavy())
            .append("cmdty69cd", getCmdty69cd())
            .append("cmdtyskucd", getCmdtyskucd())
            .append("cmdtyspucd", getCmdtyspucd())
            .append("cmdtytp", getCmdtytp())
            .append("cmdtybrnd", getCmdtybrnd())
            .append("prmsspgtm", getPrmsspgtm())
            .append("wthrsprtnonrsnretgds", getWthrsprtnonrsnretgds())
            .append("gntprmsinf", getGntprmsinf())
            .append("wthrprvdinv", getWthrprvdinv())
            .append("category1code", getCategory1code())
            .append("category1name", getCategory1name())
            .append("category2code", getCategory2code())
            .append("category2name", getCategory2name())
            .append("code", getCode())
            .append("categoryname", getCategoryname())
            .toString();
    }
}
