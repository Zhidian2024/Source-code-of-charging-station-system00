package com.zhengbangnet.commu.wm.message;

/*
*  根据消息定义类、利用Java反射机制，由工具类MakeStubFile自动生成
*  浙江爱充网络, 2020-07-03
* */

import com.zhengbangnet.commu.wm.pack.PackException;
import com.zhengbangnet.commu.wm.pack.PackStubIF;
import com.zhengbangnet.commu.wm.pack.PackUtil;

public class wmp_all_ctrol_info_stub implements PackStubIF {

    @Override
    public void pack(PackUtil.Buf buf, Object o) throws PackException {
        wmp_all_ctrol_info wmp_all_ctrol_info = (wmp_all_ctrol_info)o;
        PackUtil.putByteArray(buf, wmp_all_ctrol_info.res);
        PackUtil.putProtocolObjList(buf, wmp_all_ctrol_info.ccu_data);
    }

    @Override
    public Object unpack(PackUtil.Buf buf) throws PackException { 
        wmp_all_ctrol_info wmp_all_ctrol_info = new wmp_all_ctrol_info();

        PackUtil.parseByteArray(buf, wmp_all_ctrol_info.res);
        PackUtil.parseProtocolObjList(buf, wmp_all_ctrol_info.ccu_data, wmp_ctrol_info.class);

        return wmp_all_ctrol_info;
    }
}

