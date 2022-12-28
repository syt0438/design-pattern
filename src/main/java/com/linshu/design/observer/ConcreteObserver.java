package com.linshu.design.observer;

class ConcreteObserver implements Observer {

    private String state;

    @Override
    public void update(Subject subject) {
        state = ((ConcreteSubject) subject).getState();

        System.out.println("update state to: " + state);
    }

}
