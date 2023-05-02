package chars;

public class DigitsSpaces {

    public static void main(String[] args) {
       digitsAndSpaces("Hello 797   friend  ");
    }

    public static void digitsAndSpaces(String s) {

        int alpha = 0;
        int space = 0;
        int digit = 0;

        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            if (charAt >= '0' && charAt <= '9') digit++;
            else if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) alpha++;
            else if (charAt == ' ' || charAt == '\t') space++;
        }

        System.out.println(alpha);
        System.out.println(space);
        System.out.println(digit);
    }
}
