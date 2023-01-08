package anonymous;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    String name;
    List<Animal> animals;

    public Animal(String mame) {
        this.name = mame;
    }

    public Animal() {
        this.animals = new ArrayList<>();
    };

    public String getName() {
        return name;
    }

    public void setName(String mame) {
        this.name = mame;
    }

    public void addAnimals(Animal animal) {
        animals.add(animal);
    }

    Runnable showAnimals = new Runnable() {
        @Override
        public void run() {
            System.out.println("List of animals:");
            animals.forEach(animal -> System.out.println(animal.getName()));
        }
    };

    public void show() {
       showAnimals.run();
   }
}
