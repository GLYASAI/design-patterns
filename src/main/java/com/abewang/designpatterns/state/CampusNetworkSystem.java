package com.abewang.designpatterns.state;

/**
 * 校园网系统
 *
 * @Author Abe
 * @Date 2018/5/23.
 */
public class CampusNetworkSystem {
    private StudentState studentState;
    private StudentWithoutNetwork studentWithoutNetwork;
    private StudentWithNetwork studentWithNetwork;

    public CampusNetworkSystem() {
        this.studentState = new NewStudent();
        studentWithoutNetwork = new StudentWithoutNetwork(this);
        studentWithNetwork = new StudentWithNetwork(this);
    }

    // region getter & setter
    public void setStudentState(StudentState studentState) {
        this.studentState = studentState;
    }

    public StudentState getStudentState() {
        return studentState;
    }

    public StudentWithoutNetwork getStudentWithoutNetwork() {
        return studentWithoutNetwork;
    }

    public void setStudentWithoutNetwork(StudentWithoutNetwork studentWithoutNetwork) {
        this.studentWithoutNetwork = studentWithoutNetwork;
    }

    public StudentWithNetwork getStudentWithNetwork() {
        return studentWithNetwork;
    }

    public void setStudentWithNetwork(StudentWithNetwork studentWithNetwork) {
        this.studentWithNetwork = studentWithNetwork;
    }
    // endregion

    /**
     * 申请校园网
     */
    public void apply() {
        studentState.applyForCampusNetwork();
    }

    /**
     * 连接校园网
     */
    public void connect() {
        studentState.connectCampusNetwork();
    }

    /**
     * 退出校园网
     */
    public void exit() {
        studentState.exitCampusNetwork();
    }

    /**
     * 注销校园网
     */
    public void cancel() {
        studentState.cancelCampusNetwork();
    }
}
