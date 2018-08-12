package com.abewang.designpatterns.eventdriven;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Abe
 * @Date 2018/8/13.
 */
public class SafeCar {
    private boolean isTieSafeBelt = false;
    private boolean isCloseDoor = false;

    private List<SafeCarListener> listeners = new ArrayList<>();

    public void addSafeCarListener(SafeCarListener listener) {
        listeners.add(listener);
    }

    public boolean isTieSafeBelt() {
        return isTieSafeBelt;
    }

    public void setTieSafeBelt(boolean tieSafeBelt) {
        isTieSafeBelt = tieSafeBelt;
    }

    public boolean isCloseDoor() {
        return isCloseDoor;
    }

    public void setCloseDoor(boolean closeDoor) {
        isCloseDoor = closeDoor;
    }

    public List<SafeCarListener> getListeners() {
        return listeners;
    }

    public void setListeners(List<SafeCarListener> listeners) {
        this.listeners = listeners;
    }

    public void tieSafeBelt() {
        System.out.println("绑上安全带.");
        TieSafetyBeltEvent event = new TieSafetyBeltEvent(this);
        listeners.forEach(listener -> {
            if (listener instanceof TieSafetyBeltListener) {
                listener.onSafeCarEvent(event);
            }
        });
    }

    public void closeDoor() {
        System.out.println("关门.");
        CloseDoorEvent event = new CloseDoorEvent(this);
        listeners.forEach(listener -> {
            if (listener instanceof CloseDoorListener) {
                listener.onSafeCarEvent(event);
            }
        });
    }

    public static void main(String[] args) throws InterruptedException {
        SafeCar safeCar = new SafeCar();
        safeCar.addSafeCarListener(new TieSafetyBeltListener());
        safeCar.addSafeCarListener(new CloseDoorListener());
        safeCar.tieSafeBelt();
        safeCar.closeDoor();
        while (!safeCar.isTieSafeBelt()) {
            System.out.println("嘟嘟嘟...(没有绑安全带...)");
            Thread.sleep(2000);
        }
        while (!safeCar.isCloseDoor()) {
            System.out.println("嘟嘟嘟...(门没有关好..)");
            Thread.sleep(2000);
        }

        System.out.println("已做好安全措施.Start the car.");
    }
}
