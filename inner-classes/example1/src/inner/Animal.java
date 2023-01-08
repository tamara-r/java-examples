package inner;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private List<Mammal> animals;

    public Animal() {
        this.animals = new ArrayList<>();
    }

    public void addAnimals(Animal.Mammal mammal) {
        animals.add(mammal);
    }

    public void showAllAnimals() {
        System.out.println("List of animals:");
        animals.forEach(animal -> System.out.println(animal.getName()));
    }

    public class Mammal {
        private String name;

        public Mammal(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @SuppressWarnings("unused")
        public void setName(String name) {
            this.name = name;
        }
    }
}
