package com.linshu.design.observer2;

class Client {
    public static void main(String[] args) {
        // 创建一个报纸，作为被观察者
        NewsPaper subject = new NewsPaper();
        // 创建阅读者，也就是观察者
        Reader reader1 = new Reader("张三");
        Reader reader2 = new Reader("刘六");
        Reader reader3 = new Reader("王五");

        // 注册阅读者
        subject.addObserver(reader1);
        subject.addObserver(reader2);
        subject.addObserver(reader3);

        subject.setData("心生则种种魔生💘");

        subject.deleteObserver(reader1);
        subject.deleteObserver(reader3);

        subject.setData("心灭则种种魔灭💗");

    }
}
