package test;

import student.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static student.Student.*;

public class Test {
    public static void main(String[] args) {

        Student s1 = new Student("Ana", "Zivkovic", "F", 21);
        Student s2 = new Student("Nikola", "Nikolic", "M", 16);
        Student s3 = new Student("Marko", "Markovic", "M", 23);
        Student s4 = new Student("Jovana", "Petrovic", "F", 20);
        Student s5 = new Student("Milan", "Milanovic", "M", 17);
        Student s6 = new Student("Marija", "Marijanovic", "F", 22);
        Student s7 = new Student("Anja", "Ivanovic", "F", 17);

        List<Student> students = new ArrayList<Student>();
        students.addAll(Arrays.asList(new Student[]{s1, s2, s3, s4, s5, s6, s7}));

        Iterator<Student> i = students.iterator();
        System.out.println("List of students: ");
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("Adult males are: " + filterStudents(students, isAdultMale()) );

        System.out.println("Adult females are: " + filterStudents(students, isAdultFemale()));

        System.out.println("Minor males are: " + filterStudents(students, isMinorMale()) );

        System.out.println("Minor females are: " + filterStudents(students, isMinorFemale()));

        System.out.println("Student that has at least 20: " +  filterStudents(students, isAgeMoreThan(20)) );
    }
}
