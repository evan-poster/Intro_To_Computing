
public class Main {
    public static void main(String[] args) {
        // Ex 1: output the first 20 interger numbers, starting from 0, which are divisible by 5
        // Technically, this will not include 20 because we start from 0
        for ( int i = 0; i < 20; i++ ) {
            if ( i % 5 == 0 ) {
                System.out.println(i);
            }
        }
    }
}
