import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read integers from stdin
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            // Print each integer on a new line
            System.out.println(number);
        }

        // Close the scanner
        scanner.close();
    }
}
