package com.linshu.design.mediator;

class CPU extends Colleague {

    private String videoData = "";

    private String soundData = "";

    CPU(Mediator mediator) {
        super(mediator);
    }

    void executeData(String data) {
        String[] split = data.split(",");

        soundData = split[0];
        videoData = split[1];

        this.getMediator().changed(this);
    }

    String getVideoData() {
        return videoData;
    }

    String getSoundData() {
        return soundData;
    }

    
}
