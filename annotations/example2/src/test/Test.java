package test;

import annotations.ClassFields;
import annotations.OperationSystem;
import devices.Computer;
import devices.Desktop;
import devices.Laptop;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws IllegalAccessException {
        Computer c1 = new Desktop("Pentium 4");
        Computer c2 = new Laptop("MacBook Air", 1500.89);

        Class class1 = c1.getClass();
        OperationSystem operationSystem = (OperationSystem) class1.getAnnotation(OperationSystem.class);
        System.out.println(c1);
        System.out.println(operationSystem);

        Class class2 = c2.getClass();
        OperationSystem operationSystem2 = (OperationSystem) class2.getAnnotation(OperationSystem.class);
        System.out.println("------------------------------------------");
        System.out.println(c2);
        System.out.println(operationSystem2);

        for(Field f : c2.getClass().getSuperclass().getDeclaredFields() ) {
            for (Field field : c2.getClass().getDeclaredFields()) {
                ClassFields classFields = field.getAnnotation(ClassFields.class);
                ClassFields cf = f.getAnnotation(ClassFields.class);

                System.out.println("Field name: " + cf.name());
                f.setAccessible(true);
                Object value1 = f.get(c2);
                System.out.println("Field value: " + value1);

                System.out.println("Field name: " + classFields.name());
                field.setAccessible(true);
                Object value2 = field.get(c2);
                System.out.println("Field value: " + value2);
            }
        }
    }
}
