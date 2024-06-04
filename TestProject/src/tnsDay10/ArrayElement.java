package tnsDay10;

import java.util.Scanner;

public class ArrayElement {
	
	public static void display(int []a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
	}
	public static void main(String []args)
	{
		int []a;
		
		//compile time error
		/*
		System.out.println(a[0]);*/
		
		int n;
		System.out.println("enter size of array: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=new int[n];
		display(a);
		a[0]=12;
		a[1]=23;
		a[2]=20;
		System.out.print("\n");
		display(a);
	}

}
