import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of queries
        int q = scanner.nextInt();

        // Process each query
        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int sum = a; // Start with a
            for (int j = 0; j < n; j++) {
                // Calculate the current term and add it to the sum
                sum += (int) Math.pow(2, j) * b;

                // Print the current term
                System.out.print(sum + " ");
            }
            System.out.println(); // Move to the next line after each query
        }

        scanner.close();
    }
}

