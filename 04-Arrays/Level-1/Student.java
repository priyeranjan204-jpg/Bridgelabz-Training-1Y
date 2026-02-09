import java.util.*;

public class Student {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[10];
	for(int i = 0;i < 10;i++) {
	System.out.print("Enter age: ");
	int a = sc.nextInt();
	arr[i] = a;
	}
	for(int i = 0;i < 10;i++) {
		if(arr[i] >= 18) {
			System.out.println("Student can Vote");
		} else {
			System.out.println("Student can not Vote");
		}
		}	
	}
}
