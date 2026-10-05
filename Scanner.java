import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Standard Primitives
        byte b      = scan.nextByte();      // Reads a byte
        short s     = scan.nextShort();     // Reads a short
        int i       = scan.nextInt();       // Reads an int
        long l      = scan.nextLong();      // Reads a long
        float f     = scan.nextFloat();     // Reads a float
        double d    = scan.nextDouble();    // Reads a double
        boolean bool = scan.nextBoolean();  // Reads boolean ("true" or "false")

        // Strings
        String word = scan.next();          // Reads next token (single word up to space)
        scan.nextLine();                    // Clears newline buffer if switching to nextLine
        String line = scan.nextLine();      // Reads the full line including spaces

        // Character (Special Case)
        char c      = scan.next().charAt(0); // Reads next word and picks the 1st character
    }
}
