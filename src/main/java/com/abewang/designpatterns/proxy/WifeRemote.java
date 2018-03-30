package com.abewang.designpatterns.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @Author Abe
 * @Date 2018/3/30.
 */
public interface WifeRemote extends Remote {
    void study() throws RemoteException;

    void eat() throws RemoteException;

    void sleep() throws RemoteException;

    String getNickname() throws RemoteException;

    AbeWangState getAbeWangState() throws RemoteException;
}
