package tnsDay16;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]= {10,64,89,55,33,9,90,22,40,54,22};
		Stream<Integer> s=Arrays.stream(a);
		
		//fetch even no
		System.out.println("-------even no--------------");
		Stream<Integer> evennum=s.filter((n)->n%2==0);
		evennum.forEach(System.out::println);
		
		
		//fetch no greater than 50
		System.out.println("--------num greater than 50----------");
		s=Arrays.stream(a);
		Stream<Integer> great=s.filter((n)->n>50);
		great.forEach(System.out::println);
		
		
		//filter using predicate
		System.out.println("----------filter using predicate(odd num)----------");
		s=Arrays.stream(a);
		Predicate<Integer> oddp=(n)->n%2!=0;
		s=s.filter(oddp);
		s.forEach(System.out::println);
		
		
		System.out.println("-----------predicate with string stream-------------");
		String []cities= {"Bihar","Pune","Delhi","Mumbai","Nashik"};
		Stream<String> cityStream=Arrays.stream(cities);
		Predicate<String> endwith=(n)->n.endsWith("i");
		cityStream=cityStream.filter(endwith);
		cityStream.forEach(System.out::println);
	}

}
