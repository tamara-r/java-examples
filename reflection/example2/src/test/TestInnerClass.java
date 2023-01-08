package test;

import inner.Animal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestInnerClass {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Animal animal = new Animal();
        Animal.Mammal mammal= animal.new Mammal("Elephant");
        Animal.Food food = new Animal.Food();

        // outer class
        Class animalClass = animal.getClass();
        // inner anonymous
        Class anonymousClass = animal.getShowAnimals().getClass();
        // inner non-static
        Class mammalClass = mammal.getClass();
        // inner static
        Class foodClass = food.getClass();

        // Checking if the given classes are nested

        // getEnclosinglClass() of Class instance returns a
        // class object representing the immediate enclosing
        // class of the instance

        // classInstance methods returns a Class object
        // If the specified class is a top-level class, then it would returns null (false))

        boolean isNested1 = animalClass.getEnclosingClass() != null;
        boolean isNested2 = anonymousClass.getEnclosingClass() != null;
        boolean isNested3 = mammalClass.getEnclosingClass() != null;
        boolean isNested4 = foodClass.getEnclosingClass() != null;

        // Checking if the given classes are static

        // getModifiers() method of a class returns the modifiers of the class encoded as an integer
        // isStatic() returns true if the class has a static modifier
        
        boolean isStatic1 = Modifier.isStatic(animalClass.getModifiers());
        boolean isStatic2 = Modifier.isStatic(anonymousClass.getModifiers());
        boolean isStatic3 = Modifier.isStatic(mammalClass.getModifiers());
        boolean isStatic4 = Modifier.isStatic(foodClass.getModifiers());

        // Checking if the given classes are local classes
        boolean isLocal1 = animalClass.isLocalClass();
        boolean isLocal2 = anonymousClass.isLocalClass();
        boolean isLocal3 = mammalClass.isLocalClass();
        boolean isLocal4 = foodClass.isLocalClass();

        // Checking if the given classes are member classes
        boolean isMember1 = animalClass.isMemberClass();
        boolean isMember2 = anonymousClass.isMemberClass();
        boolean isMember3 = mammalClass.isMemberClass();
        boolean isMember4 = foodClass.isMemberClass();

        // Checking if the given classes are anonymous classes
        boolean isAnonymous1 = animalClass.isAnonymousClass();
        boolean isAnonymous2 = anonymousClass.isAnonymousClass();
        boolean isAnonymous3 = mammalClass.isAnonymousClass();
        boolean isAnonymous4 = foodClass.isAnonymousClass();

        // Extracting class names
        String animalClassName = animalClass.getSimpleName();

        String anonymousClassName = anonymousClass.getSimpleName();

        String mammalClassName = mammalClass.getSimpleName();

        String foodClassName = foodClass.getSimpleName();

        // testing classes
        System.out.println("Is " + animalClassName + " inner class: " + isNested1);
        System.out.println("Is " + animalClassName + " static class: " + isStatic1);
        System.out.println("Is " + animalClassName + " local class: " + isLocal1);
        System.out.println("Is " + animalClassName + " member class: " + isMember1);
        System.out.println("Is " + animalClassName + " anonymous class: " + isAnonymous1);
        System.out.println("Is " + animalClassName + " outer class: " + !isNested1);
        System.out.println("\n----------------------------------------------------------\n");

        System.out.println("Is " + anonymousClassName + " inner class: " + isNested2);
        System.out.println("Is " + anonymousClassName + " static class: " + isStatic2);
        System.out.println("Is " + anonymousClassName + " local class: " + isLocal2);
        System.out.println("Is " + anonymousClassName + " member class: " + isMember2);
        System.out.println("Is " + anonymousClassName + " anonymous class: " + isAnonymous2);
        System.out.println("\n----------------------------------------------------------\n");

        System.out.println("Is " + mammalClassName + " inner class: " + isNested3);
        System.out.println("Is " + mammalClassName + " static class: " + isStatic3);
        System.out.println("Is " + mammalClassName + " local class: " + isLocal3);
        System.out.println("Is " + mammalClassName + " member class: " + isMember3);
        System.out.println("Is " + mammalClassName + " anonymous class: " + isAnonymous3);
        System.out.println("\n----------------------------------------------------------\n");

        System.out.println("Is " + foodClassName + " inner class: " + isNested4);
        System.out.println("Is " + foodClassName + " static class: " + isStatic4);
        System.out.println("Is " + foodClassName + " local class: " + isLocal4);
        System.out.println("Is " + foodClassName + " member class: " + isMember4);
        System.out.println("Is " + foodClassName + " anonymous class: " + isAnonymous4);

        for(Method method : foodClass.getDeclaredMethods()) {
            System.out.println("Does " + foodClassName + " contain private method: " +
                    Modifier.isPrivate(method.getModifiers()));
        }

        System.out.println("\n----------------------------------------------------------\n");

       // added local class
        class LocalClass {
            public void greet() {
                System.out.println("I am a local class");
            }
        }

        LocalClass localClass = new LocalClass();
        Class local = localClass.getClass();
        String localName = local.getName().
                substring(local.getName().indexOf('$') + 2, local.getName().length());

        boolean isNested5 = local.getEnclosingClass() != null;
        boolean isStatic5 = Modifier.isStatic(local.getModifiers());
        boolean isLocal5 = local.isLocalClass();
        boolean isMember5 = local.isMemberClass();
        boolean isAnonymous5 = local.isAnonymousClass();

        System.out.println("Is " + localName + " inner class: " + isNested5);
        System.out.println("Is " + localName + " static class: " + isStatic5);
        System.out.println("Is " + localName + " local class: " + isLocal5);
        System.out.println("Is " + localName + " member class: " + isMember5);
        System.out.println("Is " + localName + " anonymous class: " + isAnonymous5);
    }
}
