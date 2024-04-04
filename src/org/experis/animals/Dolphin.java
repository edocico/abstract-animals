package org.experis.animals;

public class Dolphin extends Animal{


    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("Click");
    }

    @Override
    public void eat() {
        System.out.println("fish");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
