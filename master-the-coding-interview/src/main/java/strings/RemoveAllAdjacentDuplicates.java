package strings;

public class RemoveAllAdjacentDuplicates {

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }

    public static String removeDuplicates(String s) {
        //abbaca


        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (result.length() > 0 && result.charAt(result.length() - 1) == s.charAt(i)) {
                result.deleteCharAt(result.length() - 1);
            } else {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}

