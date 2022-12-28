package com.linshu.design.observer3;

public class Client {
    public static void main(String[] args) {
        // 创建水质主题对象
        WaterQuality subject = new WaterQuality();

        // 创建几个观察者
        WatcherObserver watcher1 = new Watcher("监测人员");
        WatcherObserver watcher2 = new Watcher("预警人员");
        WatcherObserver watcher3 = new Watcher("上级领导");

        // 注册观察者
        subject.attach(watcher1)
                .attach(watcher2)
                .attach(watcher3);

        // 填写水质报告
        subject.setPolluteLevel(1);
        subject.setPolluteLevel(2);
        subject.setPolluteLevel(3);
    }
}
