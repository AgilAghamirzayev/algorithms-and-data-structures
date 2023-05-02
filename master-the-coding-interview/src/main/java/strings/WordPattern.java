package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordPattern {

//    public static void main(String[] args) {
//        wordPattern("abba", "dog cat cat dog");
//    }

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char key = pattern.charAt(i);
            String word = words[i];

            if (charToWord.containsKey(key)) {
                if (!charToWord.get(key).equals(word)) return false;
            }

            if (wordToChar.containsKey(word)) {
                if (!wordToChar.get(word).equals(key)) return false;
            }

            charToWord.put(key, word);
            wordToChar.put(word, key);
        }

        return true;
    }
}
