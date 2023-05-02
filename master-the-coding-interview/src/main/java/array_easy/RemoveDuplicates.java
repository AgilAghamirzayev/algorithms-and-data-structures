package array_easy;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] ints = {1, 1, 2};
        removeDuplicates(ints);
        System.out.println(Arrays.toString(ints));
    }


    public static int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; ++i)
            if (nums[i] != nums[i - 1]) nums[k++] = nums[i];
        return k;
    }

}
