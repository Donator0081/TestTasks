import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parentheses {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n <= 0) { //Consider that the entered value is greater than or equal to 0.
            System.out.println("Number is below zero. Please, input number above zero.");
            n = Integer.parseInt(reader.readLine());
            System.out.println(parentheses(n));
        } else {
            System.out.println(parentheses(n));
        }
    }

    public static long parentheses(int n) { // Recursive function to calculate the number n Catalan
        int[] array = new int[n + 1];// Create massive for array[i].
        array[0] = 1;
        for (int i = 1; i <= n; i++) { // Create outer round for calculate array[n].
            array[i] = 0;
            for (int j = 0; j < i; j++) { // Create inner round for calculate array[n].
                array[i] += array[j] * array[i - 1 - j]; // Calculate numbers of right parentheses and record this number to array[i].
            }
        }
        return array[n]; // Return number of right parentheses that recorded at array [n].
    }
}
