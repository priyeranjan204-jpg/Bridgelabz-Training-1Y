import java.util.Scanner;

public class NatNum {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Natural Number:");
int n = sc.nextInt();
int sum = n * (n + 1) /2;
if(n > 0){
System.out.println(n + " Entered Number is Natural Number");
System.out.println("Sum of Entered Natural Number is " + sum);
}else {
System.out.println(n + " Entered Number is not a Natural Number");
}
}
}