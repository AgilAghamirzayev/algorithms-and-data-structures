package strings;

import java.util.*;
import java.util.stream.Collectors;

public class DetermineTwoStringsAreClose {

    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;

        if (!checkSame(word1, word2)) return false;

        List<Integer> word1CharsCounts = getCharsCounts(word1);
        List<Integer> word2CharsCounts = getCharsCounts(word2);

        for(int i = 0; i < word1CharsCounts.size(); i++) {
            if(!word1CharsCounts.get(i).equals(word2CharsCounts.get(i))) return false;
        }

        return true;
    }

    private boolean checkSame(String word1, String word2) {

        Set<Character> first = toSet(word1);
        Set<Character> second = toSet(word2);

        return first.containsAll(second);
    }

    private Set<Character> toSet(String word) {
        TreeSet<Character> chars = new TreeSet<>();
        for (char c: word.toCharArray()) {
            chars.add(c);
        }
        return chars;
    }

    private List<Integer> getCharsCounts(String word) {
        Map<Character, Integer> charToCount = new HashMap<>();

        for(char c: word.toCharArray()) {
            charToCount.put(c, charToCount.getOrDefault(c, 0) + 1);
        }

        return charToCount.values().stream().sorted().collect(Collectors.toList());
    }
}
