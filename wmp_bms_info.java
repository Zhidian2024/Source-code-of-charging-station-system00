package com.zhengbangnet.commu.wm.message;

import com.zhengbangnet.commu.wm.pack.ProtocolStr;
import com.zhengbangnet.commu.wm.pack.UnsignedChar;
import com.zhengbangnet.commu.wm.pack.UnsignedShort;

/*
 *  通信协议消息定义，修改自研究院plat_wm_def.h
 *  Eichong ZDY, 2020-5-27
 * */

public class wmp_bms_info {
    public byte  bms_type;                // 1   BMS通讯标准  0—2011；1—2015。
    public byte  batt_soc;                // 2   整车动力蓄电池荷电状态，范围0～100。精度1%
    public UnsignedShort cell_charge_volt_max = new UnsignedShort();    // 3   单体最高允许充电电压，范围0～2400。精度0.1V

    public UnsignedShort charge_curr_max = new UnsignedShort();         // 4   最高允许充电电流，精度0.01A
    public UnsignedShort batt_volt_max = new UnsignedShort();           // 5   整车动力蓄电池额定总电压，精度0.1V

    public UnsignedShort batt_volt_now = new UnsignedShort();           // 6   整车动力蓄电池当前电压，精度0.1V
    public UnsignedShort batt_capacity = new UnsignedShort();           // 7   整车动力蓄电池额定容量 0.1AH

    public UnsignedShort batt_quantity = new UnsignedShort();           // 8   整车动力蓄电池标称能量，范围0～10000。精度0.001kWh
    public UnsignedShort batt_temp_max = new UnsignedShort();           // 9   最高允许温度，范围0～2500，偏移500。精度0.1oC

    public UnsignedChar battery_type = new UnsignedChar();      /* 10  电池类型: 01H:铅酸电池; 02H:氢电池; 03H:磷酸铁锂电池;
                   04H:锰酸锂电池; 05H:钴酸锂电池; 06H:三元电池;
                   07H:聚合物锂离子电池; 08H:钛酸锂电池; FFH:其他; */

    // 11  车辆识别码（VIN）
    public ProtocolStr vin = new ProtocolStr(ProtocolStr.Type.PST_ASCII, wmp_common_def.WMP_VIN_LEN);

    @Override
    public String toString() {
        return "wmp_bms_info{" +
                "bms_type=" + bms_type +
                ", batt_soc=" + batt_soc +
                ", cell_charge_volt_max=" + cell_charge_volt_max.get() +
                ", charge_curr_max=" + charge_curr_max.get() +
                ", batt_volt_max=" + batt_volt_max.get() +
                ", batt_volt_now=" + batt_volt_now.get() +
                ", batt_capacity=" + batt_capacity.get() +
                ", batt_quantity=" + batt_quantity.get() +
                ", batt_temp_max=" + batt_temp_max.get() +
                ", battery_type=" + battery_type.get() +
                ", vin=" + vin.getStr() +
                '}';
    }
} // size: 4*4+1+17=34
