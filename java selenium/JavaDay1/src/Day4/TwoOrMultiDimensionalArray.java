package Day4;

public class TwoOrMultiDimensionalArray {

	public static void main(String[] args) {
		
		//int a[][] = new int[4][4];
		int a[][] = {{10,20,30,40},{50,60,70,80},
				{20,30,40,50},/*{60,70,80,90}*/};
		
		//find size of an array
		System.out.println("length of rows" +a.length);
		System.out.println("length of columns" +a[0].length);
		//read single value from an array
		//System.out.println(a[1][1]);
		
		//normal for loop
		/*for(int r=0;r<=a.length-1;r++)
			{
			for(int c=0;c<=a[r].length-1;c++)
			{
				
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}*/
		
		//enhanced for loop
		for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.print(x + " ");
			}
		
		System.out.println();
		}
		

	}

}
