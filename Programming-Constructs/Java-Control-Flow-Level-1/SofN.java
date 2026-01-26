import java.util.Scanner;

public class SofN {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number:");
int n = sc.nextInt();
if(n < 0) {
System.out.println("Enter the value again");
}
else {
int sum = 0;
int i = 1;
while(i >= 0) {
	sum += i;
	i++;
}
System.out.println("Sum of " + n + " number is " + sum);
}
}
}