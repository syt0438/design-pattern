package com.linshu.design.observer1;

import java.util.ArrayList;
import java.util.List;

abstract class Subject {
    private List<Observer> readers = new ArrayList<Observer>();

    void attach(Observer reader) {
        readers.add(reader);
    }

    void detach(Observer reader) {
        readers.remove(reader);
    }

    protected void notifyObservers(String data) {
        for (Observer reader : readers) {
            reader.update(data);
        }
    }
}
