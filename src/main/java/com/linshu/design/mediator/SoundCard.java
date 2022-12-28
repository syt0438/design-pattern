package com.linshu.design.mediator;

class SoundCard extends Colleague {

    SoundCard(Mediator mediator) {
        super(mediator);
    }

    void soundData(String data) {
        System.out.println("listen: " + data);
    }
}
