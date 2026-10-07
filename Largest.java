import java.util.Scanner;
public class Largest{
                public static void main(String[]args){
                             //   int a=9034;
                              //  int b=98;
                              //  int c=376;
                 Scanner scan=new Scanner(System.in);
                 System.out.println("enter value of a :");
                                int a= scan.nextInt();
                   System.out.println("enter value of b:");
                                int b= scan.nextInt();
               System.out.println("enter value of c:");
                                int c= scan.nextInt();
                                
                 if(a>=b &&  a>=c)
                  System.out.println("a is biggest");
                 else if(b>=a && b>=c)
                  System.out.println("b is biggest");
                  else
                System.out.println("c is biggest");
                               scan.close(); 
                }
}
