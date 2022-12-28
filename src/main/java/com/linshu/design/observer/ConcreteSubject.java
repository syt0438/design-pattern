package com.linshu.design.observer;

import lombok.Getter;

@Getter
public class ConcreteSubject extends Subject {
    private String state;

    public void refreshState(String state) {
        this.state = state;
        
        // 状态发生了改变，通知各个观察者
        this.notifyObservers();
    }

}
