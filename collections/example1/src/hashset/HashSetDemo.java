package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> daysOfWeek = new HashSet<>();

        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        // Adding duplicate elements will be ignored
        daysOfWeek.add("Monday");

        Iterator<String> i = daysOfWeek.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        String day = "Monday";
        if(daysOfWeek.contains(day)) {
            System.out.println(day + " is in the list.");
        } else {
            System.out.println(day + " is not in the list.");
        }

        System.out.println(daysOfWeek.getClass().getSimpleName() + " has "
                + daysOfWeek.size() + " elements.");

        daysOfWeek.removeIf(list -> list.contains("Monday"));
        System.out.println("After removing:");

        Iterator<String> i2 = daysOfWeek.iterator();
        while (i2.hasNext()) {
            System.out.print(i2.next());
            System.out.print(" ");
        }

        System.out.println();
        
        HashSet<String> months = new HashSet<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        HashSet<String> calendar = new HashSet<>();

        calendar.addAll(months);

        System.out.println(calendar);

        calendar.addAll(daysOfWeek);

        System.out.println(calendar);

        calendar.retainAll(daysOfWeek);
        System.out.println(calendar);

        System.out.println("Does calendar contains months? " + calendar.containsAll(months));
    }
}
