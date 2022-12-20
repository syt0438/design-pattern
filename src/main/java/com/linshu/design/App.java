package com.linshu.design;

import com.linshu.design.factory.method.ExportDbOperate;
import com.linshu.design.factory.method.ExportOperate;

/**
 * @author LinShu
 * Just contact me if you have any questions.
 * My e-mail is bruce.song@backgardon.com.
 * Date: 2022/12/15
 * Time: 18:01
 */
public class App {

    public static void main(String[] args) {
        ExportOperate exporter = new ExportDbOperate();

        exporter.export("test");
    }

}
