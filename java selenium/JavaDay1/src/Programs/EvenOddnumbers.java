package Programs;

import java.util.Scanner;

public class EvenOddnumbers {

	public static void main(String[] args) {
		int num, limit;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number: ");
		
		limit = s.nextInt();
		for(num=1;num<=limit;num++)
		{
			if(num%2==0)
			{
				System.out.println(num+ "even");
				
			}
			else
			{
				System.out.println(num+ "odd");
			}
	
			
		}
	}

}
