import java.util.Scanner;

public class PWhile {
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
int c = 0;
while(c < p) {
r = r * n;
c++;
}
System.out.println("Result = " + r);
}
}
}
