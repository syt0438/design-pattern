package com.linshu.design.decorate;

import java.util.HashMap;
import java.util.Map;

public class TempDB {
    private TempDB() {
    }

    public static Map<String, Double> mapMonthSaleMoney = new HashMap<String, Double>();

    static {
        // 填充测试数据
        mapMonthSaleMoney.put("张三", 10000.0);
        mapMonthSaleMoney.put("李四", 20000.0);
        mapMonthSaleMoney.put("王五", 30000.0);
    }
}