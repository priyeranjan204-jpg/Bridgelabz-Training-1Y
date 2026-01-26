import java.util.Scanner;

public class GFWhile {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter an integer: ");
int n = sc.nextInt();
int G = 1;
int i = n - 1;
while (i >= 1) {
if (n % i == 0) {
G= i;
break;
}
i--;
}
System.out.println("Greatest factor of " + n + " besides itself is: " + G);
}
}
