package com.abewang.designpatterns.eventdriven;

/**
 * @Author Abe
 * @Date 2018/8/13.
 */
public class CloseDoorListener implements SafeCarListener<CloseDoorEvent> {
    @Override
    public void onSafeCarEvent(CloseDoorEvent event) {
        System.out.println("将isCloseDoor设置为true");
        SafeCar safeCar = (SafeCar)event.getSource();
        safeCar.setCloseDoor(true);
    }
}
