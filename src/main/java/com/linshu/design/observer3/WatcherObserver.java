package com.linshu.design.observer3;

/**
 * WatcherObserver
 */
interface WatcherObserver {

    void update(WaterQualitySubject subject);

    String getJob();

    void setJob(String job);

}