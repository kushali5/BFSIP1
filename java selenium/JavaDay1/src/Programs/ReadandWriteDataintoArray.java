package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class ReadandWriteDataintoArray {

	public static void main(String[] args) {
	int a[]=new int[5];
	
	Scanner s= new Scanner(System.in);
	
	for(int i=0;i<a.length;i++)
	{
		System.out.println("Enter a value for the position:" +i+":");
		
		a[i]=s.nextInt();
	}
	
System.out.println("print array elements:" +Arrays.toString(a));
	}

}
