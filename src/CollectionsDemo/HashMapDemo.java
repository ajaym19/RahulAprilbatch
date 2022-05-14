package CollectionsDemo;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	/*
	 * HashMap:
	 * it is not a part of Collections framework
	 * It is extending Map Interface
	 * 
	 * We store key and value
	 * a key and value together is called as pair/bucket/entry
	 * multiple pairs/entries together is called as Entry Set
	 * 
	 * Rules:
	 * 1. Duplicate values are allowed
	 * 2. Multiple Null values are allowed
	 * 3. Keys are unique, If we try to add duplicate keys, it will work as an Update
	 * 4. Only one null key is allowed
	 */
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Ajay");
		map.put(2, "Devesh");
		map.put(3, null);
		map.put(4, null);
		map.put(2, "Raj");
		map.put(null, "Akash");
		map.put(null, "Prithvi");
		System.out.println(map);
		map.putIfAbsent(100, "Rajubhai");
		System.out.println(map);
		
		//map.clear();
		//map.isEmpty();
		System.out.println(map.containsKey(22));
		System.out.println(map.containsValue("Ra232j"));
		System.out.println(map.keySet());
		//return type of keyset() method?
		//can array list contain duplicates?
		map.remove(2);
		System.out.println(map);
		map.replace(101, "Hello");
		System.out.println(map);
		//diff between replace and putifabsent
		
		//print each value
		
		for(Entry<Integer, String> a : map.entrySet() ) {
			System.out.println("Key is "+a.getKey()+" Value is "+a.getValue());
			
		}
		
		
		
		
		
	}
}
