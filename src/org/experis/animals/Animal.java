package org.experis.animals;

public abstract class Animal {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println("Zzz");
    }

    public abstract void verso();

    public abstract void eat();

    @Override
    public String toString() {
        return "Animal{}";
    }
}
