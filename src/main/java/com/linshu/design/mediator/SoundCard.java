package com.linshu.design.mediator;

public class SoundCard extends Colleague {

    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    public void soundData(String data) {
        System.out.println("listen: " + data);
    }
}
