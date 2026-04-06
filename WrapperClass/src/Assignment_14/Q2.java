package Assignment_13;
import java.util.Scanner;

public class Q2 {
    public void wapperToPrimitive() {
        Double num1 = 47.52;
        double num2 = 47.52;
        int num3 = (int) num2;
        System.out.println("Double:-" + num1);
        System.out.println("double:-" + num2);
        System.out.println("int typecast:-" + num3);
    }

    public static void main(String[] args) {
        Q2 q2 = new Q2();
        q2.wapperToPrimitive();
    }
}