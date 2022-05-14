package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	/*
	 * ArrayList; used to store multiple elements internal working is same as Array
	 * 
	 * but the size is dynamic
	 * 
	 * Addition update delete
	 * 
	 * Rules:
	 * 1. Insertion Order is maitained 2.
	 * 2. Duplicates are allowed
	 * 3. No default Sorting
	 */

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);

		list.add(10);
		list.add(110);
		list.add(20);
		list.add(50);
		list.add(4);
		list.add(4000);
		list.add(4000);
		System.out.println(list);

		// get single element
		System.out.println(list.get(2)); // 20

		list.set(3, 101);
		System.out.println(list);

		list.remove(2);
		System.out.println(list);

		list.add(1, 22);
		System.out.println(list);

		// add all the elements of one list to my list
		ArrayList<Integer> abc = new ArrayList<>();
		abc.add(91);
		abc.add(92);
		abc.add(93);
		System.out.println(abc);

		list.addAll(abc);
		System.out.println(list);

		// print all elements
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// for each
		for (int a : list) {
			System.out.println(a);
		}

		// methods
		System.out.println("Is List Empty?" + list.isEmpty());
		// list.clear();
		System.out.println("Is List Empty?" + list.isEmpty());
		System.out.println(list);
		System.out.println(list.contains(93));
		System.out.println(list.indexOf(93));
		System.out.println("Size is " + list.size());

		Collections.sort(list);
		System.out.println(list);

//	Convert an arraylist to array
		// convert an array to arraylist

	}
}
