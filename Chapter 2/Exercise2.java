// Chapter 2/Exercise 2.java

// Ex2: reimplement the previous max function,
// create max3 function such that it takes three numbers and return the largest one.


public class Main {

    public static void main(String[] args) {
        System.out.println(newMax3(5, 6, 7));
    }

    public static int newMax3(int a, int b, int c) {
        // Nested ternary operators
        return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    }

}
