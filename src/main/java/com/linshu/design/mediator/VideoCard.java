package com.linshu.design.mediator;

public class VideoCard extends Colleague {

    public VideoCard(Mediator mediator) {
        super(mediator);
    }

    public void showData(String data) {
        System.out.println("watch: " + data);
    }
}
