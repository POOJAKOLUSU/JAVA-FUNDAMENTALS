
                    JAVA INCREMENT / DECREMENT 



--------------------------------------------------------------------------------
• Pre-Increment (++x)  : Modifies 'x' FIRST, then returns the NEW value.
                          Rule: "Change first, then use"

• Post-Increment (x++) : Returns the CURRENT value FIRST, then modifies 'x'.
                          Rule: "Use first, then change"

• Pre-Decrement (--x)  : Decrements 'x' FIRST, then returns the NEW value.
                          Rule: "Change first, then use"

• Post-Decrement (x--) : Returns the CURRENT value FIRST, then decrements 'x'.
                          Rule: "Use first, then change"


[2] WHY YOUR CODE ACTS THE SAME (SINGLE LINE STATEMENTS)
--------------------------------------------------------------------------------
When ++ or -- stands alone on its own line without any other action like 
assignment or printing, pre and post forms give the exact same end result.

--- Source Code ---
public class SingleLineDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        a++; // 'a' becomes 11
        ++b; // 'b' becomes 11

        System.out.println(a); // Prints 11
        System.out.println(b); // Prints 11
    }}



[3] DEMO CODE & OUTPUT (SPOTTING THE DIFFERENCE)
--------------------------------------------------------------------------------
To actually see the timing difference, evaluate the variable INSIDE an action 
like System.out.println().

--- Java Source Code ---
public class IncrementDemo {
    public static void main(String[] args) {
        int val = 5;

        // 1. Post-Increment (val++)
        // Output uses current value (5), THEN increments val to 6
        System.out.println("Post-increment output: " + (val++)); 
        System.out.println("Value after post-inc:  " + val);     

        System.out.println("------------------------------------");

        // 2. Pre-Increment (++val)
        // Increments val from 6 to 7 FIRST, THEN outputs current value (7)
        System.out.println("Pre-increment output:  " + (++val)); 
        System.out.println("Value after pre-inc:   " + val);     
    }}

--- Console Output ---
Post-increment output: 5
Value after post-inc:  6
------------------------------------
Pre-increment output:  7
Value after pre-inc:   7


[4] KEY TAKEAWAYS & BEST PRACTICES
--------------------------------------------------------------------------------
• On separate lines : x++ and ++x work identically (+1 / -1).
• Inside expressions: ++x updates BEFORE evaluation, x++ updates AFTER.
•  Always keep increment operations on their own line to keep code clear 
================================================================================
