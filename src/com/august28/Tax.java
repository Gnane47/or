package com.august28;

import java.util.Scanner;

public class Tax 
{
	public static void main(String[] args) 
	{
		int tax,d,e;
		System.out.println("\t Tax calculation");
		Scanner s = new Scanner (System.in);
		System.out.print("Enter your salary : ");
		int sal = s.nextInt();
		System.out.print("Enter housing loan EMI :");
		int hl = s.nextInt();
		System.out.print("Enter education loan EMI : ");
		int el = s.nextInt();
		if(sal>1000000)
		{
			d=sal-hl-el;
			tax = (d*30)/100;
			e=d-tax;
			
		}
		else if(sal>500000)
		{
			d=sal-hl-el;
			tax = (d*20)/100;
			e=d-tax;
		}
		else
		{
			d=sal-hl-el;
			tax=(d*5)/100;
			e=d-tax;
		}
		System.out.println("Taxes are " +tax);
		System.out.println("salary after all deduction is " +e);
		
	}
}
