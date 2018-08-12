package com.abewang.designpatterns.eventdriven;

import java.util.EventListener;

/**
 * @Author Abe
 * @Date 2018/8/13.
 */
@FunctionalInterface
public interface SafeCarListener<E extends SafeCarEvent> extends EventListener {
    void onSafeCarEvent(E event);
}
