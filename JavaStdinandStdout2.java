import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read an integer
        int myInt = scanner.nextInt();
        // Read a double
        double myDouble = scanner.nextDouble();
        // Clear the newline left in the buffer
        scanner.nextLine();
        // Read a String
        String myString = scanner.nextLine();
        // Print the outputs in the required format
        System.out.println("String: " + myString);
        System.out.println("Double: " + myDouble);
        System.out.println("Int: " + myInt);
        // Close the scanner
        scanner.close();
    }
}
