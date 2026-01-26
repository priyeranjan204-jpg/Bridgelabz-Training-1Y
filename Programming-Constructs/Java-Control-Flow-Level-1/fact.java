import java.util.Scanner;

public class fact{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number:");
int n = sc.nextInt();
long fact = 1;
int i = 1; 
while(i <= n){
fact *= i;
i++;
}
System.out.println("Factorial of Number is " + fact);
}
}