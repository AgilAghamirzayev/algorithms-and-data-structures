package array_easy;

import java.util.Collections;
import java.util.List;

public class NonConstructiveChange {

  public int nonConstructiveChange(List<Integer> coins) {
    Collections.sort(coins);

    int currentChangeCreate  = 0;

    for (int coin : coins) {
      if (coin > currentChangeCreate + 1) {
        return currentChangeCreate + 1;
      }
      currentChangeCreate += coin;
    }

    return currentChangeCreate;
  }

}
