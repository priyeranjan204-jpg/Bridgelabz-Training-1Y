import java.util.Scanner;

public class CF {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the value of celcius: ");
  double c = input.nextDouble();
	double F = (c * 9/5) + 32;
	System.out.println("Converted to Fehrenheit: " + F);
  }
}
