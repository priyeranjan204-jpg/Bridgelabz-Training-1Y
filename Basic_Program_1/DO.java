import java.util.Scanner;

public class DO {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter first num:");
double a = sc.nextDouble();
System.out.println("Enter second num:");
double b = sc.nextDouble();
System.out.println("Enter third num:");
double c = sc.nextDouble();
double f = a+b*c;
double s = a*b+c;
double t = c+a/b;
System.out.println("Prescedence is: " + f);
System.out.println("Prescedence is: " + s);
System.out.println("Prescedence is: " + t);
}
}
