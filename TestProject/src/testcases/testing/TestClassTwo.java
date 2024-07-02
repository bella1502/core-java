package testcases.testing;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import testcases.businessLogic.Operations;

public class TestClassTwo {
	
	@TestFactory
	public DynamicTest testMethod()
	{
		return DynamicTest.dynamicTest("First Dynamic Test", ()->{Assertions.assertTrue(Operations.isPalindrome(121));});
	}
	
	@TestFactory
	public List<DynamicTest> testMethodTwo()
	{
		List<DynamicTest> tests=new ArrayList<DynamicTest>();
		tests.add(DynamicTest.dynamicTest("TestForFactorial", ()->{Assertions.assertEquals(24, Operations.getFactorial(4));}));
		tests.add(DynamicTest.dynamicTest("TestForPrime", ()->{Assertions.assertTrue(Operations.isPrime(7));}));
		tests.add(DynamicTest.dynamicTest("TestForNull", ()->{Assertions.assertNull(null);}));
		tests.add(DynamicTest.dynamicTest("TestForFalse", ()->{Assertions.assertFalse(12>50);}));
		return tests;
		
	}

}
