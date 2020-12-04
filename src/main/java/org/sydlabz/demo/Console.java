package org.sydlabz.demo;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Console {
    public static void showData(List<LinkedHashMap<?, ?>> data) {
        for (Map<?, ?> record : data) {
            System.out.println(record);
            for (Object key : record.keySet()) {
                System.out.println("\t" + key.getClass().getName() + " - " + record.get(key).getClass().getName());
            }
        }
    }
}
