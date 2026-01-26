import java.util.Scanner;

public class Nnum {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Natural Number:");
int n = sc.nextInt();
if(n <= 0){
System.out.println("Its not an Natural Number");	
}
else {
	int sum = 0;
for(int i = 1;i <= n;i++){
	sum += i;
}	
System.out.println("Sum of first " + n + " Natural number is " + sum);
}
}
}