package inner;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private List<Mammal> animals;

    public Animal() {
        this.animals = new ArrayList<>();
    }

    @SuppressWarnings("unused")
    public void addAnimals(Animal.Mammal mammal) {
        animals.add(mammal);
    }

    @SuppressWarnings("unused")
    public List<Mammal> getAnimals() {
        return animals;
    }

    Runnable showAnimals = new Runnable() {
        @Override
        public void run() {
            animals.forEach(animal -> System.out.println(animal.getName()));
        }
    };

    public Runnable getShowAnimals() {
        return showAnimals;
    }

    @SuppressWarnings("unused")
    public void show() {
        showAnimals.run();
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

    public static class Food {
        @SuppressWarnings("unused")
        private void eating() {
            System.out.println("Mammals eat grass");
        }
    }
}
