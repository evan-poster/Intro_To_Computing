// Chapter 2/Exercise 1.java

// Ex1: reimplement max function to return the bigger one between two numbers.
// Note: do NOT use Math.max, but do use Java's native ternary operator

public class Main {

    public static void main(String[] args) {
        System.out.println(newMax(5, 6));
    }

    public static int newMax(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }
}
