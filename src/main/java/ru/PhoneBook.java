package ru;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    public static Map<Person, Integer> phoneBook = new TreeMap<>(Comparator.comparing(Person::getName));

    public static void main(String[] args) {
        System.out.println(add("Катя", 200));
        System.out.println(add("Катя1", 300));


    }

    public static int add(String name, int number) {
        return 0;

    }
}