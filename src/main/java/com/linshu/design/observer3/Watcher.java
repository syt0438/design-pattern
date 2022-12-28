package com.linshu.design.observer3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
class Watcher implements WatcherObserver {

    private String job;

    @Override
    public void update(WaterQualitySubject subject) {
        System.out.println("[" + job + "]: level is " + subject.getPolluteLevel());
    }

}
