package Tejas_sir_assignment;

import java.util.Arrays;

public class Array_add 
{
	public static void main(String[] args) 
	{
		int [] arr= {10,20,30,40,50,60};
		int [] abb= {10,20,30,40,50};
		int a=arr.length;
		int b=abb.length;
		int [] x=new int[a];
		
		for (int i = 0; i < x.length; i++) 
		{
			x[i]=(arr[i]+abb[i]);
		}
		System.out.println(Arrays.toString(x));
	}
}
