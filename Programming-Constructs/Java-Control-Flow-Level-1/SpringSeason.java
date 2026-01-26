import java.util.Scanner;

public class SpringSeason {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter month:");
int m = sc.nextInt();
System.out.println("Enter Date:");
int d = sc.nextInt();
if((m == 3 && d >= 20 && d <= 31) ||(m == 4 && d != 31) ||(m == 5 && d <= 31) || (m == 6 && d <= 20)) {
System.out.println("Is a Spring Season");
} 
else {
System.out.println("Is not a Spring Season");
}
}
}