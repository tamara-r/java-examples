package test;

import anonymous.Animal;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Animal a1= new Animal("Elephant");
        Animal a2 = new Animal("Dog");
        Animal a3= new Animal ("Dolphin");
        Animal a4= new Animal("Tigar");
        Animal a5 = new Animal("Eagle");


        animal.addAnimals(a1);
        animal.addAnimals(a2);
        animal.addAnimals(a3);
        animal.addAnimals(a4);
        animal.addAnimals(a5);

        animal.show();
    }
}
