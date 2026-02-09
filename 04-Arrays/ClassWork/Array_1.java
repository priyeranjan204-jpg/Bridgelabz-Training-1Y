import java.util.Arrays;

public class Array_1 {
	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0] = 99;
		arr[1] = 67;
		arr[2] = 108;
		arr[3] = 45;
		arr[4] = 70;
		System.out.println("Printing arr with to String:-");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Length of Arrays:-");
		System.out.println(arr.length);
		
		System.out.println("Print an array using for loop:-");
		for(int i = 0;i < arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Print an array using for each loop:-");
		for(int i : arr){
			System.out.println(i);
		}
		System.out.println("Reverse of an array");
		for(int i = arr.length-1;i >= 0;i--){
			System.out.println(arr[i]);
		}
		
		int a = arr[4];
		System.out.println("khgdfs :-" + a);
		int target = 108;
		System.out.println("Linear Search:-");
		for(int i = 0;i <  arr.length;i++) {
			if(arr[i] == target) {
				System.out.println(i);
			} else {
				System.out.println("Not Found");
			}
		}
		System.out.println("Max value in an array:");
		
		int max = arr[0];
		
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println(max);
 }	
}