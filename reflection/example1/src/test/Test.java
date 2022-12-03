package test;

import storage.Cargo;
import transport.Car;
import transport.ElectricCar;
import transport.Truck;

import java.lang.reflect.*;

public class Test {
    public static void main(String[] args) {

        Car car = new Car("Bmw", "X6");
        Truck t = new Truck(4000);
        Car electricCar = new ElectricCar("Tesla", "3");

        car.setDistance(300);
        car.setGasAmount(36);

        System.out.println("Consumption for " + car + " is " +  car.calculateConsumption() + " km per l.");
        System.out.println(electricCar + " does not use gas.");

        Cargo c1 = new Cargo(250);
        Cargo c2 = new Cargo(1080);
        Cargo c3 = new Cargo(480);
        Cargo c4 = new Cargo(1590);

        t.addCargo(c1);
        t.addCargo(c2);
        t.addCargo(c3);
        t.addCargo(c4);

        t.setDistance(2400);
        t.setGasAmount(100);
        System.out.println(t);
        System.out.println("Consumption for " + t.getClass() + " is " +  t.calculateConsumption() + "km per l.");

        System.out.println("Testing classes");
        System.out.println("-------------------------------------------");

        // getClass() method of an object returns a
        // instance representing the class of the object

        // cn => to extract class name only
        // pn => to extract package name only

        Class carClass = car.getClass();
        String cn1 = carClass.getName().substring(carClass.getName().indexOf('.') + 1, carClass.getName().length());
        String pn1 = carClass.getName().substring(0, carClass.getName().indexOf('.'));
        System.out.println("Class name: " + cn1);
        System.out.println("Package: " + pn1);

        for(Field field : carClass.getDeclaredFields()) {
            int modifier = field.getModifiers();
            String mod = Modifier.toString(modifier);
            System.out.println("Field name: " + field.getName() + ", modifier: " + mod + ", type: " + field.getType());
        }

        System.out.println("----------------------------------------------------------------------------------");

        for(Constructor constructor : carClass.getConstructors()) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("Constructor: " + constructor.getName() + ", parameterType: " + parameterType);
            }
        }

        System.out.println("----------------------------------------------------------------------------------");

        for(Method method : carClass.getDeclaredMethods()) {
            int modifier = method.getModifiers();
            String mod = Modifier.toString(modifier);
            System.out.println("Method name: " + method.getName() + ", modifier: " + mod +
                    ", type: " + method.getAnnotatedReturnType());
        }

        System.out.println("----------------------------------------------------------------------------------");

        System.out.println("Does " + cn1 + " class has super class? " + (carClass.getSuperclass() != null));
        System.out.println("[package.superclass]: " + carClass.getSuperclass().getName());
        System.out.println("Is super class abstract? " + Modifier.isAbstract(carClass.getSuperclass().getModifiers()));

        System.out.println("\n----------------------------------------------------------------------------------\n");

        Class electricCarClass = electricCar.getClass();
        String cn2 = electricCarClass.getName().substring(electricCarClass.getName().indexOf('.') + 1, electricCarClass.getName().length());
        String pn2 = electricCarClass.getName().substring(0, electricCarClass.getName().indexOf('.'));
        System.out.println("Class name: " + cn2);
        System.out.println("Package: " + pn2);

        for(Field field : electricCarClass.getDeclaredFields()) {
            int modifier = field.getModifiers();
            String mod = Modifier.toString(modifier);
            System.out.println("Field name: " + field.getName() + ", modifier: " + mod + ", type: " + field.getType());
        }

        System.out.println("----------------------------------------------------------------------------------");

        for(Constructor constructor : electricCarClass.getConstructors()) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("Constructor: " + constructor.getName() + ", parameterType: " + parameterType);
            }
        }

        System.out.println("----------------------------------------------------------------------------------");

        for(Method method : electricCarClass.getDeclaredMethods()) {
            int modifier = method.getModifiers();
            String mod = Modifier.toString(modifier);
            System.out.println("Method name: " + method.getName() + ", modifier: " + mod +
                    ", type: " + method.getAnnotatedReturnType());
        }

        System.out.println("----------------------------------------------------------------------------------");

        System.out.println("Does " + cn2 + " class has super class? " + (electricCarClass.getSuperclass() != null));
        System.out.println("[package.superclass]: " + electricCarClass.getSuperclass().getName());
        System.out.println("Is super class abstract? " + Modifier.isAbstract(electricCarClass.getSuperclass().getModifiers()));


        System.out.println("\n----------------------------------------------------------------------------------\n");

        Class truckClass = t.getClass();
        String cn3 = truckClass.getName().substring(truckClass.getName().indexOf('.') + 1, truckClass.getName().length());
        String pn3 = truckClass.getName().substring(0, truckClass.getName().indexOf('.'));
        System.out.println("Class name: " + cn3);
        System.out.println("Package: " + pn3);

        for(Field field : truckClass.getDeclaredFields()) {
            int modifier = field.getModifiers();
            String mod = Modifier.toString(modifier);
            System.out.println("Field name: " + field.getName()
                    + ", modifier: " + mod + ", type: " + field.getType());
        }

        Field[] f = truckClass.getDeclaredFields();
        System.out.println(f[1].getName() + " list type: " + f[1].getGenericType());

        System.out.println("----------------------------------------------------------------------------------");

        for(Constructor constructor : truckClass.getConstructors()) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("Constructor: " + constructor.getName() + ", parameterType: " + parameterType);
            }
        }

        System.out.println("----------------------------------------------------------------------------------");

        for(Method method : truckClass.getDeclaredMethods()) {
            int modifier = method.getModifiers();
            String mod = Modifier.toString(modifier);
            System.out.println("Method name: " + method.getName() + ", modifier: " + mod +
                    ", type: " + method.getAnnotatedReturnType());
        }

        System.out.println("----------------------------------------------------------------------------------");

        System.out.println("Does " + cn3 + " class has super class? " + (truckClass.getSuperclass() != null));
        System.out.println("[package.superclass]: " + truckClass.getSuperclass().getName());
        System.out.println("Is super class abstract? " + Modifier.isAbstract(truckClass.getSuperclass().getModifiers()));


        System.out.println("\n----------------------------------------------------------------------------------\n");

        Class cargoClass = c1.getClass();
        String cn4 = cargoClass.getName().substring(cargoClass.getName().indexOf('.') + 1, cargoClass.getName().length());
        String pn4 = cargoClass.getName().substring(0, cargoClass.getName().indexOf('.'));
        System.out.println("Class name: " + cn4);
        System.out.println("Package: " + pn4);

        for(Field field : cargoClass.getDeclaredFields()) {
            int modifier = field.getModifiers();
            String mod = Modifier.toString(modifier);
            System.out.println("Field name: " + field.getName() + ", modifier: " + mod + ", type: " + field.getType());
        }

        System.out.println("----------------------------------------------------------------------------------");

        System.out.print("Constructor: ");
        for(Constructor constructor : cargoClass.getConstructors()) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("Constructor: " + constructor.getName() + ", parameterType: " + parameterType);
            }
        }

        System.out.println("----------------------------------------------------------------------------------");

        for(Method method : cargoClass.getDeclaredMethods()) {
            int modifier = method.getModifiers();
            String mod = Modifier.toString(modifier);
            System.out.println("Method name: " + method.getName() + ", modifier: " + mod +
                    ", type: " + method.getAnnotatedReturnType());
        }

        System.out.println("----------------------------------------------------------------------------------");

        System.out.println("Does " + cn4 + " class has super class? " + (cargoClass.getSuperclass() != null));
        System.out.println("[package.superclass]: " + cargoClass.getSuperclass().getName());
        System.out.println("Is super class abstract? " + Modifier.isAbstract(cargoClass.getSuperclass().getModifiers()));
    }

}
