import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = input.nextInt();
		System.out.println("Enter second number: ");
		int b = input.nextInt();
		int Sum = a + b;
		System.out.println("Sum of Two number: " + Sum);
	}
}