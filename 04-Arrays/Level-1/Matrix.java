import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();
        int[][] mat = new int[rows][col];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int[] array = new int[rows * col];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                array[index] = mat[i][j];
                index++;
            }
        }
        System.out.println("Converted 1D array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
