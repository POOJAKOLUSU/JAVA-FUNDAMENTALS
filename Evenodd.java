import java.util.Scanner;
public class Evenodd{
        public static void main(String[] args){
                Scanner scan=new Scanner(System.in);
                System.out.println("enter the number");
                int a=scan.nextInt();
                
               // int a= 9;
                if(a%2==0)
                        System.out.println(a +" is even");
                else
                        System.out.println(a+" is odd");
                scan.close();
        }
}
