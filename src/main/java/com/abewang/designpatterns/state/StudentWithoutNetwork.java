package com.abewang.designpatterns.state;

/**
 * 没有开通校园网的学生
 *
 * @Author Abe
 * @Date 2018/5/23.
 */
public class StudentWithoutNetwork implements StudentState {
    private CampusNetworkSystem sys;

    public StudentWithoutNetwork(CampusNetworkSystem sys) {
        this.sys = sys;
    }

    @Override
    public void applyForCampusNetwork() {
        System.out.println("成功为你开通校园网。");
        sys.setStudentState(sys.getStudentWithNetwork());
    }

    @Override
    public void connectCampusNetwork() {
        System.out.println("你尚未开通校园网。");
    }

    @Override
    public void exitCampusNetwork() {
        System.out.println("你尚未开通校园网。");
    }

    @Override
    public void cancelCampusNetwork() {
        System.out.println("你尚未开通校园网。");
    }
}
