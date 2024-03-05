package Programs;

import java.util.Scanner;

public class NumberofDigits {

	public static void main(String[] args) 
	/*{
		//to count the digits for string and int
		String num;
		int totalDigits;
		 Scanner s =new Scanner(System.in);
		 
		 System.out.println("Enter Number: ");
		 
		 num = s.next();
		 
		 totalDigits = num.length();
		 
System.out.println("The number of digits in the given input is " +totalDigits);;
	}*/
	
	//using loop without string only integer
	{
		
		int num,totalDigits;
		Scanner s = new Scanner(System.in);
		
		System.out.println("ENter Number: ");
		num = s.nextInt();
		
		for(totalDigits=0; num!=0; num=num/10)
			
			totalDigits++;
		System.out.println("The toatal number of digits= " +totalDigits);
	}
	
	

}
