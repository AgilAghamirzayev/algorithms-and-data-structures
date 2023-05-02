package array_easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LeetCode239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            List<Integer> windowNum = new ArrayList<>();
            windowNum.add(nums[windowEnd]);

            if (windowEnd >= k - 1) {
                Set<Integer> sortedSet = new TreeSet<>(windowNum);
                result.add((Integer) sortedSet.toArray()[sortedSet.size()-1]);
                windowNum.remove(windowStart);
            }
        }

        return result.stream().mapToInt(Integer::valueOf).toArray();
    }
}
