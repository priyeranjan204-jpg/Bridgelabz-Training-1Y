import java.util.Scanner;

public class DivFive 
{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter number:");
int n = sc.nextInt();
if(n % 5 == 0) 
{
System.out.println("Number is Divisible by 5");
}
else {
System.out.println("Number is Not Divisible by 5");
}
}
}