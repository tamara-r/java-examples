package test;

import generics.Book;
import generics.ListItem;
import generics.Person;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws NoSuchFieldException {

        ListItem<String> i1 = new ListItem<>("Bread");
        ListItem<String> i2 = new ListItem<>("Milk");
        ListItem<Integer> quantity = new ListItem<>(5);
        ListItem<Double> budget = new ListItem<>(2000.50);

        Person p1 = new Person<>("Tamara", 35, "1606987715796");
        Person p2 = new Person<>("Pera", 30, 6198030);

        Book b1 = new Book<>("Na Drini cuprija", "Ivo Andric", 1500);
        Book b2 = new Book<>("Zlocin i kazna", "Fjodor Dostojevski", 2650.99);

        System.out.println("Type of " + i1 + " is " + i1.getElement().getClass().getName());
        System.out.println("Type of " + i2+ " is " + i2.getElement().getClass().getName());
        System.out.println("Type of " + quantity + " is " + quantity.getElement().getClass().getName());
        System.out.println("Type of " + budget + " is " + budget.getElement().getClass().getName());

        System.out.println("Type of unique identifier " + p1.getUnique_identifier() + " is "
                + p1.getUnique_identifier().getClass().getName());
        System.out.println("Type of unique identifier " + p2.getUnique_identifier() + " is "
                + p2.getUnique_identifier().getClass().getName());

        System.out.println("Price for " + b1.getName() + " is "
                + b1.getPrice().getClass().getName() + " type, super class: " + b1.getPrice().getClass().getSuperclass());
        System.out.println("Price for " + b2.getName() + " is "
                + b2.getPrice().getClass().getName() + " type, super class: " + b2.getPrice().getClass().getSuperclass());

        List<? super Object> list = new ArrayList<>();
        list.add(i1);
        list.add(i2);
        list.add(quantity);
        list.add(budget);
        list.add(p1);
        list.add(p2);
        list.add(b1);
        list.add(b2);

        System.out.println("List items: ");
        list.forEach(item -> {
            System.out.println(item);
        });

    }
}
