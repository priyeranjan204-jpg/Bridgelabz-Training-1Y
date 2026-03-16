import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Student " + i);

            System.out.print("Physics: ");
            int p = sc.nextInt();

            System.out.print("Chemistry: ");
            int c = sc.nextInt();

            System.out.print("Maths: ");
            int m = sc.nextInt();

            int total = p + c + m;
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            System.out.println("Total: " + total);
            System.out.println("Average: " + average);
            System.out.println("Percentage: " + percentage);
        }
    }
}