import java.util.Scanner;
public class VE{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter value in km:");
double r = sc.nextDouble();
float pi = 3.14f;
double m = r * 1.6;
double V = (4.0/3.0)*pi*r*r*r;
double VM = (4.0/3.0)*pi*m*m*m;
System.out.println("Volume of earth in cubic Km: " + V);
System.out.println("Volume of in cublic miles: " + VM);
}
}