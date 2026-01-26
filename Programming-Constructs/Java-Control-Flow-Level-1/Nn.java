import java.util.Scanner;

public class Nn {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Natural Number:");
int n = sc.nextInt();
if(n <= 0){
System.out.println("Its not an Natural Number");
} else {
	int sum = 0;
	int i = 1;
	while(i <= n) {
		sum += i;
		i++;
	}
	System.out.println("Sum of first " + n + " Natural number is " + sum);
}
}
}