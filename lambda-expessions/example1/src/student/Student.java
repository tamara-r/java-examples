package student;

import person.Person;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Student extends Person {

    public Student(String firstName, String lastName, String gender, int age) {
        super(firstName, lastName, gender, age);
    }

    public static Predicate<Student> isAdultMale() {
        return p -> p.getAge() >= 18 && p.getGender().equals("M");
    }

    public static Predicate<Student> isAdultFemale() {
        return p -> p.getAge() >= 18 && p.getGender().equals("F");
    }

    public static Predicate<Student> isMinorMale() {
        return p -> p.getAge() < 18 && p.getGender().equals("M");
    }

    public static Predicate<Student> isMinorFemale() {
        return p -> p.getAge() < 18 && p.getGender().equals("F");
    }

    public static Predicate<Student> isAgeMoreThan(Integer age) {
        return p -> p.getAge() > age;
    }

    public static List<Student> filterStudents (List<Student > students, Predicate<Student> predicate) {
        return students.stream()
                .filter(predicate)
                .collect(Collectors.<Student>toList());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
