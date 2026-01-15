import java.util.Scanner;

public class PS{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter perimeter of Square:");
int p = sc.nextInt();
double s = p / 4;
System.out.println("Side of Square is: " + s);
}
}