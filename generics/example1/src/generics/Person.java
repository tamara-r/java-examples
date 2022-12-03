package generics;

public class Person <T>{
    private String name;
    private int age;
    private T unique_identifier;

    public Person(String name, int age, T unique_identifier) {
        this.name = name;
        this.age = age;
        this.unique_identifier = unique_identifier;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public T getUnique_identifier() {
        return unique_identifier;
    }

    @Override
    public String toString() {
        return "Person [" +
                "name: '" + name + '\'' +
                ", age: " + age +
                ", unique_identifier: " + unique_identifier +
                ']';
    }
}
