package taskThree;


import java.math.BigInteger;

public class Sum {
    public static void main(String[] args) {
        System.out.println(getSumOfDigits(100));
    }

    private static long getSumOfDigits(int n) {
        BigInteger fact = BigInteger.valueOf(1); // Calculate factorial 100.
        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        long sum = 0; // Calculate sum of digits.
        while (fact.compareTo(BigInteger.ZERO) > 0) {
            sum += fact.mod(BigInteger.TEN).longValue();
            fact = fact.divide(BigInteger.TEN);
        }
        return sum;
    }
}
