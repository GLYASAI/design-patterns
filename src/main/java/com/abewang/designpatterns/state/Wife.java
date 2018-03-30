package com.abewang.designpatterns.state;

/**
 * Abe wang同学的老婆
 * @Author Abe wang
 * @Date 3/30/2018.
 */
public class Wife {
    private AbeWangState abeWangState;

    private Immortal immortal = new Immortal(this);

    private Study study = new Study(this);

    private Eat eat = new Eat(this);

    private Sleep sleep = new Sleep(this);

    public Wife() {
        abeWangState = immortal;
    }

    public void setAbeWangState(AbeWangState abeWangState) {
        this.abeWangState = abeWangState;
    }

    // region getter & setter
    public Immortal getImmortal() {
        return immortal;
    }

    public void setImmortal(Immortal immortal) {
        this.immortal = immortal;
    }

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
