package com.linshu.design.factory.method;

/**
 * @author LinShu
 * Just contact me if you have any questions.
 * My e-mail is bruce.song@backgardon.com.
 * Date: 2022/12/20
 * Time: 12:01
 */
class ExportTxt implements ExportApi {
    @Override
    public boolean export(String data) {
        System.out.println("导出数据" + data + "到文本文件");

        return true;
    }
}
