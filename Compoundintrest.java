public class Interest{
  public static void main (String[]args){
System.out.println("Let's calculate Compound interest");
    double P=56789.987;
    float t=4.5f;
    double r=3.56;
    double CI=P*Math.pow((1+r/100),t)-P;
    System.out.println("Compund Interest is : "+CI);



}
}
