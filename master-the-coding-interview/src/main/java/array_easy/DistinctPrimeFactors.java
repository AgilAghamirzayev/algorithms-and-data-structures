package array_easy;

import java.util.Set;
import java.util.TreeSet;

public class DistinctPrimeFactors {
    public static void main(String[] args) {
        DistinctPrimeFactors d = new DistinctPrimeFactors();
        int i = d.distinctPrimeFactors(new int[]{2, 4, 3, 7, 10, 6});
        System.out.println(i);
    }

    public int distinctPrimeFactors(int[] nums) {
        Set<Integer> primes = new TreeSet<>();

        for (int num : nums) {
            int j = 2;

            while (num > 1) {
                if (num % j == 0) {
                    primes.add(j);
                    num /= j;
                    continue;
                }
                j++;
            }
        }

        return primes.size();
    }
}
