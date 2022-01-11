package com.programs;

import java.util.Scanner;

public class Recursion 
{
	int sum=0, j=0;
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the value : ");
		int n = s.nextInt();
		int a[] = new int [n];
		System.out.println("Enter the elements to add");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		Recursion obj = new Recursion();
		int x = obj.add(a,a.length,0);
		System.out.println("Sum: " +x);
	}
	public int add(int a[] , int n, int i) 
	{
		if(i<n)
		{
			return a[i] + add(a,n,++i);
		}
		else
		{
		return 0;
		}
	}
}
