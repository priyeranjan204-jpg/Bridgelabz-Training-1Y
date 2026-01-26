import java.util.Scanner;

public class Pnz {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number:");
int n = sc.nextInt();
if(n > 0) {
System.out.println("Entered number is Posetive");
} else if(n == 0) {
System.out.println("Entered number is Zero");
} else {
System.out.println("Entered number is Negative");
}
}
}