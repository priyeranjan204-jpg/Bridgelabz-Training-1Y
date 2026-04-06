package Assignment_13;
import java.util.Scanner;

public class Q1 {
    public void primitiveToWrapper(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n1 = sc.nextInt();
        Integer n2 = n1;
        System.out.println("Primitive: "+n1);
        System.out.println("Wrapper: "+n2);
    }

    public static void main(String[] args) {
        Q1 q1 = new Q1();
        q1.primitiveToWrapper();
    }
}
