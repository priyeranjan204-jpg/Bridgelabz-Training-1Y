import java.util.Scanner;

public class HN {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int n = sc.nextInt();
int sum = 0;
int temp = n;
while(temp != 0) {
int digit = temp % 10;
sum = sum + digit;
temp = temp / 10;
}
if(n % sum == 0) {
System.out.println(n + " is a Harshad Number");
}
else {
System.out.println(n + " is not a Harshad Number");
}
}
}
