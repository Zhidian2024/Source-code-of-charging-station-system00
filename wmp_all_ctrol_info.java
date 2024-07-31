package com.zhengbangnet.commu.wm.message;


import com.zhengbangnet.commu.wm.pack.ProtocolObjList;

/*
 *  通信协议消息定义，修改自研究院plat_wm_def.h
 *  Eichong ZDY, 2020-4-23
 * */

/************************** 充电桩控制板数据结构定义 *****************************/
public class wmp_all_ctrol_info {
    public byte[] res = new byte[3];               // 保留

    // CCU信息
    public ProtocolObjList<wmp_ctrol_info> ccu_data = new ProtocolObjList(40);
}
