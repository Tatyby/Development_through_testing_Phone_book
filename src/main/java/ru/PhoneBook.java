package ru;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    public static Map<String, Integer> phoneBook = new TreeMap<>();

    public static void main(String[] args) {
        System.out.println(add("Катя", 200));
        System.out.println(add("Катя1", 300));
        System.out.println(add("Катя2", 350));
        System.out.println(add("Катя2", 400));
        System.out.println(findByNumber(400));
        System.out.println(findByName("Катя"));


    }

    public static int add(String name, int number) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, number);
            System.out.print("Количество контактов: ");
        }
        return phoneBook.size();
    }

    public static String findByNumber(int number) {
        if (phoneBook.containsValue(number)) {
            return phoneBook.entrySet().stream().
                    filter((x) -> x.getValue().equals(number))
                    .map(Map.Entry::getKey)
                    .findFirst().get();
        } else {
            return "Такого номера нет в списке контактов";
        }
    }
    public static int findByName(String name){
      return  0;

    }
}