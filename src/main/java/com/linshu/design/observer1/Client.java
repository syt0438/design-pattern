package com.linshu.design.observer1;

class Client {
    public static void main(String[] args) {
        // 创建一个报纸，作为被观察者
        NewsPaper subject = new NewsPaper();
        // 创建阅读者，也就是观察者
        Reader reader1 = new Reader("张三");
        Reader reader2 = new Reader("刘六");
        Reader reader3 = new Reader("王五");

        // 注册阅读者
        subject.attach(reader1);
        subject.attach(reader2);
        subject.attach(reader3);

        subject.refreshContent("心生则种种魔生💘");

        subject.detach(reader1);
        subject.detach(reader3);

        subject.refreshContent("心灭则种种魔灭💗");

    }
}
