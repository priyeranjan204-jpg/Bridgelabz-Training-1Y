import java.util.Scanner;

public class Vote {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Age of the Person:");
int Age = sc.nextInt();
if(Age >= 18){
System.out.println("Person Can Vote");
} else {
System.out.println("Person Cannot Vote");
}
}
}