package com.linshu.design.mediator;

public class CPU extends Colleague {

    private String videoData = "";

    private String soundData = "";

    public CPU(Mediator mediator) {
        super(mediator);
    }

    public void executeData(String data) {
        String[] split = data.split(",");

        soundData = split[0];
        videoData = split[1];

        this.getMediator().changed(this);
    }

    public String getVideoData() {
        return videoData;
    }

    public String getSoundData() {
        return soundData;
    }

    
}
