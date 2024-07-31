package com.zhengbangnet.commu.wm.message;

/*
*  根据消息定义类、利用Java反射机制，由工具类MakeStubFile自动生成
*  浙江爱充网络, 2020-07-03
* */

import com.zhengbangnet.commu.wm.pack.PackException;
import com.zhengbangnet.commu.wm.pack.PackStubIF;
import com.zhengbangnet.commu.wm.pack.PackUtil;

public class wmp_account_stub implements PackStubIF {

    @Override
    public void pack(PackUtil.Buf buf, Object o) throws PackException {
        wmp_account wmp_account = (wmp_account)o;
        PackUtil.putByte(buf, wmp_account.type);
        PackUtil.putProtocolStr(buf, wmp_account.data);
    }

    @Override
    public Object unpack(PackUtil.Buf buf) throws PackException { 
        wmp_account wmp_account = new wmp_account();

        wmp_account.type = PackUtil.getByte(buf);
        PackUtil.parseProtocolStr(buf, wmp_account.data);

        return wmp_account;
    }
}

