package com.august28;

import java.util.Scanner;

public class Electricity 
{
	public static void main(String[] args) 
	{
		System.out.println("\t Electricity bill calculation");
		int amount=0;
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the consumed units : ");
		int unit = s.nextInt();
		if(unit>=1000)
		{
			amount = unit * 10;
		}
		else if(unit>=500)
		{
			amount = unit * 5;
		}
		else if(unit>=200)
		{
			amount = unit * 2;
		}
		else
		{
			amount = unit *1;
		}
		System.out.println("The bill amount is " +amount);
	}
}
