package com.abewang.designpatterns.proxy;

import java.rmi.RemoteException;

/**
 * 妻子的监视器
 * @Author Abe
 * @Date 2018/3/30.
 */
public class Monitor {
    private WifeRemote wifeRemote;

    public Monitor(WifeRemote wifeRemote) {
        this.wifeRemote = wifeRemote;
    }

    public void report() throws RemoteException {
        System.out.println("nickname: " + wifeRemote.getNickname());
        System.out.println("state: " + wifeRemote.getAbeWangState());
    }
}
