package com.linshu.design.observer;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer = new ConcreteObserver();

        subject.attach(observer);
        subject.refreshState("心生则种种魔生，心灭则种种魔灭💘");

        subject.detach(observer);
        subject.refreshState("❤️‍🩹");
    }
}
