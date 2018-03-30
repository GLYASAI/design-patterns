package com.abewang.designpatterns.state;

/**
 * @Author Abe wang
 * @Date 3/30/2018.
 */
public class Sleep implements AbeWangState {
    private Wife wife;
    public Sleep(Wife wife) {
        this.wife = wife;
    }

    @Override
    public void eat() {

    }

    @Override
    public void study() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void relieve() {

    }
}
