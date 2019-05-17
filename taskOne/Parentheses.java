package taskOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parentheses {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n >= 0) { //Consider that the entered value is greater than or equal to 0.
            System.out.println(parentheses(n));
            System.out.println(catalan(n));
        } else {
            System.out.println("Number is below zero.");
        }
    }

    static long parentheses(int n) { // Function to calculate Catalan's number.
        long[] array = new long[n + 1];// Creating array[i].
        array[0] = 1;
        for (int i = 1; i <= n; i++) { // Create outer round to calculate array[n].
            array[i] = 0;
            for (int j = 0; j < i; j++) { // Create inner round to calculate array[n].
                array[i] += array[j] * array[i - 1 - j]; // Calculate numbers of right parentheses and record this number to array[i].
            }
        }
        return array[n]; // Return number of right parentheses that recorded at array [n].
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
