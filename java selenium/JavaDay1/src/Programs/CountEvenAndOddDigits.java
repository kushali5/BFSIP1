package Programs;

import java.util.Scanner;

public class CountEvenAndOddDigits {

	public static void main(String[] args) {
		
		int num;
		int even_count = 0;
		int odd_count = 0;
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter Number: ");
		
		num = s.nextInt();
		
		while(num>0)  //23456   2345  234 23 2
		{
			int rem=num%10; //6 5 4 3 2
			if(rem%2==0)
			{
				even_count++; //1 2 3
				
			}
			else {
				odd_count++; //1 2
				
			}
		
		num = num/10;  //2345 234 23 2 0
		}
		
		System.out.println("Number of Even count: "+even_count);
		System.out.println("Number of odd count: "+odd_count);

	}

}
