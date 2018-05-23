package com.abewang.designpatterns.state;

/**
 * 已经开通了校园网的学生
 *
 * @Author Abe
 * @Date 2018/5/23.
 */
public class StudentWithNetwork implements StudentState {
    private CampusNetworkSystem sys;

    public StudentWithNetwork(CampusNetworkSystem sys) {
        this.sys = sys;
    }

    @Override
    public void applyForCampusNetwork() {
        System.out.println("你已经开通了校园网，不要重复申请");
    }

    @Override
    public void connectCampusNetwork() {
        System.out.println("连接成功。");
    }

    @Override
    public void exitCampusNetwork() {
        System.out.println("退出成功。");
    }

    @Override
    public void cancelCampusNetwork() {
        System.out.println("注销成功。");
        sys.setStudentState(sys.getStudentWithoutNetwork());
    }
}
