package week2;

import java.util.Arrays;

public class Linear {
    public int i;
    public static void main(String[] args) {
        int[] arr = { 3, 4, 9, 6, 1 };
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    result[i] += 1;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result));
    }
}
