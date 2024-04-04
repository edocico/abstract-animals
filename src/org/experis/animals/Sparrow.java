package org.experis.animals;

public class Sparrow extends Animal{


    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("Twitter");
    }

    @Override
    public void eat() {
        System.out.println("fruit");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
