package ru;

public class Person {
    private String name;
    private int numberPhone;

    public Person(String name) {
        this.name = name;
     //   this.numberPhone = numberPhone;
    }

    public String getName() {
        return name;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }
}
