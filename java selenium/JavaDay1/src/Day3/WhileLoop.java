package Day3;

public class WhileLoop {

	public static void main(String[] args) {
		// Example 1 print 1 to 10
		
	/*	int i=0;       //initiallization
		while(i<=10)  //conditoon
		{
			System.out.println(i);
			i++;     //inc
		}  */
		
		
	/*	int i=10;
		while(i>=0) //conditions
		{
			System.out.println(i);
			i++; //dec
		}  */
		
     //Example 2: Print Hello 10 times
		
	/*	int i=1;
		while (i<=10)
		{
			System.out.println("Hello");
			i++;
		}  */
		
		//print even numbers from 1-10
		
	/*	int i=2;
		while(i<=20)
		{
			System.out.println(i);
			i+=2;
		} */
		
		//2nd approch
		
		int i=1;
		while(i<=20)
		{
			if(i%2==0)
			{
				System.out.println(i+ "even");
				
			}
			else {
				System.out.println(i+ "odd");
			}
		i++;
		}
		
		
	}

}
