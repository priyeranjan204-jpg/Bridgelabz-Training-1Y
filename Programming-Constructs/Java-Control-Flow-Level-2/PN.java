import java.util.Scanner;

public class PN {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number: ");
int n = sc.nextInt();
System.out.print("Enter power: ");
int p = sc.nextInt();
if(n <= 0 || p <= 0) {
System.out.println("Please enter positive integers only.");
}
else {
int r = 1;
for(int i = 1; i <= p; i++) {
r = r * n;
}
System.out.println("Result = " + r);
}
}
}
