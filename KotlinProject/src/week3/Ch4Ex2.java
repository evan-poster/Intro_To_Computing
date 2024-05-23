package week3;

// Ex2: Reimplement the sorting algorithm listed on page 543 with Kotlin,
//      and write some tests to verify your implementation.
//
//      Note: compile your code on command line first, then run it via command line.

public class Ch4Ex2 {
    public static void main(String[] args) {

    }

    public static void sort(String[] a)
    {
        int n = a.length;
        for (int i = 1; i < n; i++)
            for (int j = i; j > 0; j--)
                if (a[j-1].compareTo(a[j]) > 0)
                    System.out.println("foo");//exchange(a, j-1, j);
                else break;
    }
}
