package array_easy.exercises;

public class LowerBound {

    public static void main(String[] args) {
        int i = lowerBound(new int[]{-1, -1, 2, 3, 5}, 4);
        System.out.println(i);
    }

    public static int lowerBound(int[] arr, int val) {
        int s = 0;
        int e = arr.length - 1; // 1,2,3,4,5
        int answer = -1;

        while (s <= e) {
            int mid = (s + e) / 2;

            if (arr[mid] > val) {
                e = arr[mid - 1];
            } else {
                answer = arr[mid];
                s = arr[mid + 1];
            }
        }

        return answer;
    }

}
