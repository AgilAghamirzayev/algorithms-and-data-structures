package array_easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(calculate1(new int[]{1, 3, 7, 9, 2}, 11)));
        System.out.println(Arrays.toString(calculate2(new int[]{1, 3, 7, 9, 2}, 11)));
    }

    public static int[] calculate2(int[] nums, int target) {
        if (nums.length < 2) return null;

        HashMap<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int numberToFind = target - nums[i];
            if (numbers.containsKey(nums[i])) {
                return new int[]{numbers.get(nums[i]), i};
            }
            numbers.put(numberToFind, i);
        }

        return null;
    }

    public static int[] calculate1(int[] nums, int sum) {

        if (nums.length < 2) {
            return null;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            int p1 = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int p2 = nums[j];
                if (sum - p1 == p2) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }
}
