import java.util.Scanner;
public class KM {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Km:");
double km = sc.nextDouble();
double m = km * 0.621371;
System.out.println("Converted Km to miles: " + m);
}
}