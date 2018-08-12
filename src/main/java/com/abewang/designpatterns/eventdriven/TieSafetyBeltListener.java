package com.abewang.designpatterns.eventdriven;

import java.util.EventListener;

/**
 * @Author Abe
 * @Date 2018/8/13.
 */
public class TieSafetyBeltListener implements SafeCarListener<TieSafetyBeltEvent> {
    @Override
    public void onSafeCarEvent(TieSafetyBeltEvent event) {
        System.out.println("将isTieSafeBelt设置为true");
        SafeCar safeCar = (SafeCar)event.getSource();
        safeCar.setTieSafeBelt(true);
    }
}
