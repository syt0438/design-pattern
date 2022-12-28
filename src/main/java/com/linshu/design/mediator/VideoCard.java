package com.linshu.design.mediator;

class VideoCard extends Colleague {

    VideoCard(Mediator mediator) {
        super(mediator);
    }

    void showData(String data) {
        System.out.println("watch: " + data);
    }
}
