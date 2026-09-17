public class Cast {
    public static void main(String[] args) {
        
        // 1. Implicit Conversion / Direct Assignment
        // The integer literal 125 fits within the byte range (-128 to 127).
        byte b = 125;
        System.out.println(b); // Outputs: 125

        // 2. Explicit Narrowing Conversion with Overflow
        int a = 256;
        // 256 exceeds the byte range (-128 to 127).
        // Casting performs a modulo operation: 256 % 256 = 0 (data loss occurs).
        byte k = (byte) a;
        System.out.println(k); // Outputs: 0

        // 3. Narrowing Conversion (Floating-point to Integer)
        float f = 7.66f;
        // Casting float to int truncates the decimal portion entirely.
        int h = (int) f;
        System.out.println(h); // Outputs: 7

        // 4. Narrowing Conversion (Within Range)
        int z = 123;
        // 123 is within the byte range (-128 to 127), so value is preserved without overflow.
        byte r = (byte) z;
        System.out.println(r); // Outputs: 123

        // 5. Widening Conversion (Float to Double)
        float e = 12.98f;
        // Converting smaller float precision to larger double precision (implicit or explicit).
        double p = (double) e;
        System.out.println(p); // Outputs: 12.979999542236328 (due to floating-point representation)

        // 6. Narrowing Conversion (Double to Float)
        double v = 123.9876;
        // Casting double to float reduces precision.
        float q = (float) v;
        System.out.println(q); // Outputs: 123.9876

        // 7. Automatic Type Promotion in Expressions
        byte m = 10;
        byte o = 30;
        
        // During arithmetic operations (like *), Java automatically promotes byte operands to int.
        // Therefore, byte result = m * o; causes a compile error without explicit casting.
        int result = m * o; 
        System.out.println(result); // Outputs: 300
    }
}
