package chars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCompression {

    public static void main(String[] args) {
        int aaavvvxxx = compress("aaavvvxxx");
        System.out.println(aaavvvxxx);
        System.out.println(compress("abbbbbbbbbbbb"));
    }

    public static int compress(String word) {
        char[] chars = word.toCharArray();
        int totalCount = 0;
        int count = 1;
        char first = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if(chars[i] == first) {
                count++;
            } else {
                totalCount = totalCount + 1 + String.valueOf(count).length();
                first = chars[i];
                count = 1;
            }
        }

        totalCount = totalCount + 1 + String.valueOf(count).length();

        return totalCount;
    }
}
