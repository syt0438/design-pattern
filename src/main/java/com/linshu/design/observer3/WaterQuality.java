package com.linshu.design.observer3;

import lombok.Getter;

class WaterQuality extends WaterQualitySubject {

    @Getter
    private int polluteLevel = 0;

    public void setPolluteLevel(int polluteLevel) {
        this.polluteLevel = polluteLevel;

        notifyWatchers();
    }

    @Override
    protected void notifyWatchers() {
        observers.forEach(item -> {
            switch (polluteLevel) {
                case 1:
                    if ("监测人员".equals(item.getJob())) {
                        item.update(this);
                    }

                    break;
                case 2:
                    if ("预警人员".equals(item.getJob())) {
                        item.update(this);
                    }

                    break;
                case 3:
                    if ("上级领导".equals(item.getJob())) {
                        item.update(this);
                    }

                    break;
                default:
                    break;
            }
        });
    }

}
