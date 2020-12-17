package ArrayOneDimensional;

public class Exercise2 {

	public static void main(String[] args) {
		
		//declare an array of alpha of 15 elements of type integer
		int[] alpha = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int[] beta = new int[20];
		String[] gamma = new String[2];
		
		//output the value of the element of the array alpha
		System.out.println(alpha[9]);
		
		//set the value of the fifth element of the array alpha to 35
		alpha[4] = 35;
		System.out.println(alpha[4]);
		
		//set the value of the ninth element of the array alpha to sum of sixth and thirteenth element of the alpha
		alpha[9] = alpha[6]+alpha[13];
		System.out.print("Sum of sixth and thirteenth element: " +alpha[9]);
		
		
	}

}
