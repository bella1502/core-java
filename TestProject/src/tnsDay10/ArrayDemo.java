package tnsDay10;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		int A[], e;  //A is array and e is integer
		int[] B, f;  //both B & f are array
		int []C, g;  //C is array and g is integer
		
		arr=new int[5];
		
		//index loop
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		
		//for.....each loop
		for(int n:arr)
		{
			System.out.print(n+"\t");
		}
		System.out.println();
		
		
		//declaration with initialization
		int brr[]= {1,2,3,4,5};
		for(int n:brr)
		{
			System.out.print(n+"\t");
		}
	}

}
