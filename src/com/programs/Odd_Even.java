package com.programs;

import java.util.Scanner;

public class Odd_Even 
{
	public void even()
	{
		int sum=0,count = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value : ");
		int a = s.nextInt();
		for(int i=0;i<a;i++)
		{
			if(i%2==0)
			{
				System.out.print(i +",");
				sum=sum+i;
				count=count+1;
			}
		}
		System.out.println("\n sum of the nos is " +sum);
		System.out.println(" count of nos is "+count);
	}
	public void odd()
	{
		int sum=0,count = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value : ");
		int a = s.nextInt();
		for(int i=0;i<a;i++)
		{
			if(i%2==1)
			{
				System.out.print(i +",");
				sum=sum+i;
				count=count+1;
			}
		}
		System.out.println("\n sum of the nos is " +sum);
		System.out.println(" count of nos is "+count);
	}
	public static void main(String[] args) 
	{
		Odd_Even o = new Odd_Even();
		o.even();
		o.odd();
	}
}
