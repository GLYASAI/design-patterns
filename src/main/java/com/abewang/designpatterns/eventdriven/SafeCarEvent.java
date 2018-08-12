package com.abewang.designpatterns.eventdriven;

import java.util.EventObject;

/**
 * @Author Abe
 * @Date 2018/8/13.
 */
public class SafeCarEvent extends EventObject {

    public SafeCarEvent(Object source) {
        super(source);
    }
}
