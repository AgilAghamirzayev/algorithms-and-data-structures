package array_easy;

public class MinimumAverageDifference {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        

        b = (a + b) - (a = b);
        System.out.println(a);
        System.out.println(b);
    }


    public int minimumAverageDifference(int[] nums) {

        int n = nums.length;
        long maxSum = Long.MAX_VALUE;
        long post = 0;
        long pre = 0;
        int index = 0;

        for (int i : nums) {
            post += i;
        }

        for (int i = 0; i < n; i++) {
            pre += nums[i];
            post -= nums[i];

            long a = pre / (i + 1);
            long b = (i == n - 1) ? 0 : post / (n - i - 1);
            long absDifSum = Math.abs(a - b);

            if (absDifSum == 0) return i;
            if (absDifSum < maxSum) {
                maxSum = absDifSum;
                index = i;
            }
        }

        return index;
    }
}
