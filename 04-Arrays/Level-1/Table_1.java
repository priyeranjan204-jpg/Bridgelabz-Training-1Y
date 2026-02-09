import java.util.*;
public class Table_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		System.out.println("Enter the number:");
        int num = sc.nextInt();
		int a = 0;
        for (int i = 6; i <= 9; i++) {
            arr[a] = num * i;
			a++;
        }
		a = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + arr[a]);
			a++;
        }
	}
}