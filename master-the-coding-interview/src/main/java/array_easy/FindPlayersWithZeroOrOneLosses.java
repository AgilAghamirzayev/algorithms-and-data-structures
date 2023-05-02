package array_easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindPlayersWithZeroOrOneLosses {

    public static void main(String[] args) {
        int[][] test = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        List<List<Integer>> winners = findWinners(test);

        System.out.println(winners);
    }


    public static List<List<Integer>> findWinners(int[][] matches) {

        Set<Integer> winnersTests = new TreeSet<>();
        Set<Integer> losersTests = new TreeSet<>();
        Set<Integer> winners = new TreeSet<>();
        Set<Integer> losers = new TreeSet<>();

        for (int[] match : matches) {
            int winner = match[0];
            int looser = match[1];

            winners.remove(looser);
            losers.remove(looser);

            if (!winnersTests.contains(winner)) {
                winners.add(winner);
            }

            if (!losersTests.contains(looser)) {
                losers.add(looser);
            }

            winnersTests.add(looser);
            losersTests.add(looser);
        }

        return  List.of(new ArrayList<>(winners), new ArrayList<>(losers));
    }
}
