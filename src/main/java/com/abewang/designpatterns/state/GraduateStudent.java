package com.abewang.designpatterns.state;

/**
 * 毕业了的学生
 *
 * @Author Abe
 * @Date 2018/5/23.
 */
public class GraduateStudent implements StudentState {
    @Override
    public void applyForCampusNetwork() {
        System.out.println("你已经毕业了，不能开通校园网。");
    }

    @Override
    public void connectCampusNetwork() {
        System.out.println("你没有校园网");
    }

    @Override
    public void exitCampusNetwork() {
        System.out.println("你没有校园网");
    }

    @Override
    public void cancelCampusNetwork() {
        System.out.println("你没有校园网");
    }
}
