```java
public class Arithmetic{
    public static void main(String[]args){
        int num1=28;
        //num1=num1+2;
        num1+=2;
        System.out.println(num1);
    }
}
```
# Theory of Assignment and Operators in Java

## 1. What is an Assignment Operator?

In programming, an **assignment operator** evaluates the expression on its right-hand side and stores the resulting value into the variable on its left-hand side.
---
## 2. Standard vs. Compound Assignment

### Standard Assignment (`=`)
The basic assignment operator (`=`) evaluates an expression and stores it directly into a variable.

* **Example:** `num1 = num1 + 2;`
* **Mechanism:**
  1. Reads the current value of `num1` ($28$).
  2. Evaluates the expression $28 + 2$ to get $30$.
  3. Writes $30$ back into the memory location allocated for `num1`.

### Compound Assignment (`+=`, `-=`, `*=`, `/=`, `%=`)
Compound assignment operators combine a binary arithmetic operation with an assignment operation into a single step.

* **Example:** `num1 += 2;`
* **Mechanism:** Performed as a single atomic operation in Java bytecode (`iadd` followed by `istore`), avoiding the need to reference the variable name twice.

---

## 3. Key Theoretical Differences

### Syntactic Sugar & Redundancy
Compound assignment operators act as **syntactic sugar**—syntax designed to make code easier to read and write without changing how the program behaves logically.

### Implicit Type Casting (The Hidden Feature)
A crucial theoretical difference between `x = x + y` and `x += y` is **implicit type casting**.

* **Standard Addition:**
  
  byte b = 10;
  b = b + 2; // COMPILE ERROR: Cannot convert from int to byte

  Explanation: In Java, arithmetic operations on types smaller than int (like byte or short) automatically promote the operands to int. Thus, b + 2 results in an int, which cannot be directly assigned back to a byte without explicit casting: b = (byte)(b + 2).

Compound Addition:
byte b = 10;
b += 2; // COMPILES SUCCESSFULLY
