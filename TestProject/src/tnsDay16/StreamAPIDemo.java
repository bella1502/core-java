package tnsDay16;

import java.util.stream.Collector;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> numStream=Stream.of(1,3,5,3,2,7,8,5,7,0,1);
		System.out.println("total value: "+numStream.count());
		
		
		//count
		numStream=Stream.of(1,3,5,3,2,7,8,5,7,0,1);
		Stream<Integer> s=numStream.distinct();
		long cnt=s.count();
		System.out.println("total distint value: "+cnt);
		
		//skip
		numStream=Stream.of(1,3,5,3,2,7,8,5,7,0,1);
		cnt=numStream.skip(7).count();
		System.out.println("total value after skipping 3: "+cnt);
		
		
		//limit
		numStream=Stream.of(1,3,5,3,2,7,8,5,7,0,1);
		numStream=numStream.limit(5);
		System.out.println("total count of limit(5): "+numStream.count());
		
		//terminal operation
		
	}

}
