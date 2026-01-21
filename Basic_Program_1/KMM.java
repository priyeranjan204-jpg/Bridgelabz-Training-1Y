import java.util.Scanner;
public class KMM {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter KM:");
double km = sc.nextDouble();
double m = km * 1.6;
System.out.println("Kilometer to Miles: " + m);
}
}