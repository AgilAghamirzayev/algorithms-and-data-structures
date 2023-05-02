package array_easy;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomizedSet {

    private final Set<Integer> database;

    public RandomizedSet() {
        this.database = new HashSet<>();
    }

    public boolean insert(int val) {
        if (database.contains(val)) {
            return false;
        }

        database.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (database.contains(val)) {
            database.remove(val);
            return true;
        }
        return false;
    }

    public int getRandom() {
        int index = new Random().nextInt(database.size());
        return (int) database.toArray()[index];
    }
}
