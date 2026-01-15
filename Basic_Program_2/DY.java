import java.util.Scanner;

public class DY{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter distance in feet:");
double f = sc.nextDouble();
System.out.println("one miles equals in yard:");
double M =  sc.nextDouble();
System.out.println("one yard equals in feet:");
double Y = sc.nextDouble();
double DM = f / (M * Y);
double DY = f / Y;
System.out.println("Distance in Miles is: " + DM);
System.out.println("Distance in Yard is: " + DY);
}
}