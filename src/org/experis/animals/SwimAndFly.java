package org.experis.animals;

public class SwimAndFly {
    public static void main(String[] args) {

        CanSwim dolphin = new Dolphin("Dolphy");

        makeswim(dolphin);

        CanFly eagle = new Eagle("John");

        makefly(eagle);

        CanFly sparrow = new Sparrow("Sparry");

        makefly(sparrow);


        // nel secondo esempio istanzio un array di animali e a seconda di quale istanza fa parte chiamo il metodo
        // appropriato castando

        Animal[] animals = {new Eagle("Eagle2"), new Sparrow("Sparry2"), new Dolphin("Dolphy2")};

        for (Animal animal : animals) {
            if (animal instanceof CanFly) {
                ((CanFly) animal).fly();
            } else if (animal instanceof CanSwim) {
                ((CanSwim) animal).swim();
            }
        }
    }

    private static void makeswim(CanSwim canSwim) {

        canSwim.swim();

    }

    private static void makefly(CanFly canfly) {
        canfly.fly();
    }
}
