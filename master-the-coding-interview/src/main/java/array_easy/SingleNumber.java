package array_easy;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> numToCount = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(numToCount.containsKey(nums[i])) {
                numToCount.put(nums[i], numToCount.get(nums[i])+1);
            } else {
                numToCount.put(nums[i], 1);
            }
        }


        for(int i = 0; i < nums.length; i++) {
            if(numToCount.get(nums[i]) == 1) return nums[i];
        }

        return 0;


    }
}
