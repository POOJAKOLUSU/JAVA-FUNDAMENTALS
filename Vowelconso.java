import java.util.Scanner;

public class Alphabets{
        public static void main(String[]args){
                Scanner scan =new Scanner(System.in);
                System.out.println("enter a letter");
                char ch=scan.next().charAt(0);
                if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u')
                        System.out.println("vowel");
                else
                        System.out.println("Consonant");
                        scan.close();
        }
}
