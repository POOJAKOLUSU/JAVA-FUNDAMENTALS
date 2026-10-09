import java.util.Scanner;
public class Factorial{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number to calculate it's factorial");
        int n=scan.nextInt();
        
        int result=1;
        for(int i=1;i<=n;i++){
            result=result*i;
        }
      System.out.println("factorial is :"+result);
      scan.close();
    }
}
