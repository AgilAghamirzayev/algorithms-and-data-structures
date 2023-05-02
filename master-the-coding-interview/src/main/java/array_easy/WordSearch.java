package array_easy;

public class WordSearch {

    int[][] visited;

    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'D'},
                          {'S', 'F', 'C', 'S'},
                          {'A', 'D', 'E', 'E'}};

        System.out.println(exist(board, "ABCCED"));
    }

    public static boolean exist(char[][] board, String word) {
        return true;
    }
}
