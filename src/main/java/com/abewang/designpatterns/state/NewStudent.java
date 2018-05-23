package com.abewang.designpatterns.state;

/**
 * @Author Abe
 * @Date 2018/5/23.
 */
public class NewStudent implements StudentState {
    @Override
    public void applyForCampusNetwork() {
        System.out.println("新生不允许开通校园网。");
    }

    @Override
    public void connectCampusNetwork() {
        System.out.println("你没有校园网。");
    }

    @Override
    public void exitCampusNetwork() {
        System.out.println("你没有校园网。");
    }

    @Override
    public void cancelCampusNetwork() {
        System.out.println("你没有校园网。");
    }
}
