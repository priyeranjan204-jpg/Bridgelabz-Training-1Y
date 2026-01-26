import java.util.Scanner;

public class GF {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter an integer: ");
int n = sc.nextInt();
int G = 1;
for (int i = n - 1; i >= 1; i--) {
if (n % i == 0) {
G = i;
break;
}
}
System.out.println("Greatest factor of " + n + " besides itself is: " + G);
}
}
