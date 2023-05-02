package recursion;

import java.util.Arrays;

public class SomeRecursive {
    public boolean someRecursive(int[] arr, OddFunction odd) {
        if (arr.length == 0) return false;
        if(odd.run(arr[0])) return true;
        someRecursive(Arrays.copyOf(arr, arr.length-1), odd);
        return false;
    }
}

class OddFunction {
    boolean run(int num) {
        return num % 2 != 0;
    }
}