package org.experis.animals;

public class Sparrow extends Animal implements CanFly{

    // constructor

    public Sparrow(String name) {
        super(name);
    }

    // methods

    @Override
    public void verso() {
        System.out.println("Twitter");
    }

    @Override
    public void eat() {
        System.out.println("fruit");
    }


    @Override
    public void fly() {
        System.out.println("I'm " + getName() + " and I'm Flying !!");
    }
}
