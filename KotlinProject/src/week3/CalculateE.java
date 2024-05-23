package week3;

public class CalculateE {
    public static double calculateE() {
        double e = 1.0;
        int n = 1;
        double factorial = 1.0;

        while (n <= 100) {
            factorial *= n;
            e += 1.0 / factorial;
            n++;
        }

        return e;
    }

    public static void main(String[] args) {
        System.out.println(calculateE());
        System.out.println(Math.E);
    }
}
