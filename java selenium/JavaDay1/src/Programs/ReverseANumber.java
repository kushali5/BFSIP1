package Programs;

public class ReverseANumber {

	public static void main(String[] args) {
		//first method using while loop
	/*	int n=1234, rev=0, re;
		while(n!=0)
		{
			re =n%10;
			rev=rev*10+re;
			n=n/10;
			
		}
		System.out.println("The revese of the given numberis:" +rev);  */
		
		
		//Second method using for loop
		int n=1234, rev=0, re;
		for(;n!=0;n=n/10)
		{
			re=n%10;
			rev=rev*10+re;
		}
		System.out.println("The revese of the given numberis:" +rev);
	}

}
