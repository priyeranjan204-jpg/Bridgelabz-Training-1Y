import java.util.Scanner;

public class Harry{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter birthYear:");
int birthYear = sc.nextInt();
System.out.println("Enter currentYear:");
int currentYear = sc.nextInt();
int age = currentYear - birthYear;
System.out.println("Current age of harry is: " + age);
}
}