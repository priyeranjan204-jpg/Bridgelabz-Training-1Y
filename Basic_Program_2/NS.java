import java.util.Scanner;

public class NS{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter no of student:");
int n = sc.nextInt();
double TPH = (n * (n - 1));
System.out.println("Total possible Handshakes: " + TPH);
}
} 