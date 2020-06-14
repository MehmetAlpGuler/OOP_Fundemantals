package com.oop.fundemantals.inheritance;

//Java program to illustrate the
// concept of single inheritance

class first {
    public void print_geek() {
        System.out.println("Geeks");
    }
}

class second extends first {
    public void print_for() {
        System.out.println("for");
    }
}

// Driver class
public class Single {
    public static void main(String[] args) {
        second g = new second();
        g.print_geek();
        g.print_for();
        g.print_geek();
    }
}
