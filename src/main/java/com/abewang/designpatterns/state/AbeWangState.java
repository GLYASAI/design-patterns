package com.abewang.designpatterns.state;

/**
 * Abe Wang同学的状态
 * @Author Abe wang
 * @Date 3/30/2018.
 */
public interface AbeWangState {
    void eat();

    void study();

    void sleep();
    /**
     * 解除仙人模式
     */
    void relieve();
}
