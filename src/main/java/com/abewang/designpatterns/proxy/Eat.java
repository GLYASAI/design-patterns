package com.abewang.designpatterns.proxy;

import com.abewang.designpatterns.proxy.AbeWangState;
import com.abewang.designpatterns.proxy.Wife;

/**
 * @Author Abe wang
 * @Date 3/30/2018.
 */
public class Eat implements AbeWangState {
    private Wife wife;

    public Eat(Wife wife) {
        this.wife = wife;
    }

    @Override
    public void eat() {
        System.out.println("我正在吃饭。");
        System.out.println("吃饱了，睡觉去。");
        wife.setAbeWangState(wife.getSleep());
    }

    @Override
    public void study() {
        System.out.println("给点吃饭的时间可以的吧！");
    }

    @Override
    public void sleep() {
        System.out.println("我正在吃饭，还没到睡觉时间。");
    }
}
