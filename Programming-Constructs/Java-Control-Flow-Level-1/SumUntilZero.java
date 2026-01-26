import java.util.Scanner;

public class SumUntilZero{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double total = 0.0;
double n;
System.out.println("Enter the number:");
n = sc.nextDouble();
while(n != 0) {
total = total + n;
System.out.println("Enter the number :");
n = sc.nextDouble();
}
System.out.println("Sum of the Entered value " + total);
}
}