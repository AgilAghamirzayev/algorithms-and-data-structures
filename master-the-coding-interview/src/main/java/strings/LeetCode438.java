package strings;

import java.util.*;
import java.util.stream.Collectors;

public class LeetCode438 {

    public static void main(String[] args) {
    }

    public static List<Integer> findAnagrams(String s, String p) {
        char[] charsP = p.toString().toCharArray();
        Arrays.sort(charsP);
        String newP = new String(charsP);
        StringBuilder windowStr = new StringBuilder();
        List<Integer> startIndexes = new ArrayList<>();
        int startWindow = 0;

        for (int endWindow = 0; endWindow < s.length(); endWindow++) {
            windowStr.append(s.charAt(endWindow));

            if (endWindow >= p.length() - 1) {
                char[] chars = windowStr.toString().toCharArray();
                Arrays.sort(chars);
                if (newP.equals(new String(chars))) startIndexes.add(startWindow);
                windowStr.deleteCharAt(0);
                startWindow++;
            }
        }
        return startIndexes;
    }
}
