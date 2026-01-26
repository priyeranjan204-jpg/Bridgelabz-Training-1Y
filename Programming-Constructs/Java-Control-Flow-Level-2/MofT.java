import java.util.Scanner;

public class MofT{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Table from 6 to 9:");
int t = sc.nextInt();
for(int i = 1;i <= 10;i++) { 
System.out.println(t + "*" + i + "=" + (t*i));
}
}
}