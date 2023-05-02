package array_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

    public static void main(String[] args) {


        //        System.out.println(threeSum(new int[] {-1, 0, 1, 2, -1, 4}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                if (nums[i] > 0) {
                    return new ArrayList<>(result);
                }

                int sum = nums[i] + nums[j] + nums[k];

                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                }

            }
        }
        return new ArrayList<>(result);
    }
}
