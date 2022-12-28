package com.linshu.design.observer3;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

abstract class WaterQualitySubject {
    protected final List<WatcherObserver> observers = new CopyOnWriteArrayList<>();

    public WaterQualitySubject attach(WatcherObserver observer) {
        observers.add(observer);

        return this;
    }

    public WaterQualitySubject dettach(WatcherObserver observer) {
        observers.remove(observer);

        return this;
    }

    protected abstract void notifyWatchers();

    protected abstract int getPolluteLevel();
}
