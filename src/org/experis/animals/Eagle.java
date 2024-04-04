package org.experis.animals;

public class Eagle extends Animal{


    public Eagle(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("Scream");
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
