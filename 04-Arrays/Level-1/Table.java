import java.util.*;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            arr[i - 1] = number * i;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + arr[i - 1]);
        }
    }
}
