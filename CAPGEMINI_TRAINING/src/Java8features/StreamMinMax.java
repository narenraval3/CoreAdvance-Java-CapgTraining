package Java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.*;
import java.util.stream.Collectors;

public class StreamMinMax {

	private static final Stream<Integer> Collectors = null;

	public static void main(String[] args) {
		
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(11);
		lst.add(55);
		lst.add(44);
		lst.add(66);
		lst.add(22);
		lst.add(33);
		
		System.out.println("ArrayList: " +lst);
		
////////Max Min-----------------------------------
		int max = lst.stream().max((a,b)->a.compareTo(b)).get();
		System.out.println("MAX: " +max);
		int min = lst.stream().min((a,b)->a.compareTo(b)).get();
		System.out.println("MIN: " +min);
		//OR,
		System.out.println(lst.stream().max((a,b)->a.compareTo(b)));
		System.out.println(lst.stream().min((a,b)->a.compareTo(b)));

////////To sort-------------------------------
//		List<Integer> sAc = lst.stream().sorted((a,b)->a.compareTo(b)).collect(Collectors.toList());
//		System.out.println(sAc);
//		List<Integer> sDc = lst.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
//		System.out.println(sDc);
	}

}
