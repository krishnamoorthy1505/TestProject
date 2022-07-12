package com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamReduceAccumulatorCombiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = {"abc", "mno", "xyz"};
		List<String> strList = Arrays.asList(strArray);

		System.out.println("stream test");
		int streamResult = strList.stream().reduce(
		        0, 
		        (total,s) -> { System.out.println("accumulator: total[" + total + "] s[" + s + "] s.codePointAt(0)[" + s.codePointAt(0) + "]"); return total + s.codePointAt(0); }, 
		        (a,b) -> { System.out.println("combiner1: a[" + a + "] b[" + b + "]"); return 1000000;}
		    );
		System.out.println("streamResult: " + streamResult);

		System.out.println("parallelStream test");
		int parallelStreamResult = strList.parallelStream().reduce(
		        0, 
		        (total,s) -> { System.out.println("accumulator: total[" + total + "] s[" + s + "] s.codePointAt(0)[" + s.codePointAt(0) + "]"); return total + s.codePointAt(0); }, 
		        (a,b) -> { System.out.println("combiner2: a[" + a + "] b[" + b + "]"); return 1000000;}
		    );
		System.out.println("parallelStreamResult: " + parallelStreamResult);

		System.out.println("parallelStream test2");
		int parallelStreamResult2 = strList.parallelStream().reduce(
		        0, 
		        (total,s) -> { System.out.println("accumulator: total[" + total + "] s[" + s + "] s.codePointAt(0)[" + s.codePointAt(0) + "]"); return total + s.codePointAt(0); }, 
		        (a,b) -> { System.out.println("combiner3: a[" + a + "] b[" + b + "] a+b[" + (a+b) + "]"); return a+b;}
		    );
		System.out.println("parallelStreamResult2: " + parallelStreamResult2);
		

	}

}
