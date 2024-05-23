package week2;

import java.math.BigInteger;
import java.util.Scanner;

public class BigMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while ( true ) {
            // Get Input
            System.out.print("Enter a number: ");
            String userInput = scanner.next();

            // Exit loop if user enters q
            if (userInput.equals("q")) {
                break;
            }

            // Convert user's number for use in functions
            int number = Integer.parseInt(userInput);

            // Test myLog
            System.out.println("Log Functions");
            System.out.println("log:\t\t" + myLog2(number));
            System.out.println("n * log:\t" + myNLog(number, 10));
            System.out.println("quadratic:\t" + myQuadratic(number));

            // Test factorial
            System.out.println("Factorial Function");
            System.out.println(factorial(number));
        }
        scanner.close();
    }

    static BigInteger factorial(int n) {
        BigInteger result = BigInteger.valueOf(1);
        while ( n > 1 ) {
            result = result.multiply(BigInteger.valueOf(n));
            n -= 1;
        }
        return result;
    }

    static double myLog2(double x) {
        // Logarithmic function for base 2
        return Math.log(x) / Math.log(2);
    }

    static double myNLog(float x, double n) {
        return n * myLog2(x);
    }

    static float myQuadratic(float x) {
        return x * x;
    }

    void loops() {
        for (int i = 0; i<10; i++) {
            System.out.println(i);
        }

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
}
