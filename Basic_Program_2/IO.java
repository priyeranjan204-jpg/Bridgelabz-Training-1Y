import java.util.Scanner;

public class IO {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter first num:");
int a = sc.nextInt();
System.out.println("Enter second num:");
int b = sc.nextInt();
System.out.println("Enter third num:");
int c = sc.nextInt();
double f = a+b*c;
double s = a*b+c;
double t = c+a/b;
System.out.println("Prescedence is: " + f);
System.out.println("Prescedence is: " + s);
System.out.println("Prescedence is: " + t);
}
}
