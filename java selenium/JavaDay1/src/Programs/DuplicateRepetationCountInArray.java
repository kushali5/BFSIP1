package Programs;

public class DuplicateRepetationCountInArray {

	public static void main(String[] args) {
		int a[]= {100,200,200,300,400,400};
		int num=200;
		
		int count =0;
		for(int value:a)
		{
			if(value==num)
			{
				count++;
			}
		}
			System.out.println(num+" " + count);
		}

	}


