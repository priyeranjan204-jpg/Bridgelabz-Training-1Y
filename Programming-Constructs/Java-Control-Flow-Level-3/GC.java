import java.util.Scanner;

public class GC {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
double p=sc.nextDouble();
double c=sc.nextDouble();
double m=sc.nextDouble();
double per=(p+c+m)/300*100;
System.out.println(per);
if(per>=80) {
System.out.println("Grade A");
}
else if(per>=70) {
System.out.println("Grade B");
}
else if(per>=60){
System.out.println("Grade C");
}
else if(per>=50){
System.out.println("Grade D");
}
else if(per>=40){
System.out.println("Grade E");
}
else{
System.out.println("Grade R");
}
}
}