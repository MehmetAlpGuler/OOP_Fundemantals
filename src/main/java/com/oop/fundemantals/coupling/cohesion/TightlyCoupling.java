package com.oop.fundemantals.coupling.cohesion;

public class TightlyCoupling {
    public static void main(String args[]) {
        X x = new X();

        //a.display() will print X and Y
        //this implementation can not be changed dynamically
        //being tight coupling
        x.display();
    }
}

class X {
    Y y;

    public X() {
        //y is tightly coupled to X
        y = new Y();
    }

    public void display() {
        System.out.println("X");
        y.display();
    }
}

class Y {
    public Y() {
    }

    public void display() {
        System.out.println("Y");
    }
}
