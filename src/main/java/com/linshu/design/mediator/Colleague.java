package com.linshu.design.mediator;

abstract class Colleague {

    private Mediator mediator;

    Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    Mediator getMediator() {
        return mediator;
    }

}
