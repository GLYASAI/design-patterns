package com.abewang.designpatterns.state;

/**
 * 学生状态
 *
 * @Author Abe
 * @Date 2018/5/23.
 */
public interface StudentState {
    /**
     * 申请校园网
     */
    void applyForCampusNetwork();

    /**
     * 连接校园网
     */
    void connectCampusNetwork();

    /**
     * 退出校园网
     */
    void exitCampusNetwork();

    /**
     * 注销校园网
     */
    void cancelCampusNetwork();
}
