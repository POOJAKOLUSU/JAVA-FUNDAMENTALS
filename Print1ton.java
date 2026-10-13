import java.util.Scanner;
public class Printing{
  public static void main(String[]args){
    System.out.println("enter a num");
    
    Scanner scan=new Scanner (System.in);    
    
    int n=scan.nextInt();
    //System.out.println("______________");
 
   for(int i=1;i<=n;i++)
     System.out.println(i);
    scan.close();
  }
}
