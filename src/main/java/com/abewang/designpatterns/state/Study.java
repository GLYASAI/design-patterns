package com.abewang.designpatterns.state;

/**
 *  努力学习
 * @Author Abe wang
 * @Date 3/30/2018.
 */
public class Study implements AbeWangState {
    private Wife wife;

    public Study(Wife wife) {
        this.wife = wife;
    }

    @Override
    public void eat() {
        System.out.println("我正在学习，不能吃饭");
    }

    @Override
    public void study() {
        System.out.println("我正在学习。");
        System.out.println("学习完毕，吃饭去了。");
        wife.setAbeWangState(wife.getEat());
    }

    @Override
    public void sleep() {
        System.out.println("我正在学习，不能睡觉");
    }
}
