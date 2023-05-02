package strings;

public class ReverseWords {

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }

    public static String reverseWords(String s) {

        StringBuilder reverseSentence = new StringBuilder();
        String[] words = s.split(" ");


        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].length() > 0) {
                reverseSentence.append(words[i]);
                reverseSentence.append(" ");
            }
        }

        reverseSentence.deleteCharAt(reverseSentence.length() - 1);

        return reverseSentence.toString();
    }
}
