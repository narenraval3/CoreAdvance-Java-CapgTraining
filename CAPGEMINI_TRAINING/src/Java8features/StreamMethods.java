package Java8features;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {

	public static void main(String[] args) {

////////Integer List---------------------------------		
		List<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(55);
		list.add(44);
		list.add(66);
		System.out.println("ArrayList: " +list);
		
////////ForEach--------------------------------
		list.stream().filter(a->a>22).forEach(System.out::println);
			//OR,		
//		Stream<Integer> felist = list.stream();
//		felist.filter(a->a>22).forEach(b->System.out.println(b));
//			//OR,
//		felist.filter(a->a>22).forEach(System.out::println);

////////Using Collect-------------------------------
		List<Integer> cList = list.stream().filter(a->a>33).collect(Collectors.toList());
		System.out.println(cList);
		System.out.println();
		
////////String List------------------------------
		List<String> sList = new ArrayList<>();
		sList.add("Naren");
		sList.add("Nabin");
		sList.add("Naryan");
		sList.add("Hanok");
		sList.add("Harry");
		System.out.println("ArrayList: " +sList);
		
////////Using Collect---------------------------
		List<String> collectList = sList.stream().filter(r->r.length()>5).collect(Collectors.toList());
		System.out.println(collectList);
		
////////map and for Ecah-----------------------
		sList.stream().map(a->a.toUpperCase()).forEach(b->System.out.println(b));
		sList.stream().map(a->a.toLowerCase()).forEach(System.out::println);
	}
}
