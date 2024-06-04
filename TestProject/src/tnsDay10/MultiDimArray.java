package tnsDay10;

import java.util.Scanner;

public class MultiDimArray {
	
	public static void display(int [][]a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [][]a;
			
			System.out.print("enter no. of rows: ");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			
			System.out.print("enter no. of columns: ");
			int m=sc.nextInt();
			
			a=new int[n][m];
			System.out.println("Matrix a:");
			display(a);
			
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
				System.out.print("enter value of "+(i+1)+": ");
				a[i][j]=sc.nextInt();
				}
			}
			
			//Jagged Array
			int b[][]= {{1,2},{3,4,6,7,3},{2}};
			System.out.println("Matrix b:");
			display(b);
	}

}
//Jagged array------no of columns can be different for each row.
//a.length-------gives no. of rows.
//a[i].length------gives no.of columns in i row.