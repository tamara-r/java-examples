package test;

import inner.Animal;

public class Test {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal.Mammal a1= animal.new Mammal("Elephant");
        Animal.Mammal a2 = animal.new Mammal("Dog");
        Animal.Mammal a3= animal.new Mammal("Dolphin");
        Animal.Mammal a4= animal.new Mammal("Tigar");
        Animal.Mammal a5 = animal.new Mammal("Eagle");

        animal.addAnimals(a1);
        animal.addAnimals(a2);
        animal.addAnimals(a3);
        animal.addAnimals(a4);
        animal.addAnimals(a5);

        animal.showAllAnimals();
    }
}
