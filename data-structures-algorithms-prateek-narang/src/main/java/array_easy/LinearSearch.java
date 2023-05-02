package array_easy;

public class LinearSearch {
    public static void main(String[] args) {

    }


    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) return i;
        }
        return -1;
    }
}
