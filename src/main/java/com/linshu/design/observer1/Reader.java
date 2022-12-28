package com.linshu.design.observer1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
class Reader implements Observer {

    private String name;

    @Override
    public void update(String data) {
        System.out.println("[" + name + "] reading: " + data);
    }

}
