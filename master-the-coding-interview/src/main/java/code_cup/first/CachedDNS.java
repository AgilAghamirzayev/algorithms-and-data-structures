package code_cup.first;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CachedDNS {

  public static void main(String[] args) {
    System.out.println(getMinTime(2, 2, 3, List.of("a", "b", "a", "b", "c")));
    System.out.println(getMinTime(1, 3, 7, List.of("a", "b", "c", "c", "d")));
  }


  public static List<Integer> getMinTime(int cache_size, int cache_time, int server_time,
      List<String> urls) {
    List<Integer> minTimes = new ArrayList<>();
    Map<String, Integer> cache = new LinkedHashMap<>(cache_size, 0.75f, true);

    for (String url : urls) {
      if (cache.containsKey(url)) {
        cache.remove(url);
        cache.put(url, cache_time);
        minTimes.add(cache_time);
      } else {
        if (cache.size() == cache_size) {
          cache.remove(cache.entrySet().iterator().next().getKey());
        }
        cache.put(url, server_time);
        minTimes.add(server_time);
      }
    }

    return minTimes;

  }

}
