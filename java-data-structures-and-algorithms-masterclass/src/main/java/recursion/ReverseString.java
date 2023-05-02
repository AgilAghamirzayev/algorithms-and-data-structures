package recursion;

public class ReverseString {


    public static void main(String[] args) {
        ReverseString string = new ReverseString();
        System.out.println(string.reverse("aqil"));
    }

    public String reverse(String str) {
        if (str.isEmpty()) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
