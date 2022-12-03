package test;

import calculator.SingleNumberCalculator;
import calculator.TwoNumbersCalculator;
import generic.GenericInterface;
import sound.Sound;

import java.util.ArrayList;
import java.util.List;

public class LambdaTest {
    public static void main(String[] args) {

        double num = 25;
        SingleNumberCalculator c1 = (double x) -> {
            return x * 3;
        };
        SingleNumberCalculator c2 = (double x) -> x / 2 ;
        SingleNumberCalculator c3 = (double x) -> x * x;
        SingleNumberCalculator c4 = (double x) -> Math.sqrt(x);
        SingleNumberCalculator c5 = (double x) -> x - 80;
        SingleNumberCalculator c6 = (double x) -> Math.abs(x - 80);

        System.out.println("Multiply " + num + " with 3: " + c1.calculate(num));
        System.out.println("Divide " + num + " with 2: " + c2.calculate(num));
        System.out.println("Square of " + num + " is: " + c3.calculate(num));
        System.out.println("Square Root of " + num + " is: " + c4.calculate(num));
        System.out.println("Subtract with 80: " + c5.calculate(num));
        System.out.println("Absolute value: " + c6.calculate(num) + '\n');

        TwoNumbersCalculator t1 = (double x, double y) -> x + y;
        TwoNumbersCalculator t2 = (double x, double y) -> x - y ;
        TwoNumbersCalculator t3 = (double x, double y) -> x * y;
        TwoNumbersCalculator t4 = (double x, double y) -> x / y;
        TwoNumbersCalculator t5 = (double x, double y) -> (x + y) * (x - y);

        double num1 = 6;
        double num2 = 2;

        System.out.println(num1 + " + " + num2 + " = " + t1.calculate(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + t2.calculate(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + t3.calculate(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + t4.calculate(num1, num2));
        System.out.println("("+ num1 + " + " + num2 + " ) * " + "("+ num1 + " - " + num2 + " ) = "
                 + t5.calculate(num1, num2) + '\n');

        Sound s1 =  () -> {
            return "Woof";
        };

        Sound s2 =  () -> {
            return "Meow";
        };

        Sound s3 =  () -> {
            return "Brrrr";
        };

        System.out.println("Dog says: " + s1.sound());
        System.out.println("Cat says: " + s2.sound());
        System.out.println("Car goes: " + s3.sound() + '\n');

        List<Sound> soundList = new ArrayList<>();
        soundList.add(s1);
        soundList.add(s2);
        soundList.add(s3);

        System.out.println("List of sounds:");
        soundList.forEach(s -> System.out.println(s.sound()));

        System.out.println();

        GenericInterface<String> reverse = (str) -> {
            String result = "";
            for (int i = str.length()-1; i >= 0 ; i--)
                result += str.charAt(i);
            return result;
        };

        String text = "Java";
        System.out.println(text + " reversed: " + reverse.genericMethod(text) + '\n');

        GenericInterface<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };

        int num3 = 4;
        System.out.println("Factorial of " + num3 + " = " + factorial.genericMethod(num3));

    }

}
