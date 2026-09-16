public class Maddy {
    public static void main(String[] args) {
        // 1. Variable Declaration and Initialization
        // Declaring integer variables and assigning values to them
        int num1 = 15;
        int num2 = 18;

        // 2. Direct Arithmetic Operations inside print statements
        // Performing addition directly inside println (result: 33)
        System.out.println(num1 + num2);

        // Performing subtraction directly inside println (result: 3)
        System.out.println(num2 - num1);

        // 3. Storing Operation Results in Variables
        // Calculating subtraction first and storing the result in a variable
        int result = num2 - num1;

        // Calculating addition first and storing the result in a variable
        int addition = num1 + num2;

        // 4. Printing Stored Variable Values
        // Printing the pre-calculated subtraction result (prints 3)
        System.out.println(result);

        // Printing the pre-calculated addition result (prints 33)
        System.out.println(addition);
    }
}
