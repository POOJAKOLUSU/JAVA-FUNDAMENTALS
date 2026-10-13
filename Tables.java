import java.util.Scanner;
public class Tables{
  public static void main(String[]args){
    //int n=6;
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the num");
    
    int n=scan.nextInt();
    
    for(int i=1;i<=10;i++){
   int result=n*i;
      System.out.println(n+"x"+i+"="+result);
    scan.close();
    }
  }
}
