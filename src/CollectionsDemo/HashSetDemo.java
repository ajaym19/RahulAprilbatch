package CollectionsDemo;

import java.util.HashSet;

public class HashSetDemo {

	/*
	 * HashSet:
	 * used to store multiple elements
	 * 
	 * Rules:
	 * 1. Insertion Order is not maintained
	 * 2. Values are stored randomly
	 * 3. Duplicates are not allowed
	 */
	
	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		set.add(101);
		set.add(104);
		set.add(102);
		set.add(112);
		set.add(201);
		set.add(201);
		System.out.println(set);
		System.out.println();
		
		
	}
}
