import java.util.Scanner;

public class AI{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter base in cm:");
int b = sc.nextInt();
System.out.println("Enter height in cm:");
int h = sc.nextInt();
double i = 2.54;
double A = (1.0/2.0) * b * h;
double AI = A / (i * i);
System.out.println("Area of Triangle in Cm is: " + A);
System.out.println("Area of Triangle in Inches is: " + AI);
}
}