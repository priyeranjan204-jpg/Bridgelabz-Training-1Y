import java.util.*;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        double[][] pd = new double[num][3];
        String[] ws = new String[num];

        for (int i = 0; i < num; i++) {
            double w = sc.nextDouble();
            double h = sc.nextDouble();
            if (w <= 0 || h <= 0) {
                i--;
                continue;
            }
            pd[i][0] = w;
            pd[i][1] = h;
            double bmi = w / (h * h);
            pd[i][2] = bmi;
            if (bmi < 18.5)
                ws[i] = "Underweight";
            else if (bmi < 25)
                ws[i] = "Normal";
            else if (bmi < 30)
                ws[i] = "Overweight";
            else
                ws[i] = "Obese";
        }
        for (int i = 0; i < num; i++) {
            System.out.println("Person " + (i + 1) +
                    " Weight=" + pd[i][0] +
                    " Height=" + pd[i][1] +
                    " BMI=" + pd[i][2] +
                    " Status=" + ws[i]);
        }
    }
}
