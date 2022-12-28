package com.linshu.design.mediator;

public class CDDriver extends Colleague {

    private String data = "";

    public CDDriver(Mediator mediator) {
        super(mediator);
    }

    public String getData() {
        return data;
    }

    public void readCD() {
        this.data = "🪅🪅,🥸🥸";

        this.getMediator().changed(this);
    }

}
