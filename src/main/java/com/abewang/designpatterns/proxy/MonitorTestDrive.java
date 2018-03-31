package com.abewang.designpatterns.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @Author Abe
 * @Date 2018/3/30.
 */
public class MonitorTestDrive {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        // stub
        WifeRemote wifeRemote = (WifeRemote)Naming.lookup("rmi://127.0.0.1:10010/test");
        Monitor monitor = new Monitor(wifeRemote);
        monitor.report();
    }
}
