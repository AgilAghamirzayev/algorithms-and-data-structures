package code_cup.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MinimumTotalWeight {

  public static void main(String[] args) {
    ArrayList<Integer> objects = new ArrayList<>();
    objects.add(30);
    objects.add(20);
    objects.add(25);
//    System.out.println(findMinWeight(objects, 4));
//
//    System.out.println(findMinWeight(new ArrayList<>(){{add(2);}}, 1));
    System.out.println(findMinWeight(new ArrayList<>() {{
      add(2);
      add(3);
    }}, 1));
  }


  public static int findMinWeight(List<Integer> weights, int d) {

    for (int i = 0; i < d; i++) {
      Integer max = Collections.max(weights);
      weights.remove(max);
      weights.add(max - (max / 2));
    }

    return weights.stream().mapToInt(Integer::intValue).sum();

  }

}
