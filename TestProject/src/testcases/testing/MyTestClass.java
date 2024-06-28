package testcases.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import testcases.businessLogic.Operations;

public class MyTestClass {
	
	@Test
	public void testAddition()
	{
		System.out.println("additional Testing");
		int expected=7;
		int actual=Operations.Add(2,5);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testFactorial()
	{
		System.out.println("factorial Testing");
		int expected=120;
		int actual=Operations.getFactorial(5);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testFactorialforZero()
	{
		System.out.println("factorial Testing");
		int expected=1;
		int actual=Operations.getFactorial(0);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testFactorialforNegative()
	{
		System.out.println("factorial Testing");
		int expected=-1;
		int actual=Operations.getFactorial(-33);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testPalindromeForInt()
	{
		System.out.println("Number Palindrome Testing");
		boolean ans=Operations.isPalindrome(122252221);
		Assertions.assertTrue(ans);
	}
	
	@Test
	public void testNonPalindromeForInt()
	{
		System.out.println("Number Palindrome Testing");
		boolean ans=Operations.isPalindrome(1621);
		Assertions.assertFalse(ans);
	}
	
	@Test
	public void testPalindromeForString()
	{
		System.out.println("String Palindrome Testing");
		boolean ans=Operations.isPalindrome("mam");
		Assertions.assertTrue(ans);
	}
	
	@Test
	public void testNonPalindromeForString()
	{
		System.out.println("Non String Palindrome Testing");
		boolean ans=Operations.isPalindrome("man");
		Assertions.assertFalse(ans);
	}
	
	@Test
	public void testForPrime()
	{
		System.out.println("Prime Testing");
		boolean ans=Operations.isPrime(7);
		Assertions.assertTrue(ans);
	}
	@Test
	public void testForNonPrime()
	{
		System.out.println("Non-Prime Testing");
		boolean ans=Operations.isPrime(10);
		Assertions.assertFalse(ans);
	}
	
}
