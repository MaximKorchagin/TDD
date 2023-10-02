package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PhoneBookTest {

    @Test
    public void shouldAddToMapWhenAddNewNumber() {
        PhoneBook phoneBook = new PhoneBook();
        String name = "Temych";
        String number = "88005553599";
        phoneBook.add(name, number);
        Assertions.assertTrue(phoneBook.nameToNumber.containsKey(name));
        Assertions.assertEquals(number, phoneBook.nameToNumber.get(name));
    }

    @Test
    public void shouldReturnNumberOfContacts() {
        PhoneBook phoneBook = new PhoneBook();
        String name = "Temych";
        String number = "88005553599";
        int counter = phoneBook.add(name, number);
        Assertions.assertEquals(1, counter);
        counter = phoneBook.add("Tigran", "3523523612");
        Assertions.assertEquals(2, counter);
    }

    @Test
    public void shouldNotAddToMapIfNameExists() {
        PhoneBook phoneBook = new PhoneBook();
        String name = "Temych";
        String number = "88005553599";
        phoneBook.add(name, number);
        int counter = phoneBook.add(name, "3243423");
        Assertions.assertEquals(1, counter);
        Assertions.assertEquals(number, phoneBook.nameToNumber.get(name));
    }

    @Test
    public void shouldReturnNameIfExists() {
        PhoneBook phoneBook = new PhoneBook();
        String name = "Temych";
        String number = "88005553599";
        phoneBook.add(name, number);
        Assertions.assertEquals(name, phoneBook.findByNumber(number));

    }

    @Test
    public void shouldReturnNumberIfExists() {
        PhoneBook phoneBook = new PhoneBook();
        String name = "Temych";
        String number = "88005553599";
        phoneBook.add(name, number);
        Assertions.assertEquals(number, phoneBook.findByName(name));

    }
}