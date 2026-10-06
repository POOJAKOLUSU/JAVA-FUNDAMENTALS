public class Swap{
    public static void main(String[]args){
        System.out.println("swapping with the help of temp");
       int a= 5;
       int b=3;
      int temp=a;
       a=b;
        b=temp;
System.out.println(a);
        System.out.println(b);
        System.out.println("------------------------");
            System.out.println("Swapping with xor operation");
        int x=9;
        int y=3;
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println(x);
        System.out.println(y);
        System.out.println("------------------------");
        System.out.println("swapping without temp");
        int g=4;
        int f=7;
        g=g+f;
        f=g-f;
        g=g-f;
        System.out.println(g);
        System.out.println(f);
        
    }
    
}
