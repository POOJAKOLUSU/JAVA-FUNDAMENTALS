public class Leap{
        public static void main(String[] args){
               int year;
                year=2030;
                if(year%4==0 && year%100!=0 || year%400==0)
                        System.out.println("leap year");
                else
                System.out.println("non leap year");
        }
}
