package com.linshu.design;

import com.linshu.design.factory.abstraction.AbstractFactory;
import com.linshu.design.factory.abstraction.ComputerEngineer;
import com.linshu.design.factory.abstraction.Schema1;

/**
 * @author LinShu
 * Just contact me if you have any questions.
 * My e-mail is bruce.song@backgardon.com.
 * Date: 2022/12/15
 * Time: 18:01
 */
public class App {

    public static void main(String[] args) {
        ComputerEngineer engineer = new ComputerEngineer();
        AbstractFactory schema = new Schema1();
        engineer.makeComputer(schema);
    }

}
