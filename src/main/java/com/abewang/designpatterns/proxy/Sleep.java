package com.abewang.designpatterns.proxy;

/**
 * @Author Abe wang
 * @Date 3/30/2018.
 */
public class Sleep implements AbeWangState {
    private Wife wife;

    public Sleep(Wife wife) {
        this.wife = wife;
    }

    @Override
    public void eat() {
        System.out.println("现在是睡觉时间，不宜吃饭。");
    }

    @Override
    public void study() {
        System.out.println("现在是睡觉时间，不宜学习。");
    }

    @Override
    public void sleep() {
        System.out.println("我正在睡觉。");
        System.out.println("睡醒了，起床学习。");
        wife.setAbeWangState(wife.getStudy());
    }
}
