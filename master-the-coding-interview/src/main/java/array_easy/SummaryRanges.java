package array_easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));
    }

    public static List<String> summaryRanges(int[] nums) {
        if(nums.length == 0) return List.of();

        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] + 1 == nums[i]) {
                count++;
                if (count == 1) {
                    sb.append(nums[i - 1]).append("->");
                }
            } else if (count > 0) {
                sb.append(nums[i - 1]);
                result.add(sb.toString());
                sb.setLength(0);
                count = 0;
            } else {
                result.add(String.valueOf(nums[i - 1]));
            }

        }
        sb.append(nums[nums.length - 1]);
        result.add(sb.toString());
        return result;
    }
}
