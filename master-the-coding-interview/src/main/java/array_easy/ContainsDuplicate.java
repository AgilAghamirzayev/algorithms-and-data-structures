package array_easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {

    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numToCount = new HashSet<>();

        for (int num : nums) {
            if (numToCount.contains(num)) return true;
            numToCount.add(num);
        }
        return false;
    }
}
