package com.programs;

public class Min_Max 
{
	public void min()
	{
		int a[]= {100,2,3,400,5,6,10,15};
		int min = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min = a[i];
			}
		}
		System.out.println("The minimum value is "+min);
	}
	public void max()
	{
		int a[]= {98,45,10025,4,875,2};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		System.out.println("The maximum value is " +max);
	}
	public static void main(String[] args) 
	{
		Min_Max mm= new Min_Max();
		mm.min();
		mm.max();
	}
}
