package testcases.businessLogic;

public class Operations {
	
	public static int Add(int a,int b)
	{
		return a+b;
	}

	public static int getFactorial(int n)
	{
		int f=1;
		if(n<0)
			return -1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		return f;
	}
	
	public static boolean isPalindrome(String s)
	{
		return (s.equals(new StringBuffer(s).reverse().toString()));
	}
	
	public static boolean isPalindrome(int n)
	{
		int reversed=0;
		int x=n;
		while (n != 0) {
            reversed = reversed*10 + n%10;
            n=n/10;
        }
		return x==reversed;
	}
	
	public static boolean isPrime(int n)
	{
		if(n<=1)
			return false;
		for (int i = 2; i <= n/2; i++) {
            if (n % i == 0)
            {
            	return false;
            }
         }
		return true;
	}
	

}
