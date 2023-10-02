package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    Map<String, String> nameToNumber = new HashMap<>();

    public int add(String name, String number) {
        if (!nameToNumber.containsKey(name)) {
            nameToNumber.put(name, number);

        }
        return nameToNumber.size();
    }

    public String findByNumber(String number) {

        return null;
    }

}
