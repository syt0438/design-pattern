package com.linshu.design.factory.method;

/**
 * @author LinShu
 * Just contact me if you have any questions.
 * My e-mail is bruce.song@backgardon.com.
 * Date: 2022/12/20
 * Time: 12:03
 */
abstract class ExportOperate {

    protected abstract ExportApi getExporter();

    boolean export(String data) {
        ExportApi api = getExporter();

        return api.export(data);
    }

}
