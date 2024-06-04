package tnsDay10;

import java.util.Scanner;

public class SearchElement {
		// TODO Auto-generated method stub
		public static int search(int []a,int num)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==num)
				{
					return i;
				}
			}
			return -1;
		}
		public static void main(String []args)
		{
			int []a;
			System.out.println("enter size of array: ");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			a=new int[n];
			for(int i=0;i<a.length;i++)
			{
				System.out.print("enter value of "+(i+1)+": ");
				a[i]=sc.nextInt();
			}
			System.out.print("enter number you want to search: ");
			int num=sc.nextInt();
			if(search(a,num)==-1)
			{
				System.out.println("number is not present in array");
			}
			else
			{
				System.out.println("number is present at"+search(a,num)+" in array");
			}
			
		}
	}


