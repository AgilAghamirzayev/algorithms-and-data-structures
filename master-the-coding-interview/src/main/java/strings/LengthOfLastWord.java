package strings;

public class LengthOfLastWord {
    public static void main(String[] args) {

    }

    public static int lengthOfLastWord(String s) {
        String[] result = s.trim().split(" ");
        return result[result.length - 1].length();
    }
}
