import java.util. Scanner;
public class User{
    public static void  main(String[]args ){
        Scanner scan = new Scanner(System.in);
        System.out.println("welcome to basic calculator");
        System.out.println("enter number 1 ");
        int num1=scan.nextInt();
        System.out.println("enter number 2 ");
        int num2=scan.nextInt();
        int addy=num1+num2;
        int subby=num1-num2;
        int multi=num1*num2;
        int divi=num1/num2;
        int rem=num1%num2;
        System.out.println("Addition of 2 no's is :"+ addy);
        System.out.println("Subtraction of 2 no's is :"+ subby);
        System.out.println("Product of 2 no's is :"+multi);
        System.out.println("Quotient of 2 no's is :"+divi);
        System.out.println("Remainder of 2 no's is :"+rem);


        
    }}
