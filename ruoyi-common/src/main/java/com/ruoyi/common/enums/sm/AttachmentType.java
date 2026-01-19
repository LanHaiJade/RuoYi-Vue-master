package com.ruoyi.common.enums.sm;

import com.ruoyi.common.utils.sm.StringUtil;

/**
 * 
 * 类名称：AttachmentType
 * 类描述：附件类别
 * 修改人：liduo
 * 修改时间：2020年11月4日 上午11:10:39
 * 修改备注：
 *
 */
public enum AttachmentType
{
  Avatar(1, "个人头像"), 
  Goods(2, "商品图片"), 
  Alipay(3, "支付宝支付"), 
  WeiXin(4, "微信支付"), 
  BaiDu(5, "百度钱包"), 
  JD(6, "京东钱包"), 
  QQ(7, "QQ钱包"), 
  SbQrCode(8, "设备二维码"), 
  APK(9, "最新APP"), 
  ADV1(11, "视频广告位1"), 
  ADV2(12, "视频广告位2"), 
  ADV3(13, "视频广告位3"), 
  ADV4(14, "视频广告位4"), 
  ADV5(15, "视频广告位5"), 
  ADV6(21, "图片广告位1"), 
  ADV7(22, "图片广告位2"), 
  ADV8(23, "图片广告位3"), 
  ADV9(24, "图片广告位4"), 
  ADV10(25, "图片广告位5"), 
  PayInfo(16, "非现金收支标识"), 

  GoodsBrand(30, "商品品牌"), 
  GoodsCategory(31, "商品分类"), 
  GoodsDesc(32, "商品图片"), 

  ScrollImg1(17, "滚动图片1"), 
  ScrollImg2(18, "滚动图片2"), 
  ScrollImg3(19, "滚动图片3"), 

  G_Img1(41, "首页滚动1"), 
  G_Img2(42, "首页滚动2"), 
  G_Img3(43, "首页滚动3"), 
  G_Img4(44, "首页滚动4"), 
  G_Img5(45, "首页滚动5"), 

  Comment(26, "评论图片"), 

  A_Img1(35, "首页广告1"),
  
  ID_FRONT(50,"身份证正面"),
  ID_BACK(51,"身份证反面"),
  STORR_PIC(52,"门店门口照片"),
  INDOOR_PIC(53,"店内照片"),
  
  advAfterPay(54,"支付后广告"),
  ADV(55,"轮播广告"),
  
  TER_LOG(56,"终端日志"),
  ADMIN_LOGO(57,"后台LOGO"),
  
  license_Pic(58,"营业执照"),
  cert_Pic(59,"登记证书"),
  organization_Pic(60,"组织机构代码证"),
  qualification1(61,"行业资质证书1"),
  qualification2(62,"行业资质证书2"),
  qualification3(63,"行业资质证书3"),
  qualification4(64,"行业资质证书4"),
  qualification5(65,"行业资质证书5"),
  
  ali_scenePic(66,"门店门头照"),
  ali_boardPic(67,"门店内景照"),
  
  contact_id_doc_copy(68,"微信超级管理员身份证件正面"),
  contact_id_doc_copy_back(69,"微信超级管理员身份证件正面"),
  business_authorization_letter(70,"微信超级管理员业务授权函"),
  
  importCard(71,"导入会员卡"),
  
  //支付宝直付通进件使用
  aliZ1(72,"证件正面"),
  aliZ2(73,"证件反面"),
  aliZ3(74,"内景照片"),
  aliZ4(75,"门头照片"),
  aliZ5(76,"法人正面"),
  aliZ6(77,"法人反面"),
  
  //拍报机模板
  pbj1(80,"模板1"),
  pbj2(81,"模板1"),
  pbj3(82,"模板1"),
  pbj4(83,"模板1"),
  pbj5(84,"模板1"),
  pbj6(85,"模板1"),
  pbj7(86,"模板1"),
  pbj8(87,"模板1"),
  pbj9(88,"模板1"),
  pbj10(89,"模板1"),
  pbj11(90,"模板1"),
  pbj12(91,"模板1"),
  pbj13(92,"模板1"),
  pbj14(93,"模板1"),
  pbj15(94,"模板1"),
  pbj16(95,"模板1"),
  pbj17(96,"模板1"),
  pbj18(97,"模板1"),
  pbj19(98,"模板1"),
  pbj20(99,"模板1"),
  
  ;

  private int type;
  private String name;

  private AttachmentType(int type, String name) {
    this.type = type;
    this.name = name;
  }

  public int getType() {
    return this.type;
  }

  public String getName() {
    return this.name;
  }

  public static int getType(String name) {
    for (AttachmentType us : values()) {
      if (StringUtil.equals(name, us.getName())) {
        return us.getType();
      }
    }
    return -1;
  }

  public static String getName(int type) {
    for (AttachmentType us : values()) {
      if (us.getType() == type) {
        return us.getName();
      }
    }
    return null;
  }
}