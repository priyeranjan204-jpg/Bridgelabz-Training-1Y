import java.util.Scanner;

public class BMI{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double w=sc.nextDouble();
double hCm=sc.nextDouble();
double hM=hCm/100;
double bmi=w/(hM*hM);
System.out.println(bmi);
if(bmi<=18.4){
System.out.println("Underweight");
}
else if(bmi<=24.9){
System.out.println("Normal");
}
else if(bmi<=39.9){
System.out.println("Overweight");
}
else{
System.out.println("Obese");
}
}
}