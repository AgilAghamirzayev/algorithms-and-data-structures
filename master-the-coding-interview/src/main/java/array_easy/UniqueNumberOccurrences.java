package array_easy;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueNumberOccurrences {


    public boolean uniqueOccurrences(int[] arr) {
        Collection<Long> values = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(a -> a, Collectors.counting()))
                .values();

        return values.stream()
                .map(n -> Collections.frequency(values, n) <= 1)
                .filter(b -> !b)
                .findFirst()
                .orElse(true);
    }

    public boolean uniqueOccurrences1(int[] arr) {
        Map<Integer, Integer> numToOccurrences = new HashMap<>();
        Set<Integer> occurrences = new HashSet<>();

        for (int n : arr) {
            numToOccurrences.put(n, numToOccurrences.getOrDefault(n, 0) + 1);
        }

        for (int occurrence : numToOccurrences.keySet()) {
            if (occurrences.contains(occurrence)) return false;
            occurrences.add(occurrence);
        }

        return true;
    }
}
