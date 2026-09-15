# Java Essentials: Tools, Setup, Syntax & Execution Architecture

This guide covers the core fundamentals of Java development—from setting up your environment and writing your first program to understanding how Java code executes under the hood.

---

## 1. Development Tools: IDEs vs. Editors

To write, debug, and build Java applications, developers use **Integrated Development Environments (IDEs)** or **Code Editors**:

* **Popular Java IDEs:** Eclipse, IntelliJ IDEA, NetBeans, JDeveloper, DrJava.
* **Lightweight Editors:** VS Code, Notepad++.
* **Plain Text Requirement:** Source code must be saved as plain text (`.java`). Standard word processors (like Microsoft Word) insert hidden rich-text formatting that breaks the compilation process.

---

## 2. JDK Setup & Rapid Prototyping

To write and run Java applications, you need the **Java Development Kit (JDK)** installed on your machine.

* **Terminal Verification Commands:**
  * `java --version`: Verifies the Java Runtime Environment (JVM).
  * `javac --version`: Verifies the Java Compiler (`javac`).
* **Long-Term Support (LTS) Releases:** Enterprise-focused stable releases include Java 8, 11, 17, 21, and 25.
* **JShell (REPL):** Introduced in Java 9, JShell allows developers to run simple statements and evaluate math expressions directly in the terminal without writing a full class or `main` method.

---

## 3. Core Syntax & Conventions

* **File Naming & Case Sensitivity:**
  * Source code files must end with the `.java` extension.
  * Java is strictly **case-sensitive**.
  * If a class is declared `public`, the file name **must match the class name exactly** using `PascalCase` (e.g., `public class Hello` -> `Hello.java`).
* **Console Output:**
  * `System.out.println()`: Prints the text and moves the cursor to a new line.
  * `System.out.print()`: Prints the text and leaves the cursor on the same line.
* **Statement Termination:** Every statement must end with a semicolon `;`.

---

## 4. "Hello World" Implementation

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```
Program Entry Point: The JVM specifically searches for the exact signature public static void main(String[] args) to start program execution.

## 5. Compilation & Execution Lifecycle
Compile Source Code: Run javac Hello.java in your terminal. The javac compiler checks for syntax errors and translates your human-readable code into intermediate bytecode saved in a Hello.class file.

Execute Bytecode: Run java Hello. The Java Virtual Machine loads Hello.class and runs the application.

## 6. Architecture: JDK vs. JRE vs. JVM
Java follows a nested architecture to deliver its "Write Once, Run Anywhere" (WORA) capability:

JDK (Super-set): The complete software development kit containing debugging tools, the javac compiler, and the JRE.

JRE (Mid-layer): The runtime environment containing pre-compiled system libraries and the JVM runtime engine.

JVM (Core Engine):

Reads and validates the compiled .class bytecode.

Checks for the mandatory main method signature.

Translates intermediate bytecode into native machine code (0s and 1s) specific to the host operating system.

Key Concept: While the JVM itself is platform-dependent (built specifically for Windows, macOS, or Linux), it makes compiled Java bytecode platform-independent.
Translates intermediate bytecode into native machine code (0s and 1s) specific to the host operating system.
