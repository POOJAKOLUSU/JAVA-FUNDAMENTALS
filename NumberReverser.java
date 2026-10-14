import java.util.Scanner;

public class NumberReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer to reverse: ");
        int num = scanner.nextInt();
        
        int reversed = 0;
        int original = num; // Keep a copy for display purposes

        // Loop until the number becomes 0
        while (num != 0) {
            int digit = num % 10;           // Get the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            num /= 10;                      // Remove the last digit from the original number
        }

        System.out.println("Original Number: " + original);
        System.out.println("Reversed Number: " + reversed);
        
        scanner.close();
    }
}
