package com.abewang.designpatterns.eventdriven;

/**
 * 绑安全带事件
 *
 * @Author Abe
 * @Date 2018/8/13.
 */
public class CloseDoorEvent extends SafeCarEvent {
    public CloseDoorEvent(Object source) {
        super(source);
    }
}
