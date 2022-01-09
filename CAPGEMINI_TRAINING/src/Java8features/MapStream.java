package Java8features;

import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

public class MapStream {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "Naren");
		map.put(20, "Gourav");
		map.put(30, "Ankit");
		map.put(40, "Vaibhav");
		map.put(50, "Nabin");
		System.out.println("Map: " +map);
		
		Map<Integer, String> kmap = map.keySet().stream().filter(k->k>=30).collect(Collectors.toMap(k->k, k->map.get(k)));
		System.out.println(kmap);
		
		Map<Integer, String> ekmap = map.entrySet().stream().filter(e->e.getKey()>=20).collect(Collectors.toMap(k->k.getKey(), k->k.getValue()));
		System.out.println(ekmap);
		
		Map<Integer, String> evmap = map.entrySet().stream().filter(e->e.getValue().length()>5).collect(Collectors.toMap(k->k.getKey(), k->k.getValue()));
		System.out.println(evmap);
	
		Map<Integer, String> endsWith = map.entrySet().stream().filter(e->e.getValue().endsWith("n")).collect(Collectors.toMap(k->k.getKey(), k->k.getValue()));
		System.out.println(endsWith);
	}
}
