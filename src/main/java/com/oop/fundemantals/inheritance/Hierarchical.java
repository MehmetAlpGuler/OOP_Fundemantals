package com.oop.fundemantals.inheritance;
// Java program to illustrate the
// concept of Hierarchical inheritance

class a {
    public void print_geek() {
        System.out.println("Geeks");
    }
}

class b extends a {
    public void print_for() {
        System.out.println("for");
    }
}

class c extends a {
    /*............*/
}

// Drived class
public class Hierarchical {
    public static void main(String[] args) {
        c g = new c();
        g.print_geek();
        b t = new b();
        t.print_for();
        g.print_geek();
    }
}

