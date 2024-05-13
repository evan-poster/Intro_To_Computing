//import java.util.ArrayList;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter something: ");
//        String userInput = scanner.nextLine();
//        System.out.print("Your said: " + userInput);
//        scanner.close();
//        Integer myInteger = 1;
//        int myInt = myInteger;
//        int[] intArray = {0, 1, 2, 3};
//        intArray = new int[100];
        int num1 = 5;
        int num2 = 6;
        int[] nums = {5, 6, 7};
        System.out.println(myMax(5, 6));
        System.out.println(myMin(5, 6));
        System.out.println(myMax(nums));
        System.out.println(myMin(nums));
    }

    //
    // Chapter 1 Exercises
    //

    public static void Ch1Ex1() {
        // Exercises for Ch 1
        // Output which numbers from 0 to 20 are divisible by 5
        for (int i = 0; i < 20; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void Ch1Ex2() {
        // Output the square of all numbers between 100 and 200 (inclusive)
        for ( int i = 100; i <= 200; i++ ) {
            double square = Math.sqrt(i);
            System.out.println(square);
        }
    }

    //
    // Chapter 2 Exercises

    // Ex1: reimplement max function to return the bigger one between two numbers.
    // Note: do NOT use Math.max, but do use Java's native ternary operator
    public static int Ch2Ex1(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    // Ex2: reimplement the previous max function,
    // create max3 function such that it takes three numbers and return the largest one.
    public static int Ch2Ex2(int a, int b, int c) {
        return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    }
    
    // Ex1: reimplement max function to return the bigger one between two numbers.
    // Note: do NOT use Math.max, but do use Java's native ternary operator
    public static int myMax(int a, int b) {
        return a > b ? a : b;
    }

    public static int myMin(int a, int b) {
        return a < b ? a : b;
    }

    public static int myMax(int[] a) {
        int result = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > result) {
                result = a[i];
            }
        }
        return result;
    }

    public static int myMin(int[] a) {
        int result = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < result) {
                result = a[i];
            }
        }
        return result;
    }
}
