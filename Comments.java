/**
 * JavaDoc Comment: Used for high-level documentation of classes and methods.
 * Tools like 'javadoc' use this to generate HTML documentation.
 * 
 * @author Student
 * @version 1.0
 */
public class CommentsDemo {

    /*
     * Multi-line Comment:
     * Used when an explanation spans
     * across multiple lines of code.
     */
    public static void main(String[] args) {
        
        // Single-line Comment: Explains a single line or variable below
        int score = 100; // Store user score
        
        System.out.println("Score: " + score);
    }

    /**
     * JavaDoc for a method explaining its input and return value.
     * 
     * @param a First number
     * @param b Second number
     * @return Sum of a and b
     */
    public static int add(int a, int b) {
        return a + b;
    }
}
