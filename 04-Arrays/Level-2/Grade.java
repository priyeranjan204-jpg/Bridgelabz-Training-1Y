import java.util.*;

public class Grade {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter number of students: ");
int n = sc.nextInt();

int[] phy = new int[n];
int[] chem = new int[n];
int[] math = new int[n];
double[] per = new double[n];
String[] grade = new String[n];

for(int i=0;i<n;i++){
System.out.println("Student "+(i+1));
phy[i] = sc.nextInt();
chem[i] = sc.nextInt();
math[i] = sc.nextInt();

per[i] = (phy[i] + chem[i] + math[i]) / 3.0;

if(per[i] >= 70) grade[i] = "A";
else if(per[i] >= 60) grade[i] = "B";
else if(per[i] >= 50) grade[i] = "C";
else if(per[i] >= 40) grade[i] = "D";
else if(per[i] >= 30) grade[i] = "E";
else grade[i] = "R";
}

System.out.println("Phy Chem Math Percentage Grade");
for(int i=0;i<n;i++){
System.out.printf("%d %d %d %.2f %s\n",phy[i],chem[i],math[i],per[i],grade[i]);
}
}
}
