import java.util.Scanner;

public class FI{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the height in Cm:");
double cm = sc.nextDouble();
System.out.println("One foot equals in Inches:");
int f = sc.nextInt();
System.out.println("One inch equals in Cm:");
double i = sc.nextDouble();
double F = cm / (f * i);
double I = F * f;
System.out.println("Height in cm is: " + cm);
System.out.println("Height in Foot is: " + F);
System.out.println("Height in Inches is: " + I);
}
}