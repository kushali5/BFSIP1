package Day4;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		//1.declaring array
		//approach 1
	/*	int a[]=new int[5];
		 
		
		//add values into array or assign the value
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500; */
		
		//approach 2
		int a[]= {100,200,300,400,500};
		
		
		//find length of an array
		System.out.println("Lenght of an array" +a.length);
		
		//read single value from array
		//System.out.println(a[4]);
		
		//reading all the values from array
		//Normal for loop
/*		for(int i=0;i<a.length;i++) { 
			System.out.println(a[i]);
		}
		*/
		//enhanced for loop/for eachloop arrays and collections
		for(int x:a)
		{
			System.out.println(x);
		}
	}

}
