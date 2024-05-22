package week2;

import java.util.HashMap;
import java.util.Map;

// Ex1: implement a TwoSum function which takes two parameters:
//      1) an array  of integers
//      2) a target value.
//      TwoSum enumerates the array and finds the first pair whose sum matches the target value.
//      If there's a match, returns true, else returns false.
//
//      For example:  given this array: [5, 3, 10, 4, 11],
//          if the target is 7, TwoSum returns true; with the same array,
//          if the target is 19, TwoSum returns false, because throughout the array,
//          there's NO such pair of numbers which add up to 19.
//
// You can implement this in either Java or Kotlin.
// Note: compile your code on command line first, then run it on command line as well.

public class Ch4Ex1 {

    public static void main(String[] args) {
        // Testing Data
        int[] array = {5, 3, 10, 4, 11};

        System.out.println(twoSum(array, 7)); // true
        System.out.println(twoSum(array, 19)); // false
    }

    public static boolean twoSum(int[] nums, int target) {
        // Uses a hash map for efficiency
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        // Iterate through the numbers
        for (int i = 0; i < n; i++) {
            // Note the complement for reach number we encounter
            int complement = target - nums[i];
            // If we've already found this number, our task is complete
            if (numMap.containsKey(complement)) {
                return true;
            }
            // Otherwise, simply add it to the hash map for future reference
            numMap.put(nums[i], i);
        }

        return false; // No solution found
    }
}
