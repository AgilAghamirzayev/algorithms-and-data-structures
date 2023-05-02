package strings;

public class DetermineStringHalvesAreAlike {
    public static void main(String[] args) {
        halvesAreAlike("u");
    }


    public static boolean halvesAreAlike(String s) {
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        char[] a = s.substring(0, s.length() / 2).toLowerCase().toCharArray();
        char[] b = s.substring(s.length() / 2).toLowerCase().toCharArray();
        int count = 0;

        for (char c : vowel) {
            for (int j = 0; j < a.length; j++) {
                if (c == a[j]) count++;
                if (c == b[j]) count--;
            }
        }

        return count == 0;
    }
}
