package com.abewang.designpatterns.state;

/**
 * Abe Wang同学的老婆
 * @Author Abe wang
 * @Date 3/30/2018.
 */
public class Wife {
    private AbeWangState abeWangState;

    private Study study = new Study(this);

    private Eat eat = new Eat(this);

    private Sleep sleep = new Sleep(this);

    public Wife() {
        abeWangState = sleep;
    }

    public void setAbeWangState(AbeWangState abeWangState) {
        this.abeWangState = abeWangState;
    }

    public void study() {
        abeWangState.study();
    }

    public void eat() {
        abeWangState.eat();
    }

    public void sleep() {
        abeWangState.sleep();
    }

    // region getter & setter
    public Study getStudy() {
        return study;
    }

    public void setStudy(Study study) {
        this.study = study;
    }

    public Eat getEat() {
        return eat;
    }

    public void setEat(Eat eat) {
        this.eat = eat;
    }

    public Sleep getSleep() {
        return sleep;
    }

    public void setSleep(Sleep sleep) {
        this.sleep = sleep;
    }
    // endregion
}
