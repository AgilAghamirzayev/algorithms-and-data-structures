package math;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {



    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 1; j <= i; j++) {
                row.add(j);
            }
            result.add(row);
        }
        return  null;
    }
}
