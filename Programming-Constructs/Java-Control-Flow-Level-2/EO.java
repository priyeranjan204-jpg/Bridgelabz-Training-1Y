import java.util.Scanner;

public class EO{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Integer:");
int n = sc.nextInt();
if(n < 1) {
System.out.println("Enter valid natural number");
} else {
System.out.println("Entered Number is natural number");
}
for(int i = 1;i <= n;i++) {
if(i % 2 == 0) {
System.out.println(i + " Is a even number");
} else {
System.out.println(i + " Is a Odd number");
}
}
}
}