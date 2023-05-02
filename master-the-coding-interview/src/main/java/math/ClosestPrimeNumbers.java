package math;

import java.util.ArrayList;
import java.util.List;

public class ClosestPrimeNumbers {
    public int[] closestPrimes(int left, int right) {

        if(right - left <= 0) {
            return new int[]{-1,-1};
        }

        if(left <= 1) {
            return new int[]{2,3};
        }

        int[] result = {-1, -1};
        List<Integer> primes = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (isPrime(i)) primes.add(i);
        }

        if (primes.size() < 2) return result;

        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < primes.size()-1; i++) {
            int a = primes.get(i);
            int b = primes.get(i + 1);

            if (diff > b - a) {
                result[0] = a;
                result[1] = b;
                diff = b - a;
            }
        }

        return result;
    }

    public boolean isPrime(int num) {
        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}
