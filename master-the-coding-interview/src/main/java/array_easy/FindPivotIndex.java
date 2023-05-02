package array_easy;

public class FindPivotIndex implements Runnable{

    public static void main(String[] args) {

    }


    public static int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;

        for (int num : nums) {
            leftSum += num;
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            leftSum -= nums[i];
            if (rightSum == leftSum) return i;
            rightSum += nums[i];
        }

        return -1;
    }

    public static int pivotIndex1(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < nums.length; i++) {

            for (int l = i; l < nums.length; l++) {
                leftSum += nums[l];
            }

            for (int r = i; r >= 0; r--) {
                rightSum += nums[r];
            }

            if (leftSum == rightSum) {
                return i;
            } else {
                leftSum = 0;
                rightSum = 0;
            }
        }
        return -1;
    }

    @Override
    public void run() {
        System.out.print("Ter");
    }
}
