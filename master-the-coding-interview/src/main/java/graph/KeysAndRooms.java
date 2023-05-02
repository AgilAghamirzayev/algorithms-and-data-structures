package graph;

import java.util.*;

public class KeysAndRooms {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double v = scanner.nextDouble();

        System.out.println(v);
//        System.out.println(canVisitAllRooms(List.of(List.of(1), List.of(2), List.of(3), List.of())));
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < rooms.size(); i++) {
            for(int j = 0; j<rooms.get(i).size(); j++) {
                int key = rooms.get(i).get(j);
                if(key != i) {
                    map.put(key, map.getOrDefault(key, 1));
                }
            }
        }

        for(int a: map.values()) {
            if(a==0) return false;
        }
        return true;
    }
}
