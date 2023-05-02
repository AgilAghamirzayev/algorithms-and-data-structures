package pattern_sliding_window;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordsConcatenation {

    public static void main(String[] args) {
        System.out.println(findWorldConcatenation("catfoxcat", new String[]{"cat", "fox"}));
        System.out.println(findWorldConcatenation("catcatfoxfox", new String[]{"cat", "fox"}));
    }


    public static List<Integer> findWorldConcatenation(String str, String[] words) {
        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : words)
            wordToCount.put(word, wordToCount.getOrDefault(word, 0) + 1);

        ArrayList<Integer> resultIndices = new ArrayList<>();
        int wordCount = words.length;
        int wordLength = words[0].length();

        for (int i = 0; i < str.length() - wordCount * wordLength; i++) {
            HashMap<String, Integer> wordsSeen = new HashMap<>();

            for (int j = 0; j < wordCount; j++) {
                int nextWordLength = i + j * wordLength;
                String word = str.substring(nextWordLength, nextWordLength + wordLength);
                if (!wordToCount.containsKey(word)) break;

                wordsSeen.put(word, wordsSeen.getOrDefault(word, 0) + 1);

                if (wordsSeen.get(word) > wordToCount.getOrDefault(word, 0)) break;

                if (j + 1 == wordCount) resultIndices.add(i);
            }
        }

        return resultIndices;
    }


    // any size of words
    public static List<Integer> findWorldConcatenationV1(String str, String[] words) {
        ArrayList<Integer> resultIndices = new ArrayList<>();
        int lengthOfWords = 0;

        for (String word : words) {
            lengthOfWords += word.length();
        }

        if (lengthOfWords > str.length()) return resultIndices;

        OUTER:
        for (int windowEnd = lengthOfWords; windowEnd <= str.length(); windowEnd++) {
            int windowStart = windowEnd - lengthOfWords;
            String window = str.substring(windowStart, windowEnd);

            for (String word : words) {
                if (!window.contains(word)) continue OUTER;
            }

            resultIndices.add(windowStart);
        }

        return resultIndices;
    }
}
