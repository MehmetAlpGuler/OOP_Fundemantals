package com.oop.fundemantals.immutable;

// Java program to demonstrate that prmitive
// wrapper classes are immutable
public class Immutable {
    public static void main(String[] args)
    {
        Integer i = new Integer(12);
        System.out.println(i);
        modify(i);
        System.out.println(i);
    }

    private static void modify(Integer i)
    {
        i = i + 1;
    }
}
