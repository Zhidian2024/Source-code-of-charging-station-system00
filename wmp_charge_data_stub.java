package com.zhengbangnet.commu.wm.message;

/*
*  根据消息定义类、利用Java反射机制，由工具类MakeStubFile自动生成
*  浙江爱充网络, 2020-07-03
* */

import com.zhengbangnet.commu.wm.pack.PackException;
import com.zhengbangnet.commu.wm.pack.PackStubIF;
import com.zhengbangnet.commu.wm.pack.PackUtil;

public class wmp_charge_data_stub implements PackStubIF {

    @Override
    public void pack(PackUtil.Buf buf, Object o) throws PackException {
        wmp_charge_data wmp_charge_data = (wmp_charge_data)o;
        PackUtil.putByte(buf, wmp_charge_data.port_id.getByte());
        PackUtil.putByte(buf, wmp_charge_data.charge_soc.getByte());
        PackUtil.putByteArray(buf, wmp_charge_data.res);
        PackUtil.putInt(buf, wmp_charge_data.charge_time.getInt());
        PackUtil.putInt(buf, wmp_charge_data.total_quantity.getInt());
        PackUtil.putInt(buf, wmp_charge_data.total_cost.getInt());
        PackUtil.putShort(buf, wmp_charge_data.need_time.getShort());
        PackUtil.putByte(buf, wmp_charge_data.res2);
        PackUtil.putProtocolObjList(buf, wmp_charge_data.slot_data);
    }

    @Override
    public Object unpack(PackUtil.Buf buf) throws PackException { 
        wmp_charge_data wmp_charge_data = new wmp_charge_data();

        wmp_charge_data.port_id.setByte(PackUtil.getByte(buf));
        wmp_charge_data.charge_soc.setByte(PackUtil.getByte(buf));
        PackUtil.parseByteArray(buf, wmp_charge_data.res);
        wmp_charge_data.charge_time.setInt(PackUtil.getInt(buf));
        wmp_charge_data.total_quantity.setInt(PackUtil.getInt(buf));
        wmp_charge_data.total_cost.setInt(PackUtil.getInt(buf));
        wmp_charge_data.need_time.setShort(PackUtil.getShort(buf));
        wmp_charge_data.res2 = PackUtil.getByte(buf);
        PackUtil.parseProtocolObjList(buf, wmp_charge_data.slot_data, wmp_slot_data.class);

        return wmp_charge_data;
    }
}

