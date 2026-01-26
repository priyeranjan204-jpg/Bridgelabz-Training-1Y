import java.util.Scanner;

public class LYT {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a year: ");
int y = sc.nextInt();
if(y < 1582) {
System.out.println("Leap Year program works only for year 1582 or later.");
}
else {
if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
System.out.println(y + " is a Leap Year");
}
else {
System.out.println(y + " is not a Leap Year");
}
}
}
}
