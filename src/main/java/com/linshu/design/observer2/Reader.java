package com.linshu.design.observer2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Observable;
import java.util.Observer;

/**
 * @author LinShu
 * Just contact me if you have any questions.
 * My e-mail is bruce.song@backgardon.com.
 * Date: 2022/12/28
 * Time: 17:03
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
class Reader implements Observer {

    private String name;

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("[" + name + "] reading: " + arg);
    }
}
