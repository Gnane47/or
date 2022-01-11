package com.august28;

import java.util.Scanner;

public class Transport 
{
	public static void main(String[] args) 
	{
		System.out.println("\t \t Transport");
		Scanner s = new Scanner(System.in);
		System.out.println("1. Not urgent"); System.out.println("2. Urgent"); System.out.println("3. Urgent / Not Urgent");
		System.out.print("Enter the priority : ");
		String a = s.nextLine();
		switch(a)
		{
		case "1":
			System.out.print("specify the weight (in kg) : ");
			float weight = s.nextFloat();
			if(weight < 5)
			{
				System.out.println("can be despatched by post");
			}
			else
			{
				if(weight > 5)
				{
					System.out.print("specify the distance (in km) : ");
					float dis = s.nextFloat(); 
					if (dis<=250) 
					{
						System.out.println("\t By lorry");
					}
					else
					{
						System.out.println("\t Transportation cannot be done by using a lorry");
					}
				}
			}
		break;
		
		case "2":
			System.out.print("specify the distance (in km) : ");
			float dis = s.nextFloat(); 
			if(dis<=50)
			{
				System.out.print("Specify the weight (in kg) : ");
				float weigh = s.nextFloat();
				if(weigh < 100)
				{
					System.out.println("Transportation can be done by using a van");
				}
				else
				{
					System.out.println("cannot be done by using a van");
				}
			}
			else
			{
				System.out.println("Transportation cannot be done by using a van");
			}
		break;			
		
		case "3":
			System.out.print("specify the weight (in kg) : ");
			float wh = s.nextFloat();
			if(wh > 1000)
			{
				System.out.println("Transportation can be done by using a train");
			}
	
		}
			
	}
}
