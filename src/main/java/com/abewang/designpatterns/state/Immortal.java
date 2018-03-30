package com.abewang.designpatterns.state;

/**
 * 仙人模式
 * @Author Abe wang
 * @Date 3/30/2018.
 */
public class Immortal implements AbeWangState {
    private Wife wife;

    public Immortal(Wife wife) {
        this.wife = wife;
    }


    @Override
    public void eat() {
        System.out.println("我正处于仙人模式，不能吃饭。");
    }

    @Override
    public void study() {
        System.out.println("我正处于仙人模式，不能学习。");
    }

    @Override
    public void sleep() {
        System.out.println("我正处于仙人模式，不能睡觉。");
    }

    @Override
    public void relieve() {
        System.out.println("解除仙人模式，进入学习状态。");
        wife.setAbeWangState(wife.getStudy());
    }
}
