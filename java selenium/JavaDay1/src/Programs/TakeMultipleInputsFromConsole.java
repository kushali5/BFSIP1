package Programs;

import java.util.Scanner;

public class TakeMultipleInputsFromConsole {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		/*System.out.println("Enter first number: ");
		int num1=s.nextInt();
		
		System.out.println("Enter Second number: ");
		int num2=s.nextInt();
		
		System.out.println("Sum of 2 numbers:" +(num1+num2));
	*/
	
	System.out.println("Enter Name");
	String name=s.next();
	
	System.out.println("Enter Age");
	int age=s.nextInt();
	
	System.out.println("Enter unknown value");
	Object value=s.next();
	
	System.out.println(name+" "+age+" " +value);
	
	}

}
