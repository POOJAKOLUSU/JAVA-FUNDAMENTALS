public class Reverse{
    public static void main(String[]args){
        int num=12345;
        int reversed=0;
        int original=num;
        while(num!=0){
            int digit=num%10;
            reversed=reversed * 10 + digit;
            num/=10;
        }
        System.out.println("original number is:"+original);
        System.out.println("reversed number is:"+reversed);
        
        
    }
}
