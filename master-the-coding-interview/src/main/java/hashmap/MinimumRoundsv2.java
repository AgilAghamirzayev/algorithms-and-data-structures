package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumRoundsv2 {

    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        int res = 0;
        int count = 1;
        for(int i = 1; i < tasks.length; i++) {
            if(tasks[i-1] == tasks[i]) {
                count ++;
            } else {
                if(count < 2) return -1;
                res += compute(count);
                count = 1;
            }
        }
        return res+1;
    }

    private int compute(int i) {
        if (i % 3 == 0) return i / 3;
        if (i % 3 == 2) return (i - 2) / 3 + 1;
        return (i - 1) / 3 + 1;
    }
}
