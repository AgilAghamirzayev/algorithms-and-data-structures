package array_easy;

public class SumOfSubarrayMinimums {
    public static void main(String[] args) {
        int i = sumSubarrayMins(new int[]{3, 1, 2, 4});
        System.out.println(i);
    }


    public static int sumSubarrayMins(int[] arr) {
        int minSum = 0;

        for(int i = 0; i < arr.length; i++) {
            int[] subArray = new int[arr.length];
            for(int j = i; j < arr.length; j++) {
                subArray[j] = arr[j];
                minSum += findMinNum(subArray);
            }
        }

        return minSum;
    }

    public static int findMinNum(int[] arr) {
        int minNum = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                minNum = Math.min(minNum, arr[i]);
            }
        }

        return minNum;
    }
}
