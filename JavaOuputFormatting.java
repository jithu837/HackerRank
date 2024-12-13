import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String text = scanner.next();
            int number = scanner.nextInt();
            // Format the output: String left-justified in 15 spaces, int padded to 3 digits
            System.out.printf("%-15s%03d%n", text, number);
        }
        System.out.println("================================");

        scanner.close();
    }
}
