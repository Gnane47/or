package com.programs;

import java.util.Scanner;

public class Sorting 
{
	public void ascending()
	{
		int temp, a[] = {98,45,10,4,101};
		for(int i=0;i<a.length;i++)
			{
			System.out.print(" " +a[i]);
			}
		System.out.println("\n \t Ascending Order");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int j=0; j<a.length;j++)
		{
		System.out.print(" " +a[j]);
		}
	}
	public void descending()
	{
		System.out.println("\n \t descending Order");
		int temp, a[] = {98,45,10,4,101};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		for(int i=0; i<a.length;i++)
		{
		System.out.print(" " +a[i]);
		}
	}
	public static void main(String[] args) 
	{
		Sorting s = new Sorting();
		s.ascending();
		s.descending();
	}
}
