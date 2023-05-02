package array_easy.exercises;

public class LargestElement {
    public static void main(String[] args) {

    }


    public static int largestElement(int[] arr) {
        int largest = Integer.MIN_VALUE;

        for (int j : arr) {
            largest = Math.max(j, largest);
        }

        return largest;
    }
}
