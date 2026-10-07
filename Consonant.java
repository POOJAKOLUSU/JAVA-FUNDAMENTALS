import java .util.Scanner;
public class Vowels{
        public static void main(String[]args){
                        Scanner scan=new Scanner(System.in);
                        System.out.println("enter a letter");
                        char ch=scan.next().charAt(0);
           
                            switch(ch){
                                case 'a':
                                case 'e':
                                case 'i':
                                case 'o':
                                case 'u':
                          System.out.println("vowel");
                                                break;
                                default:
                          System.out.println("consonant");
                          scan.close();
                }
        }
}
