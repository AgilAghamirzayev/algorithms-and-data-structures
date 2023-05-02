package array_easy;

public class FindNumbersEvenNumberDigits {

    public static void main(String[] args) {
        int numbers = findNumbers(new int[]{12, 345, 2, 6, 7896});
        System.out.println(numbers);
    }


    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (new StringBuilder().append(num).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
