import java.util.Scanner;

public class Aaa {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Age of Amar:");
int a1 = sc.nextInt();
System.out.println("Enter the Age of Akbar:");
int a2 = sc.nextInt();
System.out.println("Enter the Age of Anthony:");
int a3 = sc.nextInt();
System.out.println("Enter the Height of Amar:");
double h1 = sc.nextDouble();
System.out.println("Enter the Height of Akbar:");
double h2 = sc.nextDouble();
System.out.println("Enter the Height of Anthony:");
double h3 = sc.nextDouble();
if(a1 >= a2 && a2 >= a3 && h1 >= h2 && h2 >= h3) {
System.out.println("Amar" + "whose age is " + a1 + " whose height is " + h1 + " is the largest");
} 
else if(a2 >= a3 && h2 >= h3)
{
System.out.println("Akbar" + "whose age is " + a2 + " whose height is " + h2 + " is the largest");
}
else {
System.out.println("Anthony" + "whose age is " + a3 + " whose height is " + h3 + " is the largest");
}
}
}