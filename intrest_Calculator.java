import java.util.Scanner;
public class Intrest{
        public static void main(String args[]){
                Scanner scan=new Scanner(System.in);
                System.out.println("WELCOME TO INTREST CALCULATOR");
                System.out.println("------------------------------");
                System.out.println("Enter the principle amount");
                double p=scan.nextDouble();
                System.out.println("enter the rate of intrest");
                double r=scan.nextDouble();
                System.out.println("enter the time period");
                float t=scan.nextFloat();
                double Si=(p*t*r)/100;
                System.out.println("SI is :" + Si);
                double Ci =p*Math.pow(1+(r/100), t)-p;
                System.out.println("CI is :"+Ci);
                scan.close();
        }
}
