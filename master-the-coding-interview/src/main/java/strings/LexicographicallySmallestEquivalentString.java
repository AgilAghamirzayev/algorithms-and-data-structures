package strings;

import java.util.*;

public class LexicographicallySmallestEquivalentString {

    public static void main(String[] args) {
        LexicographicallySmallestEquivalentString l = new LexicographicallySmallestEquivalentString();
        System.out.println(l.smallestEquivalentString(
                    "cgokcgerolkgksgbhgmaaealacnsshofjinidiigbjerdnkolc",
                    "rjjlkbmnprkslilqmbnlasardrossiogrcboomrbcmgmglsrsj",
                "bxbwjlbdazfejdsaacsjgrlxqhiddwaeguxhqoupicyzfeupcn"));
    }
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        List<TreeSet<Character>> chars = new ArrayList<>();

        FIRST:
        for (int i = 0; i < s1.length(); i++) {
            char firstChar  = s1.charAt(i);
            char secondChar = s2.charAt(i);

            for (TreeSet<Character> aChar : chars) {
                if (aChar.contains(firstChar) || aChar.contains(secondChar)) {
                    aChar.add(firstChar);
                    aChar.add(secondChar);
                    continue FIRST;
                }
            }
            TreeSet<Character> characters = new TreeSet<>();
            characters.add(firstChar);
            characters.add(secondChar);
            chars.add(characters);
        }

        StringBuilder result = new StringBuilder();

        FIRST:
        for (int i = 0; i < baseStr.length(); i++) {
            for (TreeSet<Character> aChar : chars) {
                if (aChar.contains(baseStr.charAt(i))) {
                    result.append(aChar.first());
                    continue FIRST;
                }
            }
            result.append(baseStr.charAt(i));
        }

        return result.toString();
    }
}
