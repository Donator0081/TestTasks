package taskOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parentheses {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n >= 0) { //Consider that the entered value is greater than or equal to 0.
            System.out.println(catalan(n));
        } else {
            System.out.println("Number is below zero.");
        }
    }

    static long catalan(long n) { // Calculate catalan number with factorial.
        return ((factorial(2 * n)) / (factorial(n) * factorial(n + 1)));
    }

    static long factorial(long number) { // Calculate factorial number.
        long fac = 1;

        for (int i = 2; i <= number; i++) {
            fac *= i;
        }
        return fac;
    }
}
