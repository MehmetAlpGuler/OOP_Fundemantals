package com.oop.fundemantals.autoboxing.unboxing;

public class AutoBoxingUnAutoBoxing {
    public static void main(String[] args) {

        int i = 10; //Single Value Container
        Integer iRef = new Integer(i); //Boxed (Constructing the Object)

        int j = iRef.intValue(); //UnBoxing (Extracting the Value of the Object)

        Integer kRef = i; //AutoBoxing (Integer kRef = new Integer(i);)

        int l = kRef; //AutoUnBoxing



        // unboxing the Object
        int i1 = i;

        System.out.println("Value of i: " + i);
        System.out.println("Value of i1: " + i1);

        //Autoboxing of char
        Character gfg = 'a';

        // Auto-unboxing of Character
        char ch = gfg;
        System.out.println("Value of ch: " + ch);
        System.out.println("Value of gfg: " + gfg);

    }
}
