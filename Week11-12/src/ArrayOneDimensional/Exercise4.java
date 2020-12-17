package ArrayOneDimensional;
import java.util.Scanner;
public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Write a program that create an array of 10 elements size. Your program should prompt the users to 		input numbers in array. Display the sum of all array elements.
		
		int[] num = new int[10];
		
		System.out.println("Enter 10 numbers: ");
		for (int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		int sum=0;
		for (int i=0; i<num.length; i++) {
			System.out.print(num[i]);
			sum=sum+num[i];
		}
		
		for (int i=0; i<1; i++) {
			System.out.print("\n" +sum);
		}
		
		sc.close();
	}
}
