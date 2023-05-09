package code_cup.first;

import java.util.ArrayList;
import java.util.List;

public class PrefixHierarchy {

  public static void main(String[] args) {
    System.out.println(findCompletePrefixes(
        List.of("steve", "stevens", "danny", "steves", "dan", "john", "johnny", "joe", "alex",
            "alexander"),
        List.of("steve", "alex", "joe", "john", "dan")
    ));
  }

  public static List<Integer> findCompletePrefixes(List<String> names, List<String> query) {

    List<Integer> result = new ArrayList<>();

    for (String q : query) {
      int count = 0;
      for (String name : names) {
        if (q.length() >= name.length()) {
          continue;
        }

        for (int k = 0; k < name.length(); k++) {
          if (q.charAt(k) != name.charAt(k)) {
            break;
          }
          if (k == q.length() - 1) {
            count++;
            break;
          }
        }
      }
      result.add(count);

    }
    return result;

  }
}
