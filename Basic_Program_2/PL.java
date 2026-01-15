import java.util.Scanner;

public class PL{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter CP:");
int cp = sc.nextInt();
System.out.println("Enter SP:");
int sp = sc.nextInt();
int profit = sp - cp;
float profit_per = profit*100/cp;
System.out.println("Profit is: " + profit);
System.out.println("Profit percentage is: " + profit_per);
}
}