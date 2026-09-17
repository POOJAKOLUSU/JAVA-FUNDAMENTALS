public class Typo {
    public static void main(String[] args) {
        // Initialize character 'a' (ASCII 97)
        char c = 'a';
        
        // Increment character: 'a' (97) becomes 'b' (98)
        c++;
        
        // Implicit widening conversion: Java automatically converts 'char' to 'int'
        int ascii = c;
        
        // Explicit narrowing cast: Manually casts 'char' to 'int' (redundant here, but valid)
        int castascii = (int) c;
        
        // Prints the ASCII integer value: 98
        System.out.println(ascii);
        
        // Prints the updated character: 'b'
        System.out.println(c);
        
        // Prints the explicitly cast ASCII integer value: 98
        System.out.println(castascii);
    }
}
