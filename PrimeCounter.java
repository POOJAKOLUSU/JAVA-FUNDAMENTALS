public class PrimeCounter {
    public static void main(String[] args) {
        int n = 7; // Change this to test different numbers
        int factorCount = 0;
        
        // Loop from 1 up to n and count the factors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factorCount++; // Found a number that divides evenly!
            }
        }
        
        // A prime number will have exactly 2 factors (1 and itself)
        if (factorCount == 2) {
            System.out.println(n + " is a Prime number.");
        } else {
            System.out.println(n + " is NOT a Prime number.");
        }
    }
}
