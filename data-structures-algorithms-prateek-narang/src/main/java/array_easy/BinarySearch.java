package array_easy;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 8));
    }


    public static int binarySearch(int[] array, int key) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (array[mid] == key) return array[mid];

            if (array[mid] > key) end = mid - 1;
            else start = mid + 1;
        }

        return -1;
    }
}
