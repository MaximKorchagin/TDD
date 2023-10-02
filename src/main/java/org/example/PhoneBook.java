package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    Map<String, String> nameToNumber = new HashMap<>();
    Map<String, String> numberToName = new HashMap<>();
    public int add(String name, String number) {
        if (!nameToNumber.containsKey(name)) {
            nameToNumber.put(name, number);
            numberToName.put(number, name);
        }
        return nameToNumber.size();
    }

    public String findByNumber(String number) {
        return numberToName.get(number);
    }

    public String findByName(String name) {
        return nameToNumber.get(name);
    }

    public String printAllNames() {
        return null;
    }

}
