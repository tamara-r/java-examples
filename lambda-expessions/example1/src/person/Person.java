package person;

public class Person {
    protected String firstName;
    protected String lastName;
    protected String gender;
    protected int age;
    protected int id;
    private static int idGenerator = 1;

    public Person(String firstName, String lastName, String gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.id = idGenerator++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + ". " + firstName + " " + lastName + ", " + age;
    }
}
