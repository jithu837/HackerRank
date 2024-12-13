import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the integer input
        int N = scanner.nextInt();
        // Loop to print the multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }
        scanner.close();
    }
}
