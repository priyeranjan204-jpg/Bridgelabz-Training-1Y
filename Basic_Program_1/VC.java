import java.util.Scanner;

	public class VC {
	public static void main(String[] args){
	float pi = 3.14f;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter radius:");
	float r = input.nextFloat();
	System.out.println("Enter height:");
	float h = input.nextFloat();
	float V = pi * r * r * h;
	System.out.println("Volume of cylinder is: " + V);
}
}