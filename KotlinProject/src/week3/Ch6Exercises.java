package week3;


import java.math.BigDecimal;

public class Ch6Exercises {
    public static void main(String[] args) {
        System.out.println(gcd_iterative(34, 17));
        System.out.println(gcd_recursive(17, 12));
        System.out.println(NLogN(10));
    }
    
    // Ex1: Implement Euclidean GCD ( Greatest Common Divisor) iteratively
    public static int gcd_iterative(int numerator, int denominator) {
        while (numerator != denominator) {
            if ( numerator > denominator) {
                numerator = numerator - denominator;
            } else {
                denominator = denominator - numerator;
            }
        }
        return denominator;
    }

    // Ex2: Implement Euclidean GCD recursively
    public static int gcd_recursive(int numerator, int denominator) {
        if (denominator == 0) {
            return numerator;
        }
        return gcd_recursive(denominator, numerator % denominator);
    }

    // E3: Use BigDecimal to implement NLogN
    public static BigDecimal NLogN(int n) {
        // There is no specification of recreating the log() function or
        // using a different base.
        // Code will simply compute the equivalent of N log(N) using BigDecimal
        BigDecimal result = BigDecimal.valueOf(n);
        BigDecimal logN = BigDecimal.valueOf(Math.log(n));
        return result.multiply(logN);
    }

}
