package Programs;

import java.util.Arrays;

public class SortingElementsinArray {

	public static void main(String[] args) {
		int a[]= {100,600,200,400,500,300};
		System.out.println("Before sorting: " +Arrays.toString(a));  // Arrays.tostring(a) is used to print [100,600,200,400,500,300]
		
		
	Arrays.sort(a);  //sorts elements in the array
	System.out.println("After sorting: " +Arrays.toString(a));
	
	}

}
