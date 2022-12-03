package generics;

public class Professor extends Person{

    public Professor(String firstName, String lastName) {
        super.firstName = firstName;
        super.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
