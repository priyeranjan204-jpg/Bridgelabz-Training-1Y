import java.util.*;

public class PNz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i = 0;i < 5;i++) {
			System.out.println("Enter Number: ");
			int a = sc.nextInt();
			arr[i] = a;
		}
		int len = arr.length;
		for(int i = 0;i < 5;i++) {
			if(arr[i] == 0) {
				System.out.println("Number is Zero");
			} else if(arr[i] > 0) {
				System.out.println("Number is Positive");
				if(arr[i] % 2 == 0){
				System.out.println("Number is Even");
				} else {
					System.out.println("Number is Odd");
				}
			} else {
				System.out.println("Number is Negative");
			} 
			
		}
		if(arr[0] == arr[len-1]) {
				System.out.println("first and last element are Equal");
			} else if (arr[0] < arr[len-1]) {
				System.out.println("First element is Smaller");
			} else {
				System.out.println("First element is Greater");
			}
	}
}