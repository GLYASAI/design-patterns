package com.abewang.designpatterns.eventdriven;

import java.util.EventObject;

/**
 * 绑安全带事件
 *
 * @Author Abe
 * @Date 2018/8/13.
 */
public class TieSafetyBeltEvent extends SafeCarEvent {
    public TieSafetyBeltEvent(Object source) {
        super(source);
    }
}
