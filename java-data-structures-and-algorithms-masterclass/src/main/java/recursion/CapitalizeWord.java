package recursion;

public class CapitalizeWord {

    public String capitalizeWord(String str) {
        if (str.isEmpty()) return str;

        char chr = str.charAt(str.length() - 1);

        if (str.length() == 1) {
            return Character.toString(Character.toUpperCase(chr));
        }

        if ((str.charAt(str.length() - 2) == ' ')) {
            chr = Character.toUpperCase(chr);
        }
        return capitalizeWord(str.substring(0, str.length() - 1)) + chr;
    }

}
