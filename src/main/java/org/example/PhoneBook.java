package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    Map<String, String> map = new HashMap<>();
    public int add(String name, String number) {
        if (!map.containsKey(name)) {
            map.put(name, number);
        }
        return map.size();
    }

}
