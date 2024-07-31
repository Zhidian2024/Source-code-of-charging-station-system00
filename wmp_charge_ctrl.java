package com.zhengbangnet.commu.wm.message;

import com.zhengbangnet.commu.wm.pack.UnsignedChar;
import com.zhengbangnet.commu.wm.pack.UnsignedInt;

/*
 *  通信协议消息定义，修改自研究院plat_wm_def.h
 *  Eichong ZDY, 2020-7-2
 * */

/************************** 充电输出功率控制定义 ******************************/
public class wmp_charge_ctrl {
    public UnsignedChar port_id = new UnsignedChar();   // 充电端口, 从1开始
    public byte[] res = new byte[2];                    // 保留

    public byte   type;
    public UnsignedInt powerOrPercent = new UnsignedInt();  // 输出功率: 精度1KW, 输出功率折扣: 1%
}
