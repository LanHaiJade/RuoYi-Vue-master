package com.ruoyi.common.utils.sm;

import com.alibaba.fastjson2.JSONObject;
import com.ruoyi.common.utils.http.HttpUtils;
import com.ruoyi.common.domain.BaseSocketStatistics;

public class SbOnline {

    private static final String URL = "/hbshengma/api/getSbOnline.action";

    public static boolean getSbIsOnline(BaseSocketStatistics socketStatistics){
        boolean flag = false;
        if(socketStatistics != null && socketStatistics.getServerIp() != null
            && StringUtil.notNull(socketStatistics.getServerIp())
            && StringUtil.notNull(socketStatistics.getSbId())){
            String reqUrl = "http://" + socketStatistics.getServerIp() + URL;
            String res = HttpUtils.sendGet(reqUrl, "sbId="+socketStatistics.getSbId());
            if(StringUtil.notNull(res)){
                JSONObject uj = JSONObject.parseObject(res);
                if (uj != null && uj.getString("code") != null && "0".equals(uj.getString("code"))) {
                    return uj.getBoolean("data");
                }
            }
        }
        return flag;
    }

}
