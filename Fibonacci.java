public class Fibonacci{
    public static void main(String[]args){
        int n=23;
        long first=0;
        long second=1;
System.out.println("Fibonacci Series up to " + n+" terms:");

        for(int i=1;i<=n;i++){
            System.out.println(first+" ");
            
            long next=first + second;
        
        first=second;
        second=next;
    }
}
}
