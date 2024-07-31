package com.zhengbangnet.commu.wm.message;

/*
*  根据消息定义类、利用Java反射机制，由工具类MakeStubFile自动生成
*  浙江爱充网络, 2020-07-03
* */

import com.zhengbangnet.commu.wm.pack.PackException;
import com.zhengbangnet.commu.wm.pack.PackStubIF;
import com.zhengbangnet.commu.wm.pack.PackUtil;

public class wmp_bms_info_stub implements PackStubIF {

    @Override
    public void pack(PackUtil.Buf buf, Object o) throws PackException {
        wmp_bms_info wmp_bms_info = (wmp_bms_info)o;
        PackUtil.putByte(buf, wmp_bms_info.bms_type);
        PackUtil.putByte(buf, wmp_bms_info.batt_soc);
        PackUtil.putShort(buf, wmp_bms_info.cell_charge_volt_max.getShort());
        PackUtil.putShort(buf, wmp_bms_info.charge_curr_max.getShort());
        PackUtil.putShort(buf, wmp_bms_info.batt_volt_max.getShort());
        PackUtil.putShort(buf, wmp_bms_info.batt_volt_now.getShort());
        PackUtil.putShort(buf, wmp_bms_info.batt_capacity.getShort());
        PackUtil.putShort(buf, wmp_bms_info.batt_quantity.getShort());
        PackUtil.putShort(buf, wmp_bms_info.batt_temp_max.getShort());
        PackUtil.putByte(buf, wmp_bms_info.battery_type.getByte());
        PackUtil.putProtocolStr(buf, wmp_bms_info.vin);
    }

    @Override
    public Object unpack(PackUtil.Buf buf) throws PackException { 
        wmp_bms_info wmp_bms_info = new wmp_bms_info();

        wmp_bms_info.bms_type = PackUtil.getByte(buf);
        wmp_bms_info.batt_soc = PackUtil.getByte(buf);
        wmp_bms_info.cell_charge_volt_max.setShort(PackUtil.getShort(buf));
        wmp_bms_info.charge_curr_max.setShort(PackUtil.getShort(buf));
        wmp_bms_info.batt_volt_max.setShort(PackUtil.getShort(buf));
        wmp_bms_info.batt_volt_now.setShort(PackUtil.getShort(buf));
        wmp_bms_info.batt_capacity.setShort(PackUtil.getShort(buf));
        wmp_bms_info.batt_quantity.setShort(PackUtil.getShort(buf));
        wmp_bms_info.batt_temp_max.setShort(PackUtil.getShort(buf));
        wmp_bms_info.battery_type.setByte(PackUtil.getByte(buf));
        PackUtil.parseProtocolStr(buf, wmp_bms_info.vin);

        return wmp_bms_info;
    }
}

