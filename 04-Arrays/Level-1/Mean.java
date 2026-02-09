import java.util.*;

public class Mean {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double[] h = new double[11];
	double sum = 0;
	for(int i = 0;i < 11;i++) {
	h[i] = sc.nextDouble();
	sum += h[i];
	}
	double m = sum / h.length;
	System.out.println("Mean of the height is " + m);
  }
}