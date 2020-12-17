package ArrayOneDimensional;
import java.util.Scanner;
public class Exercise5 {

	public static void main(String[] args) {
		// The variable list1 and list2 are reference arrays that each have 5 elements. Write code that copies the values in list1 to list2. Values in list1 are input by user.
		Scanner sc = new Scanner(System.in);
		String[] names1 = new String[5];
		String[] names2 = new String[5];
		
		//list1
		System.out.print("Enter five name for NameList1: ");
		for (int i=0; i<names1.length; i++) {
			names1[i] = sc.next();
		}
		
		System.out.println("Namelist1: ");
		for (int i=0; i<names1.length; i++) {
			System.out.println(names1[i]);
		}
		
		System.out.println("Namelist2: ");
		for (int i=0; i<names1.length; i++) {
			names2[i] = names1[i];
			System.out.println(names2[i]);
		}
		sc.close();
	}
	
}
