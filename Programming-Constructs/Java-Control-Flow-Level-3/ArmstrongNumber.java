import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int n = sc.nextInt();
int sum = 0;
int ON = n;
while(ON != 0) {
int d = ON % 10;
sum = sum + (d * d * d);
ON = ON / 10;
}
if(sum == n) {
System.out.println(n + " is an Armstrong Number");
}
else {
System.out.println(n + " is not an Armstrong Number");
}
}
}
