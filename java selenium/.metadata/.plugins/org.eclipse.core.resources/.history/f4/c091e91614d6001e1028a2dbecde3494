package Programs;

import java.util.Arrays;

public class Bubblesort {

	
	public static void Bubblesort(int arr[])
	{
		
		boolean flag=false;
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length-1;j++)
			{
				if (arr[j]<arr[j-1]) {
					//swap
					int temp =arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					flag = true;
				}
			}
			if(!flag || flag==false) {
				break;
				
			}
		}
			
	}
	
	
	
	
	
	public static void main(String[] args) {
	int arr[] = {20,13,15,67,89,12};
	Bubblesort(arr);
	System.out.println(Arrays.toString(arr));

	}

}
