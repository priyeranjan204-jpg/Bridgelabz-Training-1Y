import java.util.Scanner;

public class C{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter first no:");
double a = sc.nextDouble();
System.out.println("Enter second no:");
double b = sc.nextDouble();
double add = a + b;
double sub = a - b;
double mult = a * b;
double div = a / b;
System.out.println("Addition of two number is: " + add);
System.out.println("Subtraction of two number is: " + sub);
System.out.println("Multiplication of two number is: " + mult);
System.out.println("Division of two number is: " + div);
}
}