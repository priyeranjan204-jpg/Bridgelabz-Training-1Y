import java.util.Scanner;

public class ST {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter no of pen:");
int pen = sc.nextInt();
System.out.println("Enter no of students:");
int std = sc.nextInt();
double dist = pen / std;
int mod = pen % std;
System.out.println("Pen distributed amount is: " + dist);
System.out.println("Modulus of amount is: " + mod);
}
}