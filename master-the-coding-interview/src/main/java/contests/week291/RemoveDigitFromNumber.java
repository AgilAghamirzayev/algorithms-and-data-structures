package contests.week291;

public class RemoveDigitFromNumber {

    public static void main(String[] args) {
        System.out.println(removeDigit("123", '3'));
    }

    public static String removeDigit(String number, char digit) {
        int lastIndex = 0;

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                lastIndex = i;
                if (i == number.length() - 1 || number.charAt(i + 1) > number.charAt(i)) {
                    return number.substring(0, i).concat(number.substring(i + 1));
                }
            }
        }

        return number.substring(0, lastIndex).concat(number.substring(lastIndex + 1));
    }


}
