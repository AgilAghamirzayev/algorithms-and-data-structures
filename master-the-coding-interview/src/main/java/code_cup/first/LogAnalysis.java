package code_cup.first;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogAnalysis {

  public static void main(String[] args) {
    System.out.println(getStaleServerCount(
        6,
        List.of(
            List.of(3, 2), List.of(4, 3), List.of(2, 6), List.of(6, 3)
        ),
        List.of(3, 2, 6),
        2
    ));

    System.out.println(getStaleServerCount(
        3,
        List.of(
            List.of(1, 3), List.of(2, 6), List.of(1, 5)
        ),
        List.of(10,11),
        5
    ));
  }

  public static List<Integer> getStaleServerCount(int n, List<List<Integer>> log_data, List<Integer> query, int x) {
    List<Integer> result = new ArrayList<>();
    Map<Integer, List<Integer>> idAndTime = new HashMap<>();

    for (List<Integer> data : log_data) {
      if (idAndTime.containsKey(data.get(0))) {
        idAndTime.get(data.get(0)).add(data.get(1));
      } else {
        idAndTime.put(data.get(0), new ArrayList<>(){{add(data.get(1));}});
      }
    }

    for (Integer endTime : query) {
      int startTime = endTime - x;
      int count = 0;
      for (int i = 1; i <= n; i++) {
        if (!idAndTime.containsKey(i)) {
          count++;
          continue;
        }

        for (Integer time : idAndTime.get(i)) {
          if (time < startTime || time > endTime) {
            count++;
          }
        }
      }
      result.add(count);
    }

    return result;
  }

  public static List<Integer> findKthNextGreaterElement(List<Integer> prices, int k) {
    int n = prices.size();
    List<Integer> result = new ArrayList<>();

    Deque<Integer> stack = new ArrayDeque<>();

    for (int i = n - 1; i >= 0; i--) {
      while (!stack.isEmpty() && prices.get(stack.peek()) <= prices.get(i)) {
        stack.pop();
      }

      if (stack.size() >= k) {
        result.add(stack.peek() + 1);
      } else {
        result.add(-1);
      }

      stack.push(i);
    }

    return result;
  }

}
