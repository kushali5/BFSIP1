package Programs;

import java.util.Arrays;

public class SortingStrings {

	public static void main(String[] args) {
	/*	String s[]= {"A","C","B"}; */
		String s[]= {"scott", "marry","john","David"};
		
		System.out.println("Before sorting: " +Arrays.toString(s));
Arrays.sort(s);

System.out.println("After sorting: " +Arrays.toString(s));
	}

}
