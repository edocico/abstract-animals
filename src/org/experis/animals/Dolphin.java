package org.experis.animals;

public class Dolphin extends Animal implements CanSwim{

    // constructor

    public Dolphin(String name) {
        super(name);
    }

    // methods

    @Override
    public void verso() {
        System.out.println("Click");
    }

    @Override
    public void eat() {
        System.out.println("fish");
    }


    @Override
    public void swim() {
        System.out.println("I'm " + getName() + " and I'm Swimming !!");
    }
}
