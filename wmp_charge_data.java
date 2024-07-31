package com.zhengbangnet.commu.wm.message;

import com.zhengbangnet.commu.wm.pack.ProtocolObjList;
import com.zhengbangnet.commu.wm.pack.UnsignedChar;
import com.zhengbangnet.commu.wm.pack.UnsignedInt;
import com.zhengbangnet.commu.wm.pack.UnsignedShort;

/*
 *  通信协议消息定义，修改自研究院plat_wm_def.h
 *  Eichong ZDY, 2020-4-23
 * */

/************************** 充电电量数据结构定义 *****************************/
public class wmp_charge_data {

    public UnsignedChar port_id = new UnsignedChar();      // 充电端口, 从1开始
    public UnsignedChar charge_soc = new UnsignedChar();      // 充电进度：精度1%
    public byte[] res = new byte[2];// 保留

    public UnsignedInt charge_time = new UnsignedInt();     // 持续充电时间:1秒

    public UnsignedInt total_quantity = new UnsignedInt();   // 充电总电量，精度0.001kW·h
    public UnsignedInt total_cost = new UnsignedInt();       // 充电总费用，精度0.0001元

    public UnsignedShort need_time = new UnsignedShort();    // 剩余充电时间:1分钟
    public byte res2;                                       // 保留

    // 时段电量
    public ProtocolObjList<wmp_slot_data> slot_data = new ProtocolObjList<>(8);
}
