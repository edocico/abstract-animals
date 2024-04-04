package org.experis.animals;

public abstract class Animal {

    // attributi

    private String name;

    // constructor

    public Animal(String name) {
        this.name = name;
    }

    // getter

    public String getName() {
        return name;
    }


    //methods

    public void sleep() {
        System.out.println("Zzz");
    }

    public abstract void verso();

    public abstract void eat();

    @Override
    public String toString() {
        return "Animal{" + "name='" + name + '\'' + '}';
    }
}
