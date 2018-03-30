package com.abewang.designpatterns.proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Abe Wang同学的老婆
 * @Author Abe wang
 * @Date 3/30/2018.
 */
public class Wife extends UnicastRemoteObject implements WifeRemote {
    private String nickname;

    private AbeWangState abeWangState;

    private AbeWangState study = new Study(this);

    private AbeWangState eat = new Eat(this);

    private AbeWangState sleep = new Sleep(this);

    public Wife(String nickname) throws RemoteException {
        abeWangState = sleep;
        this.nickname = nickname;
    }

    @Override
    public void study() throws RemoteException {
        abeWangState.study();
    }

    @Override
    public void eat() throws RemoteException {
        abeWangState.eat();
    }

    @Override
    public void sleep() throws RemoteException {
        abeWangState.sleep();
    }

    // region getter & setter
    @Override
    public String getNickname() throws RemoteException {
        return nickname;
    }

    @Override
    public AbeWangState getAbeWangState() {
        return abeWangState;
    }

    public void setAbeWangState(AbeWangState abeWangState) {
        this.abeWangState = abeWangState;
    }

    public AbeWangState getStudy() {
        return study;
    }

    public AbeWangState getEat() {
        return eat;
    }

    public AbeWangState getSleep() {
        return sleep;
    }

    // endregion
}
