import java.util.Scanner;

public class SumUntilZeroFor{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double total = 0.0;
double n;
System.out.println("Enter the numbers:");
n = sc.nextDouble();
for(;;) {
System.out.println("Enter the number :");
n = sc.nextDouble();
if(n == 0) 
	break;
	total = total + n;
}
System.out.println("Sum of the Entered value " + total);
}
}