package test;

import annotations.ClassFields;
import users.Admin;
import users.User;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws IllegalAccessException {
        User u1 = new User("Pera Peric", "pera.peric@gmail.com");
        User u2 = new User("Laza Lazic", "laza.lazic@gmail.com");
        User u3 = new Admin("Tamara", "tamara@gmail.com");

        ArrayList<User> users = new ArrayList<>();

        users.add(u1);
        users.add(u2);


        for(User u : users) {
            for (Field field : u.getClass().getDeclaredFields()) {
                System.out.println(u);
                ClassFields classFields = field.getAnnotation(ClassFields.class);
                System.out.println("Field name: " + classFields.name());
                // changed the access to public
                field.setAccessible(true);
                Object value = field.get(u);
                System.out.println("Field value: " + value);

                System.out.println("Field type: " + classFields.type());
                System.out.println("----------------------------------------------");
            }
        }

        System.out.println(u3);
        for (Field field : u3.getClass().getSuperclass().getDeclaredFields()) {
            ClassFields classFields = field.getAnnotation(ClassFields.class);
            System.out.println("Field name: " + classFields.name());

            field.setAccessible(true);
            Object value = field.get(u3);

            System.out.println("Field value: " + value);
            System.out.println("Field type: " + classFields.type());
        }
    }
}
