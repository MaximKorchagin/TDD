package org.example;

import java.util.*;

public class PhoneBook {

    SortedMap<String, String> nameToNumber = new TreeMap<>();
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
        StringBuilder sb = new StringBuilder();
        Set<String> strings = nameToNumber.keySet();
        for (String name: strings) {
            sb.append(name);
            sb.append(", ");
        }
       // return sb.substring(0, sb.length() - 2);
        return sb.substring(0, Math.max(0, sb.length() - 2));

    }

}
