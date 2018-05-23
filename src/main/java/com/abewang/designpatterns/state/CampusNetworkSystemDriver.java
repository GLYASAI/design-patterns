package com.abewang.designpatterns.state;

/**
 * @Author Abe
 * @Date 2018/5/23.
 */
public class CampusNetworkSystemDriver {
    public static void main(String[] args) {
        CampusNetworkSystem sys = new CampusNetworkSystem();
        sys.apply();
        sys.connect();
        sys.exit();
        sys.cancel();
        System.out.println();

        System.out.println("一个学期以后");
        sys.setStudentState(sys.getStudentWithoutNetwork());
        sys.connect();
        sys.exit();
        sys.cancel();
        sys.apply();
        sys.connect();
        sys.exit();
        System.out.println();

        sys.cancel();
        sys.connect();
        sys.exit();
        sys.apply();
        System.out.println();

        // 毕业了的学生
        sys.setStudentState(new GraduateStudent());
        sys.connect();
        sys.exit();
        sys.apply();
        sys.cancel();
    }
}
