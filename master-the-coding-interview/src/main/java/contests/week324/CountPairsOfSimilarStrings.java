package contests.week324;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CountPairsOfSimilarStrings {

    public static void main(String[] args) {
        System.out.println(similarPairs(new String[]{"aba", "aabb", "abcd", "bac", "aabc"}));
        System.out.println(similarPairs(new String[]{"aabb","ab","ba"}));
    }

    public static int similarPairs(String[] words) {

        int count = 0;

        for (int index = 0; index < words.length - 1; index++) {
            for (int i = index + 1; i < words.length; i++) {
                String word1 = filteredWords(words[index]);
                String word2 = filteredWords(words[i]);

                if (word1.length() > word2.length()) {
                    if (word1.contentEquals(word2)) count++;
                } else {
                    if (word2.contentEquals(word1)) count++;
                }
            }
        }
        return count;
    }

    private static String filteredWords(String word) {
        Set<Character> characters = new TreeSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : word.toCharArray()) {
            characters.add(c);
        }
        characters.forEach(sb::append);

        return sb.toString();
    }
}
