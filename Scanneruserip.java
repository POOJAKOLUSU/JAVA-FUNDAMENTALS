import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the num");
        int num = scan.nextInt();

        System.out.println("enter your name");
        scan.nextLine(); // Clears trailing newline left by nextInt()
        String name = scan.nextLine();

        System.out.println("enter cgpa");
        float cgpa = scan.nextFloat();

        System.out.println("enter rollnum");
        int roll = scan.nextInt(); // Using int to avoid decimal values like 101.0

        System.out.println("enter grade");
        char grade = scan.next().charAt(0);

        System.out.println("the number entered by the user is : " + num);
        System.out.println("Name of the user is : " + name);
        System.out.println("cgpa of the user : " + cgpa);
        System.out.println("roll no of user : " + roll);
        System.out.println("grade of the user : " + grade);

        scan.close(); // Good habit to release resource stream
    }
}
