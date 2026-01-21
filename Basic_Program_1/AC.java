import java.util.Scanner;

public class AC {
	public static void main(String[] args) {
		double pi = 3.14;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius: ");
		double r = input.nextDouble();
		double AC = pi * r * r;
		System.out.println("Area of circle is: " + AC);
	}
}