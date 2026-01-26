import java.util.Scanner;

public class Rocket {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Countdown:");
int c = sc.nextInt();
while(c >= 1) {
System.out.println(c);
c--;
}
System.out.println("Rocket Launched");
}
}
