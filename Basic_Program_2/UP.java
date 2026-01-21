import java.util.Scanner;

public class UP{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the unit price:");
double up = sc.nextDouble();
System.out.println("Enter the Quantity:");
int q = sc.nextInt();
double TP = up * q;
System.out.println("Total price is: " + TP);
}
}