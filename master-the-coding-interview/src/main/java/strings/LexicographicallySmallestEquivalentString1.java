package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class LexicographicallySmallestEquivalentString1 {

    private int[] p;


    public static void main(String[] args) {
        LexicographicallySmallestEquivalentString1 l = new LexicographicallySmallestEquivalentString1();
        System.out.println(l.smallestEquivalentString(
                "hello",
                "world",
                "hold"));
    }

    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        p = new int[26];
        for (int i = 0; i < 26; ++i) {
            p[i] = i;
        }

        for (int i = 0; i < s1.length(); ++i) {
            int a = s1.charAt(i) - 'a';
            int b = s2.charAt(i) - 'a';
            int pa = find(a);
            int pb = find(b);

            if (pa < pb) {
                p[pb] = pa;
            } else {
                p[pa] = pb;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char a : baseStr.toCharArray()) {
            char b = (char) (find(a - 'a') + 'a');
            sb.append(b);
        }

        return sb.toString();
    }

    private int find(int x) {
        if (p[x] != x) {
            p[x] = find(p[x]);
        }

        return p[x];
    }
}
