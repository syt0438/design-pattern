package com.linshu.design.observer1;

import lombok.Getter;

@Getter
class NewsPaper extends Subject {
    private String content;

    void refreshContent(String content) {
        this.content = content;
        
        // 内容有了，说明又出报纸了，那就通知所有的读者
        notifyObservers();
    }
}
