package ru;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class PhoneBookTest {

    @Test
    public void addTest() {
        PhoneBook.add("Света", 102);
        PhoneBook.add("Света2", 103);

        int result = PhoneBook.add("Света3", 104);
        int expected = 3;
        Assert.assertEquals(expected, result);

    }

    @Test
    public void findByNumberTest() {
        PhoneBook.add("Света", 102);
        PhoneBook.add("Света2", 103);
        PhoneBook.add("Света3", 160);
        Assert.assertEquals("Света", PhoneBook.findByNumber(102));
    }

    @Test
    public void findByNumberTest1() {
        PhoneBook.add("Света", 102);
        PhoneBook.add("Света2", 103);
        PhoneBook.add("Света3", 160);
        Assert.assertEquals("Такого номера нет в списке контактов", PhoneBook.findByNumber(170));
    }

    @Test
    public void findByNameTest() {
        PhoneBook.add("Света", 102);
        PhoneBook.add("Света2", 103);
        PhoneBook.add("Света3", 160);
        Assert.assertEquals(102, PhoneBook.findByName("Света"));
    }

    @Test
    public void printAllNamesTest() {
        TreeMap<String, Integer> phoneBookTest = new TreeMap<>();
        phoneBookTest.put("Света", 300);
        phoneBookTest.put("Василиса", 350);
        Assert.assertEquals("Распечатано, ваша телефонная книжка начинается с имени: Василиса",
                PhoneBook.printAllNames(phoneBookTest));

    }

}
