package strings;

public class PartitionString {

    public static void main(String[] args) {
        PartitionString s = new PartitionString();
        int i = s.minimumPartition("238182", 5);
        System.out.println(i);
    }

    public int minimumPartition(String s, int k) {
        int left = 0, right = 0, result = 0;

        while (right < s.length()) {
            while (right < s.length() && Long.parseLong(s.substring(left, right + 1)) <= k) {
                right++;
            }
            result++;
            if (right == left) return -1;
            left = right;
        }

        return result;
    }
}
