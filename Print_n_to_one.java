import java.util.Scanner;
public class Print_n_to_one{
  public static void main(String[]args){
    System.out.println("enter a num");
    
    Scanner scan=new Scanner (System.in);    
    
    int n=scan.nextInt();
    
 
   for(int i=n;i>=1;i--)
     System.out.println(i);
    scan.close();
  }
}
