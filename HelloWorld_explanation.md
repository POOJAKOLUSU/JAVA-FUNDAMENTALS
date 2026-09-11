# 🚀 Java "Hello World" Breakdown

A simple, plain-English guide to understanding your first Java program.

---

## 📄 The Source Code

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}



## step by step explanation of this code:

1. public class Hello
Class: Think of a class as a name tag for your program. It tells Java where your code belongs.

File Name vs. Class Name: If your file is named Hello.java, your class name inside must also be Hello (Java is case-sensitive!). When you compile it, Java creates a file called Hello.class.

Public: Means this program is open and visible so Java can find it and run it.

2. public static void main(String[] args)
This whole line is called the main method signature. The main method is the entry point of the program. The JVM (Java Virtual Machine) searches for this exact line to start running your code. If this line isn't present, the program won't run.

public: Accessible by everyone, including Java itself.

static: Means Java can run this program directly without needing extra setup.

void: Means this program does its job and doesn't give back (return) any result or value when it finishes.

main: The exact name Java looks for to start execution.

String[] args: Short for "arguments". It allows you to pass extra text or words into your program from the outside (like from a command prompt) when you run it.

3. System.out.println("Hello World");
Printing to screen: This is the command used to print whatever is inside the double quotes "" to the screen.

println vs print:

println prints your text and moves the cursor to a new line.

print prints your text and keeps the cursor on the same line.

Semicolon ;: Every single statement in Java must end with a semicolon. It acts like a full stop (period) at the end of a sentence.

4. Curly Braces { } (Code Blocks)
The code inside { } is called a code block.

It groups statements together into logical units.

Curly braces are used for class definitions, main methods, loops, and conditions.

They help keep your code organized and clean using proper indentation.
