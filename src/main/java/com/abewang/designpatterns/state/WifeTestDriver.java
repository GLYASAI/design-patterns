package com.abewang.designpatterns.state;

/**
 * @Author Abe
 * @Date 2018/3/30.
 */
public class WifeTestDriver {
    public static void main(String[] args) {
        Wife wife = new Wife();

        System.out.println("Abe Wang同学一天的状态：");
        wife.sleep();
        wife.study();
        wife.eat();
        System.out.println("");

        System.out.println("在睡觉：");
        wife.study();
        wife.eat();
        wife.sleep();
        System.out.println("");

        System.out.println("学习：");
        wife.eat();
        wife.sleep();
        wife.study();
        System.out.println("");

        System.out.println("吃饭：");
        wife.sleep();
        wife.study();
        wife.eat();
    }
}
