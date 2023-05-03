package ru;

import org.junit.Assert;
import org.junit.Test;

public class PhoneBookTest {

    @Test
    public void addTest(){
        PhoneBook.add("Света", 102);
        PhoneBook.add("Света2", 103);

        int result = PhoneBook.add("Света3", 104);
        int expected=3;
        Assert.assertEquals(expected,result);

    }

}
