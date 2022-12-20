package com.linshu.design.factory.method;

/**
 * @author LinShu
 * Just contact me if you have any questions.
 * My e-mail is bruce.song@backgardon.com.
 * Date: 2022/12/20
 * Time: 12:04
 */
public class ExportDbOperate extends ExportOperate {
    @Override
    protected ExportApi getExporter() {
        return new ExportDb();
    }
}
