package com.abewang.designpatterns.proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Abe Wang同学的老婆
 * @Author Abe wang
 * @Date 3/30/2018.
 */
public class Wife extends UnicastRemoteObject implements WifeRemote {
    private AbeWangState abeWangState;

    private Study study = new Study(this);

    private Eat eat = new Eat(this);

    private Sleep sleep = new Sleep(this);

    public Wife() throws RemoteException {
        abeWangState = sleep;
    }

    public void setAbeWangState(AbeWangState abeWangState) {
        this.abeWangState = abeWangState;
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
    public Study getStudy() {
        return study;
    }

    public void setStudy(Study study) {
        this.study = study;
    }

    public Eat getEat() {
        return eat;
    }

    public void setEat(Eat eat) {
        this.eat = eat;
    }

    public Sleep getSleep() {
        return sleep;
    }

    public void setSleep(Sleep sleep) {
        this.sleep = sleep;
    }
    // endregion
}
