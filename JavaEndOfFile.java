import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1;

        // Read lines until EOF
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            // Print the line number and content
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }

        scanner.close();
    }
}
