package hashmap;

import java.util.HashMap;
import java.util.Map;

public class MinimumRounds {
    public int minimumRounds(int[] tasks) {

        int res = 0;
        Map<Integer, Integer> numToCount = new HashMap<>();

        for (int task : tasks) {
            numToCount.put(task, numToCount.getOrDefault(task, 0) + 1);
        }

        for (Integer value : numToCount.values()) {
            if (value < 2) return -1;
            res += compute(value);
        }
        return res;
    }

    private int compute(int i) {
        if (i % 3 == 0) return i / 3;
        if (i % 3 == 2) return (i - 2) / 3 + 1;
        return (i - 1) / 3 + 1;
    }
}
