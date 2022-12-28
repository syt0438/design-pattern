package com.linshu.design.observer1;

import lombok.Getter;

@Getter
class NewsPaper extends Subject {
    private String data;

    void refreshContent(String data) {
        this.data = data;
        
        // 内容有了，说明又出报纸了，那就通知所有的读者
        notifyObservers(data);
    }
}
