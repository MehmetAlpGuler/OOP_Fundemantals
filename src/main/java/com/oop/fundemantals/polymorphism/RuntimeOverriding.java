package com.oop.fundemantals.polymorphism;

// Java program for Method overridding
class Parent {

    void Print() {
        System.out.println("parent class");
    }
}

class subclass1 extends Parent {

    void Print() {
        System.out.println("subclass1");
    }
}

class subclass2 extends Parent {

    void Print() {
        System.out.println("subclass2");
    }
}

class RuntimeOverriding {
    public static void main(String[] args) {

        Parent a;

        a = new subclass1();
        a.Print();

        a = new subclass2();
        a.Print();
    }
}