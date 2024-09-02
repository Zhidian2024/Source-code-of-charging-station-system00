package com.zhengbangnet.commu.wm.message;

/*
 *  通信协议消息定义，修改自研究院plat_wm_def.h
 *  Eichong ZDY, 2020-4-21
 * */

/************************** 实时数据结构定义 *****************************/
public class wmp_pile_status {

    public final static byte WMP_PILE_STATE_IDLE = 0;       // 待机
    public final static byte WMP_PILE_STATE_WORK = 1;       // 故障
    public final static byte WMP_PILE_STATE_MAINTENANCE = 2; // 维护
    public final static byte WMP_PILE_STATE_FAULT = 3;      // 故障

    public byte state; // 充电桩工作状态
    public byte[] res = new byte[7]; // 保留
}
