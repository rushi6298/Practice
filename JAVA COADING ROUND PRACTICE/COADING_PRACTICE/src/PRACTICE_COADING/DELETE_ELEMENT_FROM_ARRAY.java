package PRACTICE_COADING;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DELETE_ELEMENT_FROM_ARRAY {

	public static void main(String[] args)
	{
		//System.out.println("hello is running");

		int [] originalArray= {10,12,14,52,69,74};
		int removeElemrnt = 14;
		int [] newarray=removeElement(originalArray,removeElemrnt);
		System.out.println("Origoinal array "+Arrays.toString(originalArray));
		System.out.println("New array "+Arrays.toString(newarray));
		
	}
	public static int [] removeElement(int [] arr,int element)
	{
		int [] newarray=new int[arr.length-1];
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=element)
			{
				newarray[index]=arr[i];
				index++;
			}
		}
		return newarray;
		
	}

}
