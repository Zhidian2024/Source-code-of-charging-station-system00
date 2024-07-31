package com.zhengbangnet.commu.wm.message;

/*
*  根据消息定义类、利用Java反射机制，由工具类MakeStubFile自动生成
*  浙江爱充网络, 2020-07-03
* */

import com.zhengbangnet.commu.wm.pack.PackException;
import com.zhengbangnet.commu.wm.pack.PackStubIF;
import com.zhengbangnet.commu.wm.pack.PackUtil;

public class wmp_charge_ctrl_stub implements PackStubIF {

    @Override
    public void pack(PackUtil.Buf buf, Object o) throws PackException {
        wmp_charge_ctrl wmp_charge_ctrl = (wmp_charge_ctrl)o;
        PackUtil.putByte(buf, wmp_charge_ctrl.port_id.getByte());
        PackUtil.putByteArray(buf, wmp_charge_ctrl.res);
        PackUtil.putByte(buf, wmp_charge_ctrl.type);
        PackUtil.putInt(buf, wmp_charge_ctrl.powerOrPercent.getInt());
    }

    @Override
    public Object unpack(PackUtil.Buf buf) throws PackException { 
        wmp_charge_ctrl wmp_charge_ctrl = new wmp_charge_ctrl();

        wmp_charge_ctrl.port_id.setByte(PackUtil.getByte(buf));
        PackUtil.parseByteArray(buf, wmp_charge_ctrl.res);
        wmp_charge_ctrl.type = PackUtil.getByte(buf);
        wmp_charge_ctrl.powerOrPercent.setInt(PackUtil.getInt(buf));

        return wmp_charge_ctrl;
    }
}

