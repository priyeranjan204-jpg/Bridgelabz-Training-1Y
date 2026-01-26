import java.util.Scanner;

public class Bonus{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Salary:");
int s = sc.nextInt();
System.out.println("Enter Year of Service:");
int y = sc.nextInt();
double b = 0.05 * s;
if(y < 5) {
System.out.println("Not Eligible for bonus amount");
} else {
System.out.println(b + " is your bonus amount");
}
}
}