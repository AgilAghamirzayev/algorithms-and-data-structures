package sorting.insertion;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>() {{
            add(2);
            add(4);
            add(6);
            add(8);
            add(3);
        }};


        insertionSort2(5, list);
    }

    public static void insertionSort2(int n, List<Integer> arr) {
        for (int i = n - 1; i > 0; i--) {
            if (arr.get(i) < arr.get(i - 1)) {
                int temp = arr.get(i);
                arr.set(i, arr.get(i - 1));
                print(arr);
                arr.set(i - 1, temp);
            }
        }
        print(arr);
    }

    public static void print(List<Integer> arr) {
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
