package PRACTICE_COADING_Array;

public class Peak_Element {

	public static void main(String[] args) 
	{
		int array[]= {1,20,10,15,14};
		int no=array.length;
		System.out.println("Peak Element index is "+ FindPeak(array,no));
	}
	public static int FindPeak(int arr[],int no)
	{
		if(no==1)
		return arr[0];
		if(arr[0]>arr[1])
		return arr[0];
		if(arr[no-1]>=arr[no-2])
		{
			return arr[no-1];
		}
		for(int i=1;i<no-1;i++)
		{
			if(arr[i]>=arr[i-1]&&arr[i]>=arr[i+1])
			{
				return arr[i];
			}
		}
		return 0;
		
	}

}
