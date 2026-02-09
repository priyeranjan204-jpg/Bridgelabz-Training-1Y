import java.util.*;

public class MultVal {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double[] arr = new double[10];
	int index = 0;
	double sum = 0.0;
	while(true) {
	double a = sc.nextDouble();
	if(a <= 0) {
	break;
	}
    if(index == 10) {
		break;
	}	
	arr[index] = a;
	index++;
	}
	for(int i = 0;i < index;i++) {
	sum += arr[i];
	}
	System.out.println("Sum of Entered number is " + sum);
	}
}