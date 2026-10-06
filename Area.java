//Area Calculator: Calculate the area of a circle ( π r² ) and rectangle ( l × w ).
import java.util.Scanner;
public class Area{
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Let's calculate area of a Circle ");
        float pi=3.14f;
        System.out.println("enter the radius");
        int radius = scan.nextInt();
        float Circle_Area= pi*radius*radius;
        System.out.println("Area of the Circle is :"+ Circle_Area);
        System.out.println("-------------------------------------");
        System.out.println("Let's calculate area of the rectangle");
        System.out.println("enter the length of the rectangle");
        int length=scan.nextInt();
        System.out.println("enter the breadth of the rectangle");
        int breadth=scan.nextInt();
        int Area_rect=length*breadth;
        System.out.println("Area of rectangle is "+ Area_rect);
        scan.close();
    }}
