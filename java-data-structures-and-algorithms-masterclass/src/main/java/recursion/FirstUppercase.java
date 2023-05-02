package recursion;

public class FirstUppercase {

    public static void main(String[] args) {
        FirstUppercase fu =new FirstUppercase();
        System.out.println(fu.first("hdbvjhsbJ"));
    }
    public char first(String str) {
        String substring = str.substring(str.length()-1, str.length());
        if (substring.equals(substring.toUpperCase())) {
            return substring.charAt(0);
        }
        return first(str.substring(0,str.length()-1));
    }

}
