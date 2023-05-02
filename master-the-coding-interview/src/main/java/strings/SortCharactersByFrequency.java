package strings;

import java.util.*;
import java.util.stream.Collectors;

public class SortCharactersByFrequency {
                                                                                                                                                                    
    public static void main(String[] args) {
        System.out.println(frequencySort("aavvv"));
        System.out.println(frequencySort("aAbb"));
    }


    public static String frequencySort(String s) {
        StringBuilder result = new StringBuilder();

        s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(charAndCount ->
                        result.append(charAndCount
                                .getKey()
                                .toString()
                                .repeat(charAndCount.getValue().intValue())));


        return result.toString();
    }

    public static String frequencySort1(String s) {
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> charToCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            charToCount.put(c, charToCount.getOrDefault(c, 0) + 1);
        }

        charToCount.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(charAndCount ->
                        result.append(charAndCount.getKey().toString().repeat(charAndCount.getValue())));


        return result.toString();
    }
}
