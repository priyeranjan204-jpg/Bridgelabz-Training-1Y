import java.util.Scanner;

public class PR {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter lenghth:");
int l = sc.nextInt();
System.out.println("Enter breadth:");
int b = sc.nextInt();
int p = 2 * (l + b);
System.out.println("Perimeter of rectangle is: " + p);
}
}