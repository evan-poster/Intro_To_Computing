package week2;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class ArrayChecker {
    public static void main(String[] args) {
        // Set up array and number
        int[] array = {1, 3, 5, 10, 4, 7 };
        int targetNum = 9;

        System.out.println(Arrays.toString(twoSum(array, targetNum)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }

}
