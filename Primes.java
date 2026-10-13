import java.util.Scanner;
public class Primes{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number");
        int n=scan.nextInt();
        int factorcount=0;
        for(int i=1;i<=n;i++)
            {
                if(n%i==0){
                    factorcount++;
                }
            }

        if(factorcount==2)
        {
            System.out.println(n+"is prime");
            
        }else{
            System.out.println(n+"is not prime");
        }
        scan.close();
    }
}
