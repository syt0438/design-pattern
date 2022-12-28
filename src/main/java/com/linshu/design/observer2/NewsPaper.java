package com.linshu.design.observer2;

import lombok.Getter;

import java.util.Observable;

/**
 * @author LinShu
 * Just contact me if you have any questions.
 * My e-mail is bruce.song@backgardon.com.
 * Date: 2022/12/28
 * Time: 16:59
 */
@Getter
class NewsPaper extends Observable {

    private String data;

    public void setData(String data) {
        this.data = data;

        setChanged();
        notifyObservers(data);
    }
}
