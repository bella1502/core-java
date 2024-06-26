package tnsDay16;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Predicate
		System.out.println("--------Predicate--------");
		Predicate<Integer> p=(n)->n>0;
		Stream<Integer> s=Stream.of(1,7,3,-6,-8,4,-6,0);
		s=s.filter(p);
		s.forEach(System.out::println);  //like for(int n:s) loop
		
		
		//Consumer
		System.out.println("--------Consumer--------");
		Consumer<String> c=(st)->System.out.println(st);
		Stream<String> city=Stream.of("Delhi","Pune","Goa","Bihar");
		city.forEach(c);
		
		
		//Supplier
		System.out.println("--------Supplier--------");
		Supplier<Integer> sup=()->{return (10);};
		System.out.println(sup.get());
		
		Supplier<String> supplier=()->"How are you?";
		System.out.println(supplier.get());
		
		
		//Function
		System.out.println("--------Function--------");
		Function<String ,Integer> getLength=(st)->st.length();
		city=Stream.of("Delhi","Pune","Goa","Bihar");
		s=city.map(getLength);
		s.forEach(System.out::println);
	
		System.out.println("---------------------------");
		s=Stream.of(1,7,3,-6,-8,4,-6,0);
		s=s.map((n)->n*n*n);
		s.forEach(System.out::println);
		
		System.out.println("---------------------------");
		s=Stream.of(1,2,3,4,5,6);
		Function<Integer,Double> squrt=(n)->Math.sqrt(n);
		Stream<Double> sqrlst=s.map(squrt);
		List<Double> sq=sqrlst.collect(Collectors.toList());
		System.out.println(sq);
		
		System.out.println("---------------------------");
		s=Stream.of(10,42,20,22,50,30);
		Optional<Integer> sum=s.reduce((a,b)->a+b);
		if(sum.isPresent())
			System.out.println("Sum of elements is: "+sum);
		
		
		s=Stream.of(10,42,20,22,50,30);
		Optional<Integer> max=s.reduce((a,b)->{
			if(a>b)
				return a;
			else
				return b;
		});
		if(max.isPresent())
			System.out.println("Maximum element is: "+max);
		
		s=Stream.of(10,42,20,22,50,30);
		Optional<Integer> min=s.reduce((a,b)->a<b?a:b);
		if(min.isPresent())
			System.out.println("Minimum element is: "+min);
		
		
		BinaryOperator<Integer> sumfuntion=(a,b)->a+b;
		s=Stream.of(10,42,20,22,50,30);
		sum=s.reduce(sumfuntion);
		if(sum.isPresent())
			System.out.println("Sum is: "+sum.get());
	}

}
