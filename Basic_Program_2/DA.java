import java.util.Scanner;

public class DA{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the University fee:");
int a = sc.nextInt();
System.out.println("Enter Discount Percent:");
double dp = sc.nextDouble();
double da = (a*dp)/100;
double d = a - da;
System.out.println("The Discounted amount: " + da);
System.out.println("The amount paid after discount: " + d);
}
}