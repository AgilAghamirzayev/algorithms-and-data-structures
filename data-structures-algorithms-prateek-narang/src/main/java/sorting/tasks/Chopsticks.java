package sorting.tasks;

import java.util.Arrays;

public class Chopsticks {

    public int pairSticks(int[] length, int d) {
        Arrays.sort(length);
        int res = 0;

        for (int i = 0; i < length.length - 1; i++) {
            if (length[i + 1] - length[i] <= d) {
                res++;
                i++;
            }
            ;
        }

        return res;
    }
}
