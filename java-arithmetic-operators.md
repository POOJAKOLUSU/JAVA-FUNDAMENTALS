``` java
public class Arithmetic{
    public static void main(String[]args){
        int a=30;
        int b=29;
        int c=61;
        int add=a+b+c;
        int sub=c-a;
        int mul=a*b*c;
        int div=c/a;
        int mod=a%b;
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
         System.out.println(div);
         System.out.println(mod);
    }
}
```
/**
 * ARITHMETIC OPERATORS IN JAVA
 * 
 * Arithmetic operators are binary operators used to perform standard 
 * mathematical operations on numeric primitive data types (byte, short, int, long, float, double).
 * 
 * OPERATOR PRECEDENCE & ASSOCIATIVITY:
 * - Multiplicative operators (*, /, %) have higher precedence than additive operators (+, -).
 * - Operators at the same precedence level evaluate from Left to Right (left-associative).
 * - Parentheses () can be used to explicitly override default precedence.
 */

// 1. ADDITION (+)
// Sums numerical operands together. 
// Note: When used with String objects, '+' acts as a concatenation operator instead.
//int add = a + b + c;

// 2. SUBTRACTION (-)
// Subtracts the right operand from the left operand to yield the difference.
//int sub = c - a;

// 3. MULTIPLICATION (*)
// Multiplies the operands to yield their product.
//int mul = a * b * c;

// 4. INTEGER DIVISION (/)
// Divides the left operand (numerator) by the right operand (denominator).
// IMPORTANT: In Java, dividing two integers performs "truncating division"—the fractional 
// decimal portion is discarded entirely, returning only the integer quotient (e.g., 61 / 30 = 2).
// WARNING: Dividing an integer by zero (x / 0) throws an ArithmeticException at runtime.
//int div = c / a;

// 5. MODULUS (%)
// Also known as the remainder operator.
// Calculates and returns the remaining integer after performing integer division (e.g., 30 % 29 = 1).
// Formula: a % b = a - (b * (a / b))
//int mod = a % b;
