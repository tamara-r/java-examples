package test;

import generics.Person;
import generics.Professor;
import generics.Student;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Student s1 = new Student("Pera", "Peric", "I01234");
        Student s2 = new Student("Dusan", "Zoric", "M3456");
        Student s3 = new Student("Ana", "Jovanovic", "I56879");

        Professor p1 = new Professor("Nikola", "Ivanovic");
        Professor p2 = new Professor("Uros", "Jovanovic");


        p1.setAddon(55);
        System.out.println("Prof." + p1 + " is " + p1.getAddon() + " years old.");

        s1.setAddon(9.55);
        System.out.println("Avarage mark of " + s1 + " is " + s1.getAddon());

        p2.setAddon("Java");
        System.out.println("Prof." + p2 + " holds subject: " + p2.getAddon());

        List<Person> persons = new ArrayList<>();

        persons.add(s1);
        persons.add(s2);
        persons.add(s3);
        persons.add(p1);
        persons.add(p2);

        Collections.sort(persons);

        System.out.println("Sorted list of persons " + persons);

        Person person = new Person();
        Class personClass = person.getClass();
        String name = personClass.getSimpleName();
        String pack = String.valueOf(personClass.getPackage());
        System.out.println("Class name: " + name);
        System.out.println("Package: " + pack);
        Boolean testSuperClass = personClass.getSuperclass() != null;
        System.out.println("Is " + name + " super class? " + testSuperClass);

        for(Field field : personClass.getDeclaredFields()) {
            int modifier = field.getModifiers();
            String mod = Modifier.toString(modifier);
            System.out.println("Field name: " + field.getName() + ", modifier: " + mod + ", type: " + field.getType());
            System.out.println("Generic type is: " + field.getGenericType());
        }
    }
}
