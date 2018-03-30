package com.abewang.designpatterns.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @Author Abe
 * @Date 2018/3/30.
 */
public class WifeRemoteTestDrive {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        WifeRemote wifeRemote = new Wife();
        LocateRegistry.createRegistry(10010);
        Naming.rebind("//127.0.0.1:10010/test", wifeRemote);
        System.out.println("服务启动成功");
    }
}
