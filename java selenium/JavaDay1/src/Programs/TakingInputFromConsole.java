package Programs;

import java.util.Scanner;

public class TakingInputFromConsole {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	/*	System.out.println("Enter Number: ");
		int num=s.nextInt();
		System.out.println(num-1); */
		
		System.out.println("Enter Decimal Number: ");
		
		double num=s.nextDouble();
		
		System.out.println(num-1);
	}

}
