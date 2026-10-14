import java.util.Scanner;
public class Fibonacciinput{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in); System.out.println("enter the num to calculate fibonacci terms");
        int n=scan.nextInt();
        long first=0;
        long second=1;
        for(int i=1;i<=n;i++){
            System.out.println(first+" ");
            long next=first+second;

            first=second;
            second=next;
          scan.close();
        }
    }
}
