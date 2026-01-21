import java.util.Scanner;

public class Sam{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter marks of maths:");
int maths = sc.nextInt();
System.out.println("Enter marks of physics:");
int phy = sc.nextInt();
System.out.println("Enter marks of chemestry:");
int che = sc.nextInt();
float avg = (maths + phy + che)/3;
System.out.println("Average is: " + avg);
}
}