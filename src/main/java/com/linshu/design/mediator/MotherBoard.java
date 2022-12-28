package com.linshu.design.mediator;

class MotherBoard implements Mediator {

    private CDDriver cdDriver = null;

    private CPU cpu = null;

    private VideoCard videoCard = null;

    private SoundCard soundCard = null;

    @Override
    public void changed(Colleague colleague) {
        if (colleague == cdDriver) {
            this.opeCDDriverReadData((CDDriver) colleague);
        } else if (colleague == cpu) {
            this.opeCPU((CPU) colleague);
        }
    }

    private void opeCPU(CPU colleague) {
        // 1：先获取CPU处理后的数据
        String videoData = cpu.getVideoData();
        String soundData = cpu.getSoundData();

        // 2：把这些数据传递给显卡和声卡展示出来
        this.videoCard.showData(videoData);
        this.soundCard.soundData(soundData);
    }

    private void opeCDDriverReadData(CDDriver colleague) {
        // 1：先获取光驱读取的数据
        String data = colleague.getData();
        // 2：把这些数据传递给CPU进行处理
        this.cpu.executeData(data);
    }

    MotherBoard setCdDriver(CDDriver cdDriver) {
        this.cdDriver = cdDriver;

        return this;
    }

    MotherBoard setCpu(CPU cpu) {
        this.cpu = cpu;

        return this;
    }

    MotherBoard setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;

        return this;
    }

    MotherBoard setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;

        return this;
    }

}
