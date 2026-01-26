import java.util.Scanner;

public class RocketTwo {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Countdown:");
int c = sc.nextInt();
for(int i = c;i >= 1;i--){
System.out.println(i);
}
System.out.println("Rocket Launched");
}
}
