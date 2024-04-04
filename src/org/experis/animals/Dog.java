package org.experis.animals;

public class Dog extends Animal{

    // constructor

    public Dog(String name) {
        super(name);
    }

    // methods

    @Override
    public void verso() {
        System.out.println("Bark");
    }

    @Override
    public void eat() {
        System.out.println("meat");
    }


}
