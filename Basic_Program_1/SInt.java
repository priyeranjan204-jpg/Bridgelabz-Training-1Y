import java.util.Scanner;

public class SInt{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter p:");
float p = sc.nextFloat();
System.out.println("Enter r:");
float r = sc.nextFloat();
System.out.println("Enter t:");
float t = sc.nextFloat();
float SI = p * r * t;
System.out.println("Simple Intrest: " + SI);
}
}