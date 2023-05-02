package strings;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DeleteColumnsMakeSorted {

    public static void main(String[] args) {

        System.out.println("1: " + Float.floatToIntBits(1f));
    }


    public int minDeletionSize(String[] strs) {
        int count = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j-1].charAt(i) > strs[j].charAt(i)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
