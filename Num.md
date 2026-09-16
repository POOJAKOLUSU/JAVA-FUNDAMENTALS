# Java Output Methods: Complete Guide to `print()` vs. `println()`

In Java, displaying output on the console is done using the `System.out` stream. The primary distinction between `print()` and `println()` lies in how they manage the console cursor after outputting data.

---

## 1. Overview of Output Methods

* **`System.out.print()`**: Prints the specified data to the console and **keeps the cursor on the same line**, immediately following the printed output.
* **`System.out.println()`**: Prints the specified data to the console and **appends a newline character**, moving the cursor to the beginning of the next line.
* **`System.out.println()` (Empty)**: Prints no text, serving purely to move the cursor to a new line.

---

## 2. Practical Code Example

```java
public class Num {
    public static void main(String[] args) {
        System.out.print(3 + 5);      // Line 1: Outputs 8, cursor remains on Line 1
        System.out.print(8 + 6);      // Line 1: Outputs 14 directly after 8
        System.out.println("");       // Line 1 -> Line 2: Moves cursor to Line 2
        System.out.println(6 + 7);    // Line 2: Outputs 13 on Line 2
    }
}
```

### 3. Step-by-Step Execution Breakdown

#### Console Output:
```
814
13
```
#### Detailed Execution Flow:

1. **`System.out.print(3 + 5)`**:
   * Evaluates the arithmetic expression: 3 + 5 = 8.
   * Prints `8` to the console.
   * **Cursor Position:** Immediately after `8` on Line 1.

2. **`System.out.print(8 + 6)`**:
   * Evaluates the arithmetic expression: 8 + 6 = 14.
   * Prints `14` directly where the cursor was left.
   * **Result so far:** `814` on Line 1.
   * **Cursor Position:** Immediately after `14` on Line 1.

3. **`System.out.println("")`**:
   * Outputs an empty string and executes a line feed / newline action.
   * **Cursor Position:** Moves down to the start of Line 2.

4. **`System.out.println(6 + 7)`**:
   * Evaluates the arithmetic expression: 6 + 7 = 13.
   * Prints `13` on Line 2.
   * **Cursor Position:** Moves to the start of Line 3 for subsequent statements.

---

### 4. Summary Comparison Table

| Method | Syntax | Behavior | Cursor Position After Execution |
| :--- | :--- | :--- | :--- |
| **`print()`** | `System.out.print(data)` | Prints `data` | Stays on the same line, immediately after the printed content |
| **`println()`** | `System.out.println(data)` | Prints `data` + newline | Moves to the start of the next line |
| **`println()` (Empty)** | `System.out.println()` | Prints newline only | Moves to the start of the next line |
