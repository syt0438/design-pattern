package com.linshu.design.mediator;

class CDDriver extends Colleague {

    private String data = "";

    CDDriver(Mediator mediator) {
        super(mediator);
    }

    String getData() {
        return data;
    }

    void readCD() {
        this.data = "🪅🪅,🥸🥸";

        this.getMediator().changed(this);
    }

}
