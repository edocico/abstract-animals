package org.experis.animals;

public class Eagle extends Animal implements CanFly{


    // constructor

    public Eagle(String name) {
        super(name);
    }


    // methods

    @Override
    public void verso() {
        System.out.println("Scream");
    }

    @Override
    public void eat() {
        System.out.println("meat");
    }


    @Override
    public void fly() {
        System.out.println("I'm " + getName() + " and I'm Flying !!");
    }
}
