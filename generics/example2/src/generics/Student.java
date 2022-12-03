package generics;

public class Student extends Person {
    private String indexNumber;

    public Student(String firstName, String lastName, String indexNumber) {
        super.firstName = firstName;
        super.lastName = lastName;
        this.indexNumber = indexNumber;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " [" + indexNumber + "]";
    }
}
