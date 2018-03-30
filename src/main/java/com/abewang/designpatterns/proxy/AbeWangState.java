package com.abewang.designpatterns.proxy;

import java.io.Serializable;
import java.rmi.RemoteException;

/**
 * Abe Wang同学的状态
 * @Author Abe wang
 * @Date 3/30/2018.
 */
public interface AbeWangState extends Serializable {
    void eat() throws RemoteException; // 所有的远程方法都必须声明RemoteException
                                        // 否则报错“remote object implements illegal remote interface”
    void study() throws RemoteException;

    void sleep() throws RemoteException;
}
