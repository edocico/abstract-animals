package org.experis.animals;

public class Dog extends Animal{


    public Dog(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("Bark");
    }

    @Override
    public void eat() {
        System.out.println("meat");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
