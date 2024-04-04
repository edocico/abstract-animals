package org.experis.animals;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog("Dogo"), new Eagle("Eag"), new Sparrow("Sparry"), new Dolphin("Dolphy")};

        for (Animal animal : animals) {
            System.out.println(animal);
            System.out.println("Hello I'm " + animal.getName());
            animal.eat();
            animal.verso();
            animal.sleep();


        }




    }


}
